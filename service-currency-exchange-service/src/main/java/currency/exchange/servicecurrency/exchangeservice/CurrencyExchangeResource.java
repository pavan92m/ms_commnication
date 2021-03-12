package currency.exchange.servicecurrency.exchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class CurrencyExchangeResource {
	@Autowired
	RestClientService restClientService;

	@RequestMapping(value = "/fromcountry/{fromcountry}/fromcountry/{tocountry}/currency/{currency}", method = RequestMethod.GET)
	public BigDecimal calculateCurrencyConversion(@PathVariable("fromcountry") String fromcountry,
			@PathVariable("tocountry") String tocountry, @PathVariable("currency") String currency) {
		System.out.println("tocountry "+tocountry);
		if(fromcountry.equals("us") && tocountry.equals("ind")){
			BigDecimal amount = new BigDecimal(currency);
			System.out.println(currency);
			System.out.println("This is amount" + amount);
			return restClientService.calculate(amount);
		}
		return new BigDecimal(0);

	}

}
