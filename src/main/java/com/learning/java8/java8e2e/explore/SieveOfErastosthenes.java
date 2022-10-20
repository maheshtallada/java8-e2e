package com.learning.java8.java8e2e.explore;

public class SieveOfErastosthenes {

	public static void main(String[] args) {
		int n=23;
		boolean arr[] = new boolean[n+1];
		
		for (int i=0; i<=n; i++) {
			arr[i]=true;
		}
		
		for (int p=2; p*p<=n; p++) {
			if (arr[p]==true) {
				for (int i=p*p; i<=n; i+=p) {
					arr[i] = false;
				}
			}
		}
		
		for (int i=2; i<=n; i++) {
			if(arr[i]==true) {
				System.out.print(i+" ");
			}
		}
	}
}
