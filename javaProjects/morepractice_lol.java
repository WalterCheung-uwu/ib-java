/*
 * morepractice_lol.java
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


public class morepractice_lol {
	
	public static void main (String[] args) {
		double sum = 0;
		System.out.println("statistics lol");
		System.out.println("--------------");
		int amount = IBIO.inputInt("How many numbers to input? ");
		while(amount < 3){
			amount = IBIO.inputInt("lol no uwu, try again dumbass owo ");
			}
		for(int i = 0; i < amount; i++){
		double num = IBIO.inputInt("give a number you stoopid fucking dumbass uwu ");
		sum = sum + num;
			}
		System.out.println("");
		System.out.println("Average:" + sum/amount);
		
		
		
		
		
	}
}

