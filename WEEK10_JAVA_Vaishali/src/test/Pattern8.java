//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * * 

package test;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		pattern(sc.nextInt());
	}

	public static void pattern(int number) {
		for (int index = 1; index <=number; index++) {
			for (int index2 = 1; index2 <=number; index2++) {
				if(index==1||index==number) {
					System.out.print("* ");
				}
				else if(index2==1||index2==number) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
