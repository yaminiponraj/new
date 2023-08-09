package practice;

public class SumOfNum {
	public static void main (String[]args) {
		
		int[]a= {1,2,3,4,5,0,7,8,9};
		int temp=5;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==temp) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
		
	}

}
