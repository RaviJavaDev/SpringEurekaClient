package com.cloud.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreInfoController {

	@RequestMapping(value = "/getstoreinfo")
	public String getStoreInfo() {

		return "Mumbai,Kolkata,Pune,Aurangabad";
	}
}
