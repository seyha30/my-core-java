package exception;

import exception.custom.AgeLessThanzeroException;

public class CustomExceptionDemo {
	public static void main(String[] args) throws AgeLessThanzeroException {
		ageValidator(-1);
	}

	public static void ageValidator(int age) throws AgeLessThanzeroException {
		if (age < 0) {
			throw new AgeLessThanzeroException("age invalid" , new RuntimeException());

		}

	}
}
