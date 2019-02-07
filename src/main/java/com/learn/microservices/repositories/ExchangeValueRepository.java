package com.learn.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.microservices.entities.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
