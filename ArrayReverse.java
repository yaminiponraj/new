package practice;

public class ArrayReverse {
	public static void main(String[]args) {
		int[]a= {1,2,3,4,5,6};
		int[]b=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			b[i]=a[i];
			System.out.print(b[i]);
		}
	}

}
