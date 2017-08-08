/**
 * chapter3.java
 * 
 * Copyright 2017  <fourgos@ubie>
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


import java.util.Scanner;


public class Echo {
	
	public static void main (String args[]) {
		String line;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said: " + line);
		
		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
		
	}
}

