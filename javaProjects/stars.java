/*
 * stars.java
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


public class stars {
	
	public static void main (String[] args){
			int num = IBIO.inputInt("enter number of lines: "); 
			String aa = stars(num);
			
			for(int i = 0; i < num; i++){
				System.out.println(stars(i + 1));
		}
			for(int i = num; i > 1; i--){
				System.out.println(stars(i - 1));
		}
	}
	
	static String stars(int n){
			String xx = "";
			for(int i = 0; i < n; i++)
				xx = xx + "*";
			return xx;
	}
}

