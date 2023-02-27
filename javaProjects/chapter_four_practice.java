/*
 * chapter_four_practice.java
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


public class chapter_four_practice {
	
	public static void main (String[] args) {
		int a;
		int m;
		int x = IBIO.inputInt("First number: ");
		int y = IBIO.inputInt("Second number: ");
		
		{
			System.out.println("press: [1] for addition");
			System.out.println("       [2] for multiplication");
			System.out.println("       [3] for quit");
			int num = IBIO.inputInt("");
		{	while(num > 3 || num < 1)
			num = IBIO.inputInt("");
			}
			System.out.println("-----------------");
			
		{
			switch (num)
			{	case 1:
				a = x + y;
				System.out.println(a);
				break;
				case 2:
				m = x * y;
				System.out.println(m);
				break;
				default:
				break;
				}
		}
	}
}
}







