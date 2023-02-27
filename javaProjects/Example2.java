/*
 * Example2.java
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


public class Example2 {
	
	public static void main (String[] args) 
	{
		int a = 17;
		int b = 23;
		int c = a * b;
		IBIO.output("the product of " + a + " and " + b
		+ " is " + c);
		// out vs output
		IBIO.out("the product of ");
		IBIO.out(a);
		IBIO.out(" and ");
		IBIO.out(b);
		IBIO.out(" is ");
		IBIO.output(c);
		IBIO.out("goodbye LOL");
	}
}

