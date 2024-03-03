package gitdemo;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseNum.revreseNumber();
		ReverseNum.reverseString();
		ReverseNum.reverseSentance();
			
			
	}
	

	private static void revreseNumber() {
		// TODO Auto-generated method stub
		int num=874;
		int sum=0;
		
		while(num>0) {
			
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
			
			
		}
	
		System.out.println("num "+ sum);
	}
	
	
	public static void reverseString() {
		
		String p="parvathy";
		int len=p.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			  rev+=p.charAt(i);
		}
		
		System.out.println("string reversed " + rev);
		
	}
	
	public static void reverseSentance() {
		
		String j="welcom to ooty";
		String [] arr=j.split(" ");
		String rev="";
		
		int len=arr.length;
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+arr[i];
			rev=rev+" ";
		}
		
		System.out.println("revd sentance  " + rev);
		
		
	}
	}

	
		
		


