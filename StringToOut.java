package practice;

public class StringToOut {
	public static void main(String[]args) {
		String a="1+3-4";
		String[]b=a.split("[+ - * / %]");
		String[]c=a.split("[1-9]");
		int temp=Integer.parseInt(b[0]);
		for(int i=0;i<a.length();i++) {
			int d=Integer.parseInt(b[i]);
			
			if(c[i].equals("+")) {
				temp=temp+d;
			}
			else if(c[i].equals("-")) {
				temp=temp-d;
			}
			else if(c[i].equals("*")) {
				temp=temp*d;
			}
			else if(c[i].equals("/")) {
				temp=temp/d;
			}
			System.out.println(temp);
		}
	}

}
