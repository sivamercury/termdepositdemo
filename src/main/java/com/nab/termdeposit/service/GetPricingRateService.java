package com.nab.termdeposit.service;


import com.nab.termdeposit.domain.PricingRate;
import com.nab.termdeposit.dto.TermDepositRate;
import com.nab.termdeposit.dto.TermDepositRatesResponse;
import com.nab.termdeposit.repositories.PricingRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class GetPricingRateService {

    @Autowired
    private PricingRateRepository repository;

    public TermDepositRatesResponse getPricingRates(String accountId) {

        List<TermDepositRate> termDepositRates = new LinkedList<>();

       List<PricingRate> pricingRates =  repository.findByAccountId(accountId);
        System.out.println("Avis1 "+ pricingRates.size());
        for (PricingRate rate:pricingRates) {
            TermDepositRate termDepositRate = new TermDepositRate();
            termDepositRate.setTerm(rate.getTerm());
            termDepositRate.setMinRate(rate.getMinRate());
            termDepositRate.setMaxRate(rate.getMaxRate());
            termDepositRates.add(termDepositRate);
        }

        TermDepositRatesResponse response = new TermDepositRatesResponse();
        response.setTermDepositRates(termDepositRates);
        return response;
    }
}
