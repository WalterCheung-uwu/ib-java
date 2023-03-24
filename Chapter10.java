/*
 * Chapter10.java
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


public class Chapter10 {
	
	public static void main (String[] args) {
		String s = IBIO.inputString("input a word: ");
		char[] x = s.toCharArray();
		
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
		}
			System.out.println("");
			
		for(int j = x.length - 1; j >= 0; j--){
			System.out.print(x[j]);
		}
			System.out.println("");
		
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i]);
		}
		
		for(int j = x.length - 2; j >= 0; j--){
			System.out.print(x[j]);
		}
	}
}

