package com.smartcity.consumeBinanceRestApi;

import com.smartcity.consumeBinanceRestApi.entity.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeBinanceRestApiApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeBinanceRestApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeBinanceRestApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) { return builder.build(); }

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			ResponseEntity<Trade[]> response = restTemplate.getForEntity(
					"https://api.binance.com/api/v3/trades?symbol=LTCBTC",
					Trade[].class
			);
			Trade[] trades = response.getBody();
			for (Trade trade: trades) {
				log.info(trade.toString());
			}
		};
	}

}
