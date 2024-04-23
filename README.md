# oracle-technical-challenge
oracle-technical-challenge

Steps to Run Java Application:

1. Go to Main Class(OutputReport.java) and right click to Run As Java Application.
2. Provide your multiline Input String in the console and press Enter.
	Eg. - 
	2343225,2345,us_east,RedTeam,ProjectApple,3445s
	1223456,2345,us_west,BlueTeam,ProjectBanana,2211s
	3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s
	1233456,2345,us_west,BlueTeam,ProjectDate,2221s
	3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s

3. Press Ctrl+Z on windows Ctrl+D on MAC to finish providing input.
4. You will see the output as follows:

	noOfUniqueCustomerIdGivenContractId{2346=2, 2345=3}
	noOfUniqueCustomerIdGivenGeozone{eu_west=2, us_west=2, us_east=1}
	averageBuildDurationForGeozone{eu_west=4222.0, us_west=2216.0, us_east=3445.0}
	listOfUniqueCustomerIdGivenGeozone{eu_west=[3244332, 3244132], us_west=[1223456, 1233456], us_east=[2343225]}


Steps to Run JUnit Test:

1. Go to Test Class(CustomerServiceTest.java) and right click to Run As JUnit.
