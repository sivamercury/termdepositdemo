package com.nab.termdeposit.repositories;

import com.nab.termdeposit.SpringBootWebApplication;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;

import static org.junit.Assert.*;

@SpringApplicationConfiguration(classes = SpringBootWebApplication.class)
public class PricingRateRepositoryTest {
    @Autowired
    private PricingRateRepository repository;

    @Test
    public void findByAccountId() throws Exception {
        int size = repository.findByAccountId("2123").size();
        System.out.print(size);
    }

}