package com.a;

import java.nio.IntBuffer;

public class demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[];
          int []a1;
//int a2[5];
          a=new int[3];
          int size=5;
          a1=new int[size];
        a[0]=1;
        a[1]=2;
        a[2]=3;
      
        int b[]={1,2,3,4,5};
        int b1[]=new int[]{1,2,3,4,5};
        //int b3[];
        //b3={1,2,3,4,5};
        //输出a数据内容
        System.out.println("数组长度："+a.length);
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i]);
        }
        
	}

}



