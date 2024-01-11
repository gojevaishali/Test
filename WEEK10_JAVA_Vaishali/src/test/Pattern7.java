

//         * 
//        * * 
//       * * * 
//      * * * * 
//     * * * * * 
//      * * * * 
//       * * * 
//        * * 
//         * 


package test;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:-");
		pattern(sc.nextInt());
	}

	public static void pattern(int number) {
		int space=number-1,star=1;
		for (int index = 1; index <=number; index++) {
			for (int index2 = 1; index2 <=space; index2++) {
				System.out.print(" ");
			}
			for (int index2 = 1; index2 <= star; index2++) {
				System.out.print("* ");
			}
			System.out.println();
			if(index<number/2) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
		}
	}
}
