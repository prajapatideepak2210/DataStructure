package com.bridgelabz.datastructureprogram.programs;

import java.util.LinkedList;

import com.bridgelabz.datastructureprogram.utility.Queue;
import com.bridgelabz.datastructureprogram.utility.Utility;

public class AnagramInQueue {
	public static void main(String[] args) {
		Utility utility=new Utility();
		int start=1;
		int end=1000;
		LinkedList<Integer> list=new LinkedList<Integer>();
		list=utility.primeNumber(start, end);
		
		LinkedList<String> list2=new LinkedList<String>();
		for(int i=0; i<list.size()-1; i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i)!=null)
				{
					if(utility.anagram(list.get(i), list.get(j)))
					{
						list2.add(list.get(i)+"-"+list.get(j));
					}
				}
			}
		}
		
		Queue<String> queue=new Queue<String>();
		for(int i =0; i<list2.size(); i++)
		{
			queue.enqueue(list2.get(i));
		}
		queue.getelement();
		
	}
}
