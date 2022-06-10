package JavaInterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1. using algrithm
		
		int num= 123456789;
		int rev=0;
		
		while(num !=0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		//2. usig StringBuffer method
		
		long num1= 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
