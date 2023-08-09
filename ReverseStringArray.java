package practice;

public class ReverseStringArray {
	public static void main(String[]args) {
		String x="i am from Bangalore";
		String[]y=x.split(" ");
		String temp="";
		for(int i=y.length-1;i>=0;i--) {
			temp=temp+" "+y[i];
			
		}
		System.out.println(temp);

	}

}
