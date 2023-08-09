package practice;

import java.util.Arrays;
import java.util.List;

public class CountUsingStream {
	public static void main(String[]args) {
		String[] values= {"yamini"," ","thanuj"," ","karthik"," "};
		
		List<String>l=Arrays.asList(values);
		Long count=l.stream().filter(x->x.equals(" ")).count();
		System.out.println(count);
	}

}
