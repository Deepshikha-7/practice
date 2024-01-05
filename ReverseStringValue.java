package practice;

public class ReverseStringValue {

	public static void main(String[] args) {
		String val="chunna";
		System.out.println("string value ="+val);
		String rev="";
		int len=val.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+val.charAt(i);
		}
		System.out.println("reverse of a string ="+rev);
	}

}
