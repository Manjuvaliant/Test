package org.basic;

public class Amstrong {
	public static void main(String[] args) {
		int n =153; int r=0;
		while(n!=0) {
			int a = n%10;
			r=r+(a*a*a);
			n=n/10;
		}
		if(r==n) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not a amstrong");
		}
	}

}
