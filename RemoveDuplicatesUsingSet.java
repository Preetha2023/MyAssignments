package week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
	String text= "We learn java basics as part of java sessions in java week1";
	Set <Character> data = new TreeSet <Character>();
	for (int i=0;i<text.length();i++)
	{
	data.add(text.charAt(i));
	}
	for(Character c:data) {
		System.out.print(c.toString());
	}

	}

}
