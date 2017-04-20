package com.nab.termdeposit.controllers;

import com.nab.termdeposit.dto.TermDepositRatesResponse;
import com.nab.termdeposit.service.GetPricingRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TermDepositController {

    @Autowired
    private GetPricingRateService service;

    @RequestMapping("/")
    String index(){
        return "index";
    }

    @RequestMapping(value = "/pricingRate/account/{accountId}",method = RequestMethod.GET)
    public TermDepositRatesResponse getTermDepositRates(@PathVariable String accountId) {
        System.out.println("Avis "+ accountId);

        return service.getPricingRates(accountId);

    }
}
