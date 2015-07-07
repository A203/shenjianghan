package com.a;

public class demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]={8,5,7,4};
		int i,j,temp;
		for ( i=c.length;i>0;i--)
		{
			for( j=0;j<i;j++)
		{
			if(c[i]<c[j])
			{
				temp=c[i];
				c[j]=c[i];
				c[j]=temp;
				
			}
		}
	}

	}
}
