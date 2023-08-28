package ex;

public class Ex4 {
	void method() throws InvalidNumberException, NotANumberException {}
	
	public static void main(String[] args) {
		try {
			method();
		} catch (InvalidNumberException e) {
			
		} catch (NotANumberException e) {}
		
		try {
			method();
		} catch(RuntimeException e) {
			
		}
		
		try method() {
			
		} catch(Exception e) {
			
		}
		
		try {
			method();
		} catch(Exception e) {
			
		} catch(NumberException) {}
	}
}


class InvalidNumberException extends Exception{
	
}

class NotAnumberException extends Exception {
	
}