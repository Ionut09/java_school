package com.exceptions;

import java.io.IOException;

public class ThrowsRulesSuperclass {

	public void methodWithNoThrows() {

	}

	public void methodWithThrowsWithUnchecked() throws IllegalArgumentException {

	}

	public void methodWithThrowsWithChecked() throws IOException, ArithmeticException, RuntimeException {

	}
}
