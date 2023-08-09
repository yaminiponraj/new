package practice;

public class IntToWord {
	public static void main (String[]args) {
		int num=2;
		String out="";
		String[]unit= {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[]ten= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		for(int i=1;i<num;i++) {
			if(num>0&&num<20) {
				out=unit[i];
			}
			else if(num>20&&num<100) {
				int units=num%10;
				int tens=num/10;
			out=ten[tens]+unit[units];
			}}
			System.out.println(out);
			}
	}


