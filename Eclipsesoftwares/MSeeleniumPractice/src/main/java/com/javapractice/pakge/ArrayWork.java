package com.javapractice.pakge;

public class ArrayWork{
	
//	int[] a;
	public static void main(String[] args) {
		
		
//	int[] a=new int[3];
//		int[] a={10,20,30};
		
		int[][] a= {{10,20},{12,13,14},{25,30}};
	
//	a[0]=10;
//	a[2]=20;
	
	
	
	System.out.println(a[0].length);
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<a[i].length;j++) {
			
			System.out.print(a[i][j]+" ");
		}
		
		System.out.println();
	}
	
//	for(int i=0;i<a.length;i++) {
//		
//		System.out.println(a[i]);
	
	//for each
	
//	for(int[] i:a) {
//		System.out.println(a);
//	}
	}

}
