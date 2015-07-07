package com.a;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
                for( i=2;i<=100;i++){
                	for( n=2;n<=i/2;n++){
                		if(i%n==0)
                			break;
                		}
                	if(n>i/2)
                		System.out.println("数"+i+"是质数");
                	}
                	
                }
	}


