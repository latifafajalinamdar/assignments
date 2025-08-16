package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment7_ArraysandCollections {

	public static void main(String[] args) 
	{
		   // Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4thcities combined.
        List<Double> cityAreas = new ArrayList<>();

        // Add the areas of the top 5 largest cities (example values)
        cityAreas.add(12000.0); // 1st largest city area
        cityAreas.add(9500.0);  // 2nd largest city area
        cityAreas.add(8000.0);  // 3rd largest city area
        cityAreas.add(7200.0);  // 4th largest city area
        cityAreas.add(6000.0);  // 5th largest city area
        
        System.out.println(cityAreas.size());

        // Ensure there are at least 4 cities in the list for indices 2 and 3
        if (cityAreas.size() >= 4) {
            // Get the area of the 3rd city (index 2 in a 0-indexed list)
            double thirdCityArea = cityAreas.get(2);

            // Get the area of the 4th city (index 3 in a 0-indexed list)
            double fourthCityArea = cityAreas.get(3);

            // Calculate the total combined area
            double combinedArea = thirdCityArea + fourthCityArea;

            // Print the total combined area
            System.out.println("Combined area of the 3rd and 4th largest cities: " + combinedArea + " sq km");
        } else {
            System.out.println("Insufficient number of cities in the list to calculate the combined area of the 3rd and 4th cities.");
        }
        
        
        //Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
        
        
        Set<String>mostvisitedtourist=new HashSet<String>();
        
        mostvisitedtourist.add("Italy");
        mostvisitedtourist.add("France");
        mostvisitedtourist.add("Agra");
        mostvisitedtourist.add("Mumbai");
        mostvisitedtourist.add("Pune");
        mostvisitedtourist.add("NewYork");
        mostvisitedtourist.add("Rom");
        mostvisitedtourist.add("Vatican City");
        mostvisitedtourist.add("Jaipur");
        mostvisitedtourist.add("Goa");
        
        System.out.println("Total size is "+mostvisitedtourist.size());
        
        for(String str:mostvisitedtourist)
        {
        	System.out.println(str);
        }
        
      //Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
        
        int[]array=new int[10];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        array[5]=60;
        array[6]=70;
        array[7]=80;
        array[8]=90;
        array[9]=100;
        
        int fifthValue = array[4];
        int sixthValue = array[5];

        // Calculate the average
        double average = (double) (fifthValue + sixthValue) / 2;
        System.out.println("Average is "+average);
        
        //Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
        
        List<String>highestGrossingMovies=new LinkedList<String>();
        
        highestGrossingMovies.add("Coolie");
        highestGrossingMovies.add("Dhadak2");
        highestGrossingMovies.add("Bahubali");
        highestGrossingMovies.add("Kantara");
        highestGrossingMovies.add("Dhol");
        
        System.out.println(highestGrossingMovies.size());
        
        //print out the third movie on the list.
        System.out.println(highestGrossingMovies.get(2));
        
        
	}

}
