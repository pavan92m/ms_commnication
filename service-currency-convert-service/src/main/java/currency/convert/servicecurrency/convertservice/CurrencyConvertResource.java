package currency.convert.servicecurrency.convertservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class CurrencyConvertResource {
	@RequestMapping(value = "/amount", method = RequestMethod.POST)
    public BigDecimal calculate(@RequestBody BigDecimal amount) {
		BigDecimal indianAmount = amount.multiply(new BigDecimal(73));
        return indianAmount;
    }

}
