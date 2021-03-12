package currency.convert.servicecurrency.convertservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("currency.convert.servicecurrency.resources")
public class ServiceCurrencyConvertServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCurrencyConvertServiceApplication.class, args);
	}

}
