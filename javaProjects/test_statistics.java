/*
 * test_statistics.java
 * 
 * Copyright 2022 Walte <Walte@BLUEBERRY>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class test_statistics {
	
	public static void main (String[] args) {
		double number;
		System.out.println("Walter Cheung");
		double x = IBIO.inputDouble("How many numbers to process? ");
		while(x < 3)
		{	System.out.println("");
			System.out.println("Error, please input at least 3 numbers");
			x = IBIO.inputDouble("How many numbers to process? ");
		}
		System.out.println("");
		double sum = 0;
		double largest = 0;
		double smallest = 2144967296;
		double even = 0;
		double odd = 0;
		for(int i = 0; i < x; i++) {
			number = IBIO.inputDouble("Enter Number: ");
			sum = sum + number;	
			if(largest < number)
			largest = number;
			if(smallest > number)
			smallest = number;
			if(number%2 == 0)
			even = even + 1;
			if(number%2 != 0)
			odd = odd + 1;
			}
		System.out.println("");
		System.out.println("Minimum: " + smallest);
		System.out.println("Maximum: " + largest);
		System.out.println("Range: " + (largest - smallest));
		System.out.println("Average: " + sum/x);
		System.out.println("Evens: " + even);
		System.out.println("Odds: " + odd);
		
	}
}
