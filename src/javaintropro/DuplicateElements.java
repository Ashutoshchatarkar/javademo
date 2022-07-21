package javaintropro;

public class DuplicateElements {

	public static void main(String[] args) {

		String str = "Ashutosh Chatarkar";
		
		str=str.toLowerCase();
		System.out.println(str);
		
for (int i =0;i<str.length();i++) {	
	for (int j = i+1;j<str.length();j++) {
		if(str.charAt(i)==str.charAt(j)) {
			System.out.print(str.charAt(i));
			String str1="";
			str1=str1+str.charAt(i);
			str=str.replaceAll(str1,"");
		//	str=str.replace("", "");
		}
	}
	
}
		
		
		
		
	}

}
