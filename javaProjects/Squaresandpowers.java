/*
 * Squares&Powers.java
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


public class Squaresandpowers {
	
	public static void main (String[] args) {
		
		IBIO.output("Walter Cheung");
			int x = 1;
			int number = IBIO.inputInt("Enter a number: ");
			while(number < 0)
			number = IBIO.inputInt("Error: Select a positive number: ");
			
			for(int i = 0; i < number; i++)
	
		{	IBIO.output(x + " " + (x * x));
			x = (x + 1);
			}
	}
}

