package currency.exchange.servicecurrency.exchangeservice;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Headers;


@Headers("Content-Type: application/json")
@FeignClient(name = "restclient-service", url = "http://localhost:8080")
public interface RestClientService {
	@RequestMapping(value = "/app2/amount", method = RequestMethod.POST)
	BigDecimal calculate(@RequestBody BigDecimal amount);
	

}
