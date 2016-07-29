package com.hand;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入工资：");
        double gongzi1=scanner.nextDouble();
        double gongzi=gongzi1-3500.0;
        double tx=0.0;
        if(gongzi<=1500){
        	tx=gongzi*0.03;
        }
        else if(gongzi<=4500) {
			tx=1500*0.03+(gongzi-1500)*0.1;
		}
        else if (gongzi<=9000) {
        	tx=1500*0.03+3000*0.1+(gongzi-4500)*0.2;
		}
        else if (gongzi<=35000) {
        	tx=1500*0.03+3000*0.1+4500*0.2+(gongzi-9000)*0.25;
		}
        else if (gongzi<=55000) {
        	tx=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(gongzi-35000)*0.3;
		}
        else if (gongzi<=80000) {
        	tx=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(gongzi-55000)*0.35;
		}
        else {
        	tx=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(gongzi-80000)*0.45;
		}
        System.out.println("所需要缴纳的税费为："+tx);
    }
}
