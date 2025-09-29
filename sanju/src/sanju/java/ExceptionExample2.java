package sanju.java;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
		String str = null;
		System.out.println(str.length());
		}
	catch (ArithmeticException | NullPointerException e) {
		System.out.println("Caught: " + e);
	}
  }

}
