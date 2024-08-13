package com.example.demospringboot3.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonS3Config {

    @Bean
    public AmazonS3 amazonS3(){
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(

                System.getenv("AWS_ACCESS_KEY_ID_DEV"),
                System.getenv("AWS_SECRET_ACCESS_KEY_DEV")
        );

        return AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1)
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
