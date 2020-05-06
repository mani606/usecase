package com.slot.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.slot.entity.Employee;



@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	  @Autowired
	  public JobBuilderFactory jobBuilderFactory;

	  @Autowired
	  public StepBuilderFactory stepBuilderFactory;
	  
	  @Autowired
	  DataSource datasource;
	  
	  @Bean
	  public FlatFileItemReader<Employee> reader() {
	    return new FlatFileItemReaderBuilder<Employee>()
	      .name("UserItemReader")
	      .resource(new ClassPathResource("employee.csv"))
	      .delimited()
	      .names(new String[]{"employeeName","email","phoneNumber","designation","yearsOfExperience"})
	      .fieldSetMapper(new BeanWrapperFieldSetMapper<Employee>() {{
	        setTargetType(Employee.class);
	      }})
	      .build();
	  }

	  @Bean
	  public MenuItemProcessor processor() {
	    return new MenuItemProcessor();
	  }

	  @Bean
	  public JdbcBatchItemWriter<Employee> writer(DataSource dataSource) {
	    return new JdbcBatchItemWriterBuilder<Employee>()
	      .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
	      .sql("INSERT INTO slot (employeeName,email,phoneNumber,designation,yearsOfExperience) VALUES (:employeeName,:email,:phoneNumber,:designation,:yearsOfExperience)")
	      .dataSource(dataSource)
	      .build();
	  }
	  
	  @Bean
	  public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
	    return jobBuilderFactory.get("importUserJob")
	      .incrementer(new RunIdIncrementer())
	      .listener(listener)
	      .flow(step1)
	      .end()
	      .build();
	  }

	  @Bean
	  public Step step1(JdbcBatchItemWriter<Employee> writer) {
	    return stepBuilderFactory.get("step1")
	      .<Employee, Employee> chunk(10)
	      .reader(reader())
	      .processor(processor())
	      .writer(writer)
	      .build();
	  }


}