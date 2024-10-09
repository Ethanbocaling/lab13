package trees;

public class TreeException extends Exception {
	public TreeException(String s) {
		// Pass s into a superclass ctor.
		super(s);
		System.out.println("Hello World");
	}
}
