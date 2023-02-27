/*
 * stoopid.java
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


public class stoopid {
	
	public static void main (String[] args) {
		
		IBIO.output("Walter Cheung");
			int n = 1;
			int x = IBIO.inputInt("input a positive number less than 10: ");
			while(x >= 10)
		{	IBIO.output("Error: " + x + " is not less than 10.");
			x = IBIO.inputInt("Try again: ");
			IBIO.output(" ");
			
			while(x <= 0)
		{	IBIO.output("Error: " + x + " is not a positive number.");
			x = IBIO.inputInt("Try again: ");
			IBIO.output(" ");
			}
		}
			int c = (n * n * n);
			for(int i = 0; i < x; i++)
		{	IBIO.output(n + " " + (n * n) + " " + c);
			n = (n + 1);
			}
			
	}
}

