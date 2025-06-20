package pl.pjatk.nbp_currency_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.nbp_currency_app.service.CurrencyService;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

//    @GetMapping("/{currency}")
//    public ResponseEntity<Integer> getAverageRate(String currency) {
////        Integer averageRate = CurrencyService
//        Integer averageRate = 0;
//
//        return ResponseEntity.ok(new AverageRateResponse(averageRate));
//    }

    @GetMapping("/{currency}")
    public ResponseEntity<Integer> getAverageRate(@PathVariable String currency, @RequestParam(defaultValue = "1") Integer days) {
        return ResponseEntity.ok(currencyService.getAverageExchangeRate(currency, days));
    }

}
