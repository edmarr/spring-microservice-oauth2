package br.com.tcc.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy
@EnableDiscoveryClient
public class ZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullApplication.class, args);
	}
}