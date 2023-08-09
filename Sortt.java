package practice;

import java.util.Arrays;
import java.util.List;

public class Sortt {
	public static void main(String[]args) {
		int[]arr1= {1,2,3,4};
		int[]arr2= {6,2,3,5};
		int[]arr=new int[arr1.length+arr2.length];
		List<Integer>l1=Arrays.asList(1,2,3,4);
		List<Integer>l2=Arrays.asList(6,2,3,5);
		
		List<List<Integer>>l=Arrays.asList(l1,l2);
		
		List<List<Integer>>dis=l.stream().distinct().toList();
		
		dis.forEach(x->System.out.println(x));


		}
	}


