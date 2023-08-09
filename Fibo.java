package practice;

public class Fibo {
	public static void main(String[]args) {
		int num=8;
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<num;i++) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
		
		
	}

}
