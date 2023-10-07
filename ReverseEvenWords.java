package week3.day2.assignments;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEvenWords {

	public static void main(String[] args) {
	String test="I am a software tester";
	String [] split = test.split(" ");
	for(int i=0;i<split.length;i++)
	{
		if(i%2!=0)
		{
		System.out.println(split[i]);	
		char[] ch=split[i].toCharArray();
		String s="";
		for (int j=ch.length-1;j>=0;j--) {
			s= s+ch[i];
			
		}
		System.out.println(s);
		}
		
		else
			
		{
			System.out.println(split[i]	);
		}
		
		}		
		
	}
	

	}


