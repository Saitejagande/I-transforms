package java11;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter your Principle, rate and time: ");
			int p=s.nextInt();
			int r=s.nextInt();
			int t= s.nextInt();
			calculate simple_interest = (a,b,c) -> System.out.println("The simple interest: ₹"+ (a*b*c)*0.01);
			simple_interest.give(p,r,t);
		}
    }
}
interface calculate{
    public void give(int p,int r,int t);
}
