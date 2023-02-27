/*
 * problem5.1.java
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


public class problem5 {
	
	public static double sum(int n){
		double sum = 0;
		double demom = 5.0;
		double term = 0;
		for(int i = 1; i <= n; i++)
		{	term = 1.0/demom;
			sum = sum + term;
			demom = demom * 5;
			}
			return(sum);
		}

	public static void main (String[] args) {
		int n = IBIO.inputInt("How many numbers to add up? ");
		System.out.println(n);
	}
}

