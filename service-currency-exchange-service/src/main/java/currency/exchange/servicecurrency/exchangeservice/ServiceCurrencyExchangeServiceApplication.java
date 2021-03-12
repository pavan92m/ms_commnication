package currency.exchange.servicecurrency.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("currency.exchange.servicecurrency.resources")
@EnableFeignClients
public class ServiceCurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCurrencyExchangeServiceApplication.class, args);
	}

}
