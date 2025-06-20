package pl.pjatk.nbp_currency_app.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private static final String NBP_API_URL = "http://api.nbp.pl/api/exchangerates/rates/a/{currency}/{topCount}/?format=json";

    public CurrencyService() {}

    public Integer getAverageExchangeRate(String currency, int days) {

    }
}
