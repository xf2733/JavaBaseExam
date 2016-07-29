package com.hand;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> lists=new ArrayList<Integer>();
//    	Vector<Integer>pool=new Vector<Integer>();
    	int k=50;
    	for (int i = 0; i < k; i++) {
			Random rand = new Random();
			int randNum = rand.nextInt(100);
			lists.add(randNum);
		}
    	System.out.print("随机生成的50个小于100的数，分别为：");
    	for (int i = 0; i < k; i++) {
			System.out.print(lists.get(i)+" ");
		}
    	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
    	for (int i = 0; i < lists.size(); i++) {
			Integer a=lists.get(i);
			Integer b=a/10;
			map.put(b, a);
		}
    	System.out.println("Map中的数据为：");
    	for (Object obj : map.keySet()) {
            Integer key = (Integer) obj;
            Integer value = (Integer) map.get(key);
            System.out.println(key + "=" + value);
        }
    	
    }
}
