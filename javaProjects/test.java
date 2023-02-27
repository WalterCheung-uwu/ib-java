/*
 * test.java
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


public class test {
	
	public static void main (String[] args) {
		IBIO.output("Walter cheung");
		int y = 1;
		
		int n = IBIO.inputInt("Enter an interger from 1 to 9: ");
		{	while(n < 1 || n > 9)
			n = IBIO.inputInt("Error - Please enter an interger in range of 1-9: ");
		}
		{	for(int i = 0; i < 20; i++)
		{	IBIO.output(n + " x " + y + " = " + (n * y));
			for(int j = 0; j < 20; j++);
			y = y + 1;
		}
		}
	}
}

/*
 Walter cheung
Enter an interger from 1 to 9: 8
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
8 x 11 = 88
8 x 12 = 96
8 x 13 = 104
8 x 14 = 112
8 x 15 = 120
8 x 16 = 128
8 x 17 = 136
8 x 18 = 144
8 x 19 = 152
8 x 20 = 160
*/
