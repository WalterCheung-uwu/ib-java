/*
 * Q2PracticeTest.java
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


public class Q2PracticeTest {
	
	public static void main (String[] args) {
	{	boolean a = true;
		boolean b = false;
		
		System.out.println(a||b);
		System.out.println(a==b);
		System.out.println(!a);
		System.out.println(!b);
		System.out.println(!(a||b));
		System.out.println(!(a&&b));
		System.out.println(a&&b);
		}
		System.out.println("");
		
	{	boolean x = true;
		boolean y = false;
		System.out.println("Temperature is liquid, T/F ");
		int temp = IBIO.inputInt("Give a temperature ");
		x = (temp > 0 && temp < 100);
		if(temp > 0 && temp < 100)
		System.out.println(x);
		else
		System.out.println(y);
		}
		
	}
}

