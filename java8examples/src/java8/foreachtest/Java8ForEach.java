package java8.foreachtest;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEach {

	public static void main(String[] args)
    {
        //Create a new ArrayList
        List<String> countryList = new ArrayList();
        
        //Add elements to the countryList
        countryList.add("India");
        countryList.add("England");
        countryList.add("Australia");
        countryList.add("Japan");
        
        //iterate through list in Java 8 using forEach Lambda Expression
        countryList.forEach(country->System.out.println(country));
        
        System.out.println("---------------");
        //iterate through list in Java 8 using forEach method reference
        
        countryList.forEach(System.out::println);
    }
}
