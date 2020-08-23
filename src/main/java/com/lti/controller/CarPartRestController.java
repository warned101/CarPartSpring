package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.CarPartsInventory;
import com.lti.entity.CarPart;

@RestController
@CrossOrigin
public class CarPartRestController {

	@Autowired
	private CarPartsInventory carPartsInventory;
	
	@RequestMapping(path = "/viewCartsPart.api", method = RequestMethod.GET, produces = "application/json")
	public List<CarPart> getCarParts() {
		List<CarPart> carParts = carPartsInventory.getAvailableParts();
		System.out.println(carParts);
		return carParts;
	}
	
	
	
	@RequestMapping(path="/addCarPart.api", method = RequestMethod.POST, consumes = "application/json", produces="application/json")
	public Status addCarPart(@RequestBody CarPart carPart) {
		carPartsInventory.addNewPart(carPart);
		Status status = new Status();
		status.setMessage("Record added successfully");
		return status;
	}
	
	public static class Status {
		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	
	}
	
}
