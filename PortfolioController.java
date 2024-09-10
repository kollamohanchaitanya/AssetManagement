package com.example.assetmanagement.controller;

import com.example.assetmanagement.model.Portfolio;
import com.example.assetmanagement.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping
    public ResponseEntity<List<Portfolio>> getAllPortfolios() {
        return ResponseEntity.ok(portfolioService.getAllPortfolios());
    }

    @PostMapping
    public ResponseEntity<Portfolio> createPortfolio(@RequestBody Portfolio portfolio) {
        return ResponseEntity.ok(portfolioService.savePortfolio(portfolio));
    }

    @PutMapping("/{id}/calculate")
    public ResponseEntity<Portfolio> calculatePortfolioValue(@PathVariable Long id) {
        Portfolio portfolio = portfolioService.calculatePortfolioValue(portfolioService.getAllPortfolios().stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null));
        return ResponseEntity.ok(portfolioService.savePortfolio(portfolio));
    }
}
