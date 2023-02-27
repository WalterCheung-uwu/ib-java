/*
 * combnation_thing_lol.java
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


public class combnation_thing_lol {
	
	static final int MAX = 100;
	
	public static void main (String[] args) {
		for(int a = 0; a <= MAX; a++){
			for(int b = 0; b <= a; b++){
				for(int c = 0; c <= b; c++){
						System.out.println(a + "" + b + "" + c);
					}
				}
			}
	}
	
}

