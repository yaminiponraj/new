package practice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[]args) {
		String a="abc";
		String b="dca";
		
		if(a.length()==b.length()) {
				char[]aa=a.toCharArray();
				char[]bb=b.toCharArray();
				
				Arrays.sort(aa);
				Arrays.sort(bb);
				
				Boolean x=Arrays.equals(aa,bb);
				if(x) {
					System.out.println("anagram");
				}
				else
					System.out.println("not anagram");
	
			
			}
		}
	}


