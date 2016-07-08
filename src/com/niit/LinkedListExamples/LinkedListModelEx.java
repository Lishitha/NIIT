package com.niit.LinkedListExamples;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListModelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Empl> list=new LinkedList<Empl>();
		
		list.add(new Empl("Tim",3000));
		list.add(new Empl("Sim",5000));
		list.add(new Empl("Kim",8000));
		list.add(new Empl("Rim",4000));
		
		Collections.sort(list,new MySalaryComp());
		
		System.out.println("sorted list");
		for(Empl e:list)
		{
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}

	}

}
