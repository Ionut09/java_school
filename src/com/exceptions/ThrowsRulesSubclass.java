package com.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("unused")
public class ThrowsRulesSubclass extends ThrowsRulesSuperclass {

//	@Override
//	public void methodWithNoThrows() {
//	}
//	@Override
//	public void methodWithNoThrows() throws RuntimeException {
//	}
//	@Override
//	public void methodWithNoThrows() throws IOException { //nu se poate 
//		
//	}

//	@Override
//	public void methodWithThrowsWithUnchecked() throws RuntimeException {
//	}
	
//	@Override
//	public void methodWithThrowsWithUnchecked() throws FileNotFoundException {//nu se poate 
//	}

//	@Override
//	public void methodWithThrowsWithChecked() throws Exception { //nu se poate pt ca Exception e mai sus in ierarhie decat IoException
//	}
	
//	@Override
//	public void methodWithThrowsWithChecked() throws IllegalArgumentException {
//	}
	
	@Override
	public void methodWithThrowsWithChecked() {
		
	}

}
