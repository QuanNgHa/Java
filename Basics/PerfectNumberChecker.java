/**
 * A positive integer is called a perfect number if the sum of all its proper divisor is equal to its value. 
 * For example, the number 6 is perfect because its proper divisors are 1, 2, and 3, and 6=1+2+3; 
 * but the number 10 is not perfect because its proper divisors are 1, 2, and 5, and 10≠1+2+5. Other perfect numbers are 28, 496, ...
 **/


import java.util.Scanner;
public class PerfectNumber {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = in.nextInt();
		int sum = 0;
		for (int i = 1; i< n; i++) {
			if (n%i == 0 ) sum +=i; 
		}
		if (sum == n) System.out.println(n + " is a perfect number");
		else System.out.println(n + " is not a perfect number");
	}

}
