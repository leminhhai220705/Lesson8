package Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		String[] clubs = {"MU", "ManCity", "Liverpool"};   //Initialize the new array and assign the values into this array
		clubs[0] = "Arsenal";
		System.out.println("run here " + Arrays.toString(clubs));
		System.out.println("run here with length " + clubs.length);
		System.out.println("First element: " + clubs[0]);
		System.out.println("First element: " + clubs[1]);
		
		System.out.println();
		
		String [] a = new String[5];   //Initialize the new array, use "new"
		a[0] = "1";
		System.out.println("Test the new array: " + a[0]);
		
		System.out.println();
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
	}

}
