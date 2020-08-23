package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dao.CarPartsInventory;
import com.lti.entity.CarPart;

@Controller
public class CarPartsController {

	@Autowired
	private CarPartsInventory carPartsInventory;
	
	@RequestMapping("/viewCartsPart.lti")
	public String getCrParts(Map<String, Object> model) {
		List<CarPart> carParts = carPartsInventory.getAvailableParts();
		model.put("listOfCarParts", carParts);
		System.out.println(carParts);
		return "viewCarParts.jsp";
	}
	
	
	
	@RequestMapping(path="/addCarPart.lti", method = RequestMethod.POST)
	public String addCarPart(CarPart carPart, Map<String, Object> model) {
		carPartsInventory.addNewPart(carPart);
		model.put("status", "Record added successfully");
		return "addCartPart.jsp";
	}
}
