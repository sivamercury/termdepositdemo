package com.nab.termdeposit.dto;


import java.util.List;

public class TermDepositRatesResponse {

    public List<TermDepositRate> getTermDepositRates() {
        return termDepositRates;
    }

    public void setTermDepositRates(List<TermDepositRate> termDepositRates) {
        this.termDepositRates = termDepositRates;
    }

    private List<TermDepositRate> termDepositRates;
}
