package com.interview;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtil {

	public static List<Customer> convertStringToObjectList(List<String> inputList){
		List<Customer> customers= new ArrayList<>();
		for(String str : inputList) {
			String[] inputArray = str.split(",");
			Customer c = new Customer();
			c.setCustomerId(inputArray[0]);
			c.setContractId(inputArray[1]);
			c.setGeozone(inputArray[2]);
			c.setTeamcode(inputArray[3]);
			c.setProjectcode(inputArray[4]);
			c.setBuildduration(inputArray[5]);
			customers.add(c);
		}
		return customers;
	}
}
