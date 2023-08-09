package practice;

public class Repeated {
	
	public void findRepeated(String x) {
		
		for(int i=0;i<x.length();i++) {
			int count=0;
			for(int j=1;j<x.length();j++) {
				if(x.charAt(i)==x.charAt(j)) {
					count++;
				}
			}
			if(count>1)
			System.out.println(x.charAt(i)+""+count);
			else
				System.out.println(x.charAt(i)+""+count);
		}
	}
	
	public static void main(String[]args) {
		Repeated r=new Repeated();
		r.findRepeated("nishanthi");
	}

}
