package basic;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		System.out.println("--- 배열 복사 ---");
	
		int[] Arr1 = new int[] {1,2,3,4};
		int[] Arr2 = new int[Arr1.length];
		
		for(int i=0; i<Arr1.length; i++) {
			Arr2[i] = Arr1[i];
		}
		
		for(int i=0; i<Arr1.length; i++) {
			System.out.println("Arr1["+i+"]: "+ Arr1[i] + " | " + "Arr2["+i+"]: " + Arr2[i]);
		}
		
		Arr1[0] = 15;
		Arr2[3] = 25;
		for(int i=0; i<Arr1.length; i++) {
			System.out.println("Arr1["+i+"]: "+ Arr1[i] + " | " + "Arr2["+i+"]: " + Arr2[i]);
		}
		
		System.out.println("--- 참조값 확인 ---");
		System.out.println("Arr1 참조값 : " + Arr1);
		System.out.println("Arr2 참조값 : " + Arr2);
	}
	
}
