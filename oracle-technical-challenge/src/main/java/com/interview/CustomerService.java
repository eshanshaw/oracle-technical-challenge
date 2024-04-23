package com.interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService {
	
	//The number of unique customerId for each contractId 
	public Map<String,Long> noOfUniqueCustomerIdGivenContractId(List<Customer> input) {
		
	Map<String,Long> s	=input.stream()
			.collect(Collectors.groupingBy(Customer::getContractId,Collectors.counting()));
	return s;
		
	}
	
	//The number of unique customerId for each geozone
	public Map<String,Long> noOfUniqueCustomerIdGivenGeozone(List<Customer> input) {
		
		Map<String,Long> s	=input.stream()
				.collect(Collectors.groupingBy(Customer::getGeozone,Collectors.counting()));
		return s;
			
		}
	
	//The average buildduration for each geozone
	public Map<String,Double>  averageBuildDurationForGeozone(List<Customer> input){
		 
		 Map<String,Double> s	=input.stream()
					.collect(Collectors.groupingBy(Customer::getGeozone,
							Collectors.averagingDouble(Customer::getDurationValue)));
			return s;
		
	}
	
	//The list of unique customerId for each geozone
	public Map<String,List<String>> listOfUniqueCustomerIdGivenGeozone(List<Customer> input) {
		
		Map<String,List<String>> s	=input.stream()
				.collect(Collectors.groupingBy(Customer::getGeozone,Collectors.mapping(Customer::getCustomerId,Collectors.toList())));
		
		return s;
	
	}

}
