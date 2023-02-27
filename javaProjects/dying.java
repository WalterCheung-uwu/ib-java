/*
 * dying.java
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


public class dying {
	
	public static void main (String[] args) {
		int mark = IBIO.inputInt("Mark? ");
		switch(mark/10)
		{
			case 10:
			case 9:
			case 8:
				System.out.println("Excellent");
				break;
			case 7:
				System.out.println("Very Good");
				break;
			case 6:
				System.out.println("Good");
				break;
			case 5:
				System.out.println("Work Hard");
				break;
			case 4:
				System.out.println("Poor");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("Very Poor");
				break;
			default:
				System.out.println("Invalid lol");
				break;
			}
			
		int temp = 128;
		int result = 0;
		while(temp > 0)
		{	result = result + (temp % 10);
			temp = temp / 10;
			}
			System.out.println(result);
			
		for(int i = 2; i < 12; i++)
		{	if(12 % i == 0)
			{	System.out.println(i + "");
				}
			}
		
		int z = 0;
		int x = 1;
		while(x < 5)
		{	z = z + x;
			x = x + 1;
			}
		System.out.println(x + "" + z);
		
		int r = 5;
		for(int u = 1; u < 5; u++)
		{	if(u % 2 == 0)
			{	r = r / u;
				}
			else
			{	r = r * u;
				}
			}
		System.out.println(r);
	}
}

