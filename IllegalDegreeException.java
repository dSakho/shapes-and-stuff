package geometry;

@SuppressWarnings("serial")
public class IllegalDegreeException extends Exception {
	IllegalDegreeException(String message) {
		super(message);
	}
	
	IllegalDegreeException(Throwable throwable) {
		super(throwable);
	}
	
	IllegalDegreeException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
}
