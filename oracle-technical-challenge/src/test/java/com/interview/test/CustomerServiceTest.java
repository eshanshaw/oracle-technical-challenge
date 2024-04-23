package com.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.interview.Customer;
import com.interview.CustomerService;
import com.interview.CustomerUtil;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

	static List<Customer> customers= new ArrayList<>();
	
	@Mock
	CustomerUtil customerUtil;
	
	@InjectMocks
	CustomerService customerService;
	
	@BeforeAll
	static void setup() {
		List<String> inputList = Arrays.asList("2343225,2345,us_east,RedTeam,ProjectApple,3445s",
				"1223456,2345,us_west,BlueTeam,ProjectBanana,2211s",
				"3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s",
				"1233456,2345,us_west,BlueTeam,ProjectDate,2221s",
				"3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s");	 
		customers = CustomerUtil.convertStringToObjectList(inputList);
	}
	
	
	
	@Test
	public void noOfUniqueCustomerIdGivenContractIdTest() {
		Map<String,Long> s= customerService.noOfUniqueCustomerIdGivenContractId(customers);
		Assert.assertEquals(2,s.size());
		Assert.assertEquals(true,s.containsKey("2345"));
		Assert.assertEquals(true,s.containsKey("2346"));
		Assert.assertEquals("3", s.get("2345").toString());
		Assert.assertEquals("2",s.get("2346").toString());
	}

	@Test
	public void noOfUniqueCustomerIdGivenGeozoneTest() {
		Map<String,Long> s= customerService.noOfUniqueCustomerIdGivenGeozone(customers);
		Assert.assertEquals(3,s.size());
		Assert.assertEquals(true,s.containsKey("eu_west"));
		Assert.assertEquals(true,s.containsKey("us_west"));
		Assert.assertEquals(true,s.containsKey("us_east"));
		Assert.assertEquals("2", s.get("eu_west").toString());
		Assert.assertEquals("2",s.get("us_west").toString());
		Assert.assertEquals("1",s.get("us_east").toString());
	}

	@Test
	public void averageBuildDurationForGeozoneTest() {
		Map<String,Double> s= customerService.averageBuildDurationForGeozone(customers);
		Assert.assertEquals(3,s.size());
		Assert.assertEquals(true,s.containsKey("eu_west"));
		Assert.assertEquals(true,s.containsKey("us_west"));
		Assert.assertEquals(true,s.containsKey("us_east"));
		Assert.assertEquals("4222.0", s.get("eu_west").toString());
		Assert.assertEquals("2216.0",s.get("us_west").toString());
		Assert.assertEquals("3445.0",s.get("us_east").toString());
	}

	@Test
	public void listOfUniqueCustomerIdGivenGeozoneTest() {
		Map<String,List<String>> s= customerService.listOfUniqueCustomerIdGivenGeozone(customers);
		Assert.assertEquals(3,s.size());
		Assert.assertEquals(true,s.containsKey("eu_west"));
		Assert.assertEquals(true,s.containsKey("us_west"));
		Assert.assertEquals(true,s.containsKey("us_east"));
		Assert.assertEquals("[3244332, 3244132]", s.get("eu_west").toString());
		Assert.assertEquals("[1223456, 1233456]",s.get("us_west").toString());
		Assert.assertEquals("[2343225]",s.get("us_east").toString());
	}

}
