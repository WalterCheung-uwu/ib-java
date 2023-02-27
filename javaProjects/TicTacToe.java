/*
 * TicTacToe.java
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


public class TicTacToe {
	
	public static void main (String[] args) {
		System.out.println("     P1 Starts           P1: X");
		System.out.println("    -----------          P2: O");
		System.out.println("      A  B  C");
		for(int i = 1; i <= 3; i++)
		System.out.println("   " + i);
			
			System.out.println("                        Keybinds");
			System.out.println("[A1]   [B1]   [C1]   |   1 2 3");
			System.out.println("[A2]   [B2]   [C2]   |   4 5 6");
			System.out.println("[A3]   [B3]   [C3]   |   7 8 9");
			int turn1 = IBIO.inputInt("");
			
			while(turn1 < 1 || turn1 > 9)
			turn1 = IBIO.inputInt("not an option ");
				switch(turn1)
			{		case(1):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1  X");
						System.out.println("   2");
						System.out.println("   3");
						int turn2 = IBIO.inputInt("");
					}
					break;
					case(2):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1     X");
						System.out.println("   2");
						System.out.println("   3");
					}
					break;
					case(3):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1        X");
						System.out.println("   2");
						System.out.println("   3");
					}
					break;
					case(4):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2  X");
						System.out.println("   3");
					}
					break;
					case(5):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2     X");
						System.out.println("   3");
					}
					break;
					case(6):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2        X");
						System.out.println("   3");
					}
					break;
					case(7):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2");
						System.out.println("   3  X");
					}
					break;
					case(8):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2");
						System.out.println("   3     X");
					}
					break;
					case(9):
					{	System.out.println("----------------------------------");
						System.out.println("     P2's turn");
						System.out.println("    -----------");
						System.out.println("      A  B  C");
						System.out.println("   1");
						System.out.println("   2");
						System.out.println("   3        X");
					}
		}	
	}	
}

