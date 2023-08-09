package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSpace {
	
	public static void main(String[]args) {
		String[]str= {"yamini"," ","karthik"," ","thanuj"};
		
		List<String>l=Arrays.asList(str);
		
		List<String>li=l.stream().filter(x->x!=" ").collect(Collectors.toList());
		System.out.println(li);
		
		
		
	}

}
