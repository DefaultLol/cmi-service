package com.app;

import com.app.entity.Form;
import com.app.services.FormService;
import com.app.utils.PopulateDB;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableFeignClients
@EnableScheduling
public class AppApplication {

    @Autowired @Qualifier("clientJob") private Job clientCreationJob;
    @Autowired @Qualifier("paymentJob") private Job paymentJob;
    @Autowired JobLauncher jobLauncher;
    @Autowired FormService formService;
    @Autowired private PopulateDB populateDB;

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /*@Bean
    CommandLineRunner start(){
        return args -> {
            populateDB.populateCreancier();
        };
    }*/

    //@Scheduled(cron = "0 21 16 * * ?")
    public void createClientJob() throws Exception{
        JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        jobLauncher.run(clientCreationJob, params);
    }

    public void paymntJob() throws Exception{
        JobParameters params = new JobParametersBuilder()
                .addString("JobID", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        jobLauncher.run(paymentJob, params);
    }

}
