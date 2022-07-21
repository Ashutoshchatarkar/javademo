package javaintropro;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "ashutosh is my name";

		String[] list = str.split(" ");

		for (int i = 0; i < list.length; i++) {
			String b = list[i];
			char a[] = b.toCharArray();
			String rev = "";

			for (int j = a.length - 1; j >= 0; j--) {

				rev = rev + a[j];
			}
			System.out.print(rev + " ");

		}

	}
}