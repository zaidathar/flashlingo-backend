package com.zaidathar.springvaultconfig;

import com.zaidathar.springvaultconfig.model.Credential;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
@Slf4j
public class SpringVaultConfigApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultConfigApplication.class, args);
	}

}
