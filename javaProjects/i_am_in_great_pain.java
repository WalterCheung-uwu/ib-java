/*
 * i_am_in_great_pain.java
 * 
 * Copyright 2023 Walte <Walte@BLUEBERRY>
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


public class i_am_in_great_pain {
	
	public static void printArray (int[] array){
		if(array.length > 0){
			for(int index = 0; index < array.length; index++){
				array[index] = IBIO.inputInt("print array " + "#" + (index + 1) + ": ");
				}
				for(int index2 = 0; index2 < array.length; index2++){
				System.out.println("[" + index2 + "]" + array[index2]);
				}
			}
			else{
				System.out.println("no array? *insert megamind face meme*");
				}
		}
		
		
	public static double averageArray (int[] array){
		double average = 0;
		for(int index = 0; index < array.length; index++){
			average = average + array[index];
			}
			average = average / array.length;
			return average;
		}
	
	
	public static void main (String[] args) {
		int x = IBIO.inputInt("Array number: ");
		System.out.println("");
		int[] number = new int[x];
		printArray(number);	
		double average = averageArray(number);
		System.out.println("average = " + average);
	}
}

