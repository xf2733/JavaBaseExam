package com.hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class App {

	public static void main(String[] args) throws IOException  {
		long year=0;long month=0;long day=0;   
		String m=new String("");   
		String n=new String("");   
		Vector<String> s=new Vector<String>();   
		long numday=0;   
		int[] numonthday={31,28,31,30,31,30,31,31,30,31,30,31};   
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));   
		System.out.print("请输入日期：");   
		m=buff.readLine();   
		char[] arr = m.toCharArray();   
		for(int i=0;i<arr.length;i++)    
			{    
			if(Character.isDigit(arr [i]))      
				n=n+arr[i];    
			else    
			{     
				if(!n.isEmpty())     
				{      
					s.addElement(n);      
					n=new String("");     
				}    
			}    
			if(i==arr.length-1&&!n.isEmpty())     
				s.addElement(n);    
			}   
		year=Long.parseLong(s.elementAt(0));   
		month=Long.parseLong(s.elementAt(1)); 
		day=Long.parseLong(s.elementAt(2));   
		if(year%4==0&&year%100!=0)    
			numonthday[1]=29;    
		if(year%400==0)    
			numonthday[1]=29;   
		for(int j=0;j<month-1;j++)   
			numday=numday+numonthday[j];   
		numday=numday+day;   
		System.out.print("你输入的日期为当年的第"+numday+"天");  
	} 
} 
