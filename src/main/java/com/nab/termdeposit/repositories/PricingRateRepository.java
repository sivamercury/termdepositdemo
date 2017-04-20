package com.nab.termdeposit.repositories;

import com.nab.termdeposit.domain.PricingRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PricingRateRepository  extends JpaRepository<PricingRate, Integer> {

    public List<PricingRate> findByAccountId(String accountId);
}
