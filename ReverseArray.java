package practice;

public class ReverseArray {
	public static void main(String[]args) {
		String a="abc123def";
		String []temp=a.split("[1-9]");
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i)=='1') {
				continue;
			}
			b=b+a.charAt(i);
		}
		System.out.println(b);
		
		
		
			}

}
