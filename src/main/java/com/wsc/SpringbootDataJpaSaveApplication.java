package com.wsc;

import com.wsc.common.SimpleJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value = "com.wsc.dao", repositoryBaseClass = SimpleJpaRepositoryImpl.class)
public class SpringbootDataJpaSaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDataJpaSaveApplication.class, args);
    }

}
