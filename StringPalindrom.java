package practice;

public class StringPalindrom {

	public static void main(String[] args) {
		String val="khk";
		System.out.println("string value ="+val);
		String rev="";
		int len=val.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+val.charAt(i);
		}
		System.out.println("reverse of string ="+rev);
		if(val.equals(rev)) {
			System.out.println("it is a palindrom");
		}
		else {
			System.out.println("it is not palindrom");
		}
	}

}
