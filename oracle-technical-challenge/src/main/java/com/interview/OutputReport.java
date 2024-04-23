package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OutputReport {

	public static void main(String[] args) throws Exception{
		
		List<String> inputList = new ArrayList<>();
		System.out.println("Please press Enter after your input");
		Scanner s = new Scanner(System.in);
		try {
			while(s.hasNextLine()) {
				String str = s.nextLine();
				inputList.add(str);
			}			
		}finally {
			s.close();
		}	

		List<Customer> customers = CustomerUtil.convertStringToObjectList(inputList);
		CustomerService customerService = new CustomerService();
		
		try {
			System.out.println("");
			Map<String,Long> noOfUniqueCustomerIdGivenContractId = customerService.noOfUniqueCustomerIdGivenContractId(customers);
			System.out.println("noOfUniqueCustomerIdGivenContractId" + noOfUniqueCustomerIdGivenContractId);
			
			Map<String,Long> noOfUniqueCustomerIdGivenGeozone = customerService.noOfUniqueCustomerIdGivenGeozone(customers);
			System.out.println("noOfUniqueCustomerIdGivenGeozone" + noOfUniqueCustomerIdGivenGeozone);
			
			Map<String,Double> averageBuildDurationForGeozone = customerService.averageBuildDurationForGeozone(customers);
			System.out.println("averageBuildDurationForGeozone" + averageBuildDurationForGeozone);
			
			Map<String,List<String>> listOfUniqueCustomerIdGivenGeozone = customerService.listOfUniqueCustomerIdGivenGeozone(customers);
			System.out.println("listOfUniqueCustomerIdGivenGeozone" + listOfUniqueCustomerIdGivenGeozone);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

