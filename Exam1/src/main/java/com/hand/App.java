package com.hand;

import java.util.Vector;

public class App 
{
		public static void main(String[] args){
			Vector<Integer>pool=new Vector<Integer>();
			int sum=0;
			for (int i = 101; i < 200; i++) {
				int flag=0;
				for (int j = 2; j < Math.sqrt(i); j++) {
					float k=(float)i;
					if(k%j==0){
						flag=1;
						break;
					}
				}
				if (flag==0) {
					sum++;
					pool.addElement(i);
				}
			}
			System.out.print("101到200共有 "+sum+"个素数,分别是：");
			for (int i = 0; i <sum; i++) {
				System.out.print(pool.elementAt(i)+" ");
			}
		}
	}

