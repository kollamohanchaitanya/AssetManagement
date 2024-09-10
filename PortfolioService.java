package com.example.assetmanagement.service;

import com.example.assetmanagement.model.Portfolio;
import com.example.assetmanagement.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

    public Portfolio savePortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public Portfolio calculatePortfolioValue(Portfolio portfolio) {
        // Ensure Portfolio class has a method getAssets() returning List<Asset> and setTotalValue(double)
        double totalValue = portfolio.getAssets().stream()
                .mapToDouble(asset -> asset.getValue())
                .sum();
        portfolio.setTotalValue(totalValue);
        return portfolio;
    }
}
