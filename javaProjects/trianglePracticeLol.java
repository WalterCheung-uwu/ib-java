/*
 * trianglePracticeLol.java
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


public class trianglePracticeLol {
	
	public static void main (String[] args) {
		int num = 1;
		
		System.out.println("Walter");
		System.out.println("");
		int n = IBIO.inputInt("term n? ");
		while(n < 0)
		{	System.out.println("Error, please input a positive interger ");
			System.out.println("");
			n = IBIO.inputInt("term n? ");
			}
		for(int i = 0; i < n; i++)
			num = num + i;
	}
}
