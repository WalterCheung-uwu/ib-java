/*
 * ArrayDemo.java
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


public class ArrayDemo {
	
	public static void printArray(int[] a){
		if(a.length > 0){
			for(int i = 0; i < a.length; i++){	
				System.out.println("[" + i + "]" + a[i]);
			}
		}
	}
	
	public static void main (String[] args) { 
		int[] numbers; 					//declaration
		numbers = new int[10]; 			//initialisation
		if(numbers != null){
			printArray(numbers);
			} else{
				System.out.println("nothing inside of numbers array");
				}
	}
}

