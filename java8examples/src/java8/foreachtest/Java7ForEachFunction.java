package java8.foreachtest;

import java.util.ArrayList;
import java.util.List;

public class Java7ForEachFunction {

	public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        
        //Add elements to the countryList
        countryList.add("India");
        countryList.add("England");
        countryList.add("Australia");
        countryList.add("Japan");
        
        //iterate through list in java
        for (String country : countryList)
        {
            System.out.println(country);
        }
	}

}
