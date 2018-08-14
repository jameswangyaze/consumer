package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());


	public void doSomeWork() {
		logger.info("Doing some work in service level");
	}
}
