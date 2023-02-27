/*
 * sentiment.java
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


public class sentiment {
	
	public static void main (String[] args) {
		int a = 0;
		int x = IBIO.inputInt("rate movie lol (1 - 10) ");
		switch (x)
		{	case 10:
			
			case 9:
			
			case 8:
			
			case 7:
			
			case 6:
			a = a + 1;
			break;
			
			case 5:
			a = a + 0;
			break;
			
			case 4:
			
			case 3:
			
			case 2:
			
			case 1:
			a = a - 1;
			break;
			}
				System.out.println(a);
	}
}

