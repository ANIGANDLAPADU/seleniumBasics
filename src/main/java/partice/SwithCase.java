package partice;

public class SwithCase {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			String str = null;
			str.toString();

		} catch (ArithmeticException ae) {
			System.out.println("i am from arithmeticException");

		} catch (NullPointerException e) {
			System.out.println("i am from NullPointerException");
		}
	}

}
