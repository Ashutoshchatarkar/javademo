package javaintropro;

public class Reversestring {

	public static void main(String[] args) {
		String str="ashutosh";
		String rev ="";

		char [] a=str.toCharArray();
		for (int i =a.length-1;i >=0;i--) {
		rev=rev+a[i];
		}

		System.out.println(rev);


	}

}
