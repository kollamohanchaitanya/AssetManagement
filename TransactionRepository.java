package com.example.assetmanagement.repository;

import com.example.assetmanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
