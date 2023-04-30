package collections;

import java.util.LinkedList;

public class Program4 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		System.out.println("--------");
		for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
		System.out.println("------------");
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}

}}
