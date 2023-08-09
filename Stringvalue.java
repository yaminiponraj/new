package practice;

public class Stringvalue {
	public static void main(String[]args) {
		String x="1+1*4";
		String[]num=x.split("[+ - * / %]");
		String[]operator=x.split("[0-9]");
		
		int temp=Integer.parseInt(num[0]);
		for(int i=1;i<num.length;i++) {
			int nu=Integer.parseInt(num[i]);
			String c=operator[i];
			if(c.equals("+"))
				temp=temp+nu;
			else if(c.equals("-"))
				temp=temp-nu;
			else if(c.equals("*"))
				temp=temp*nu;
		}
		
		System.out.println(temp);
		
	}

}
