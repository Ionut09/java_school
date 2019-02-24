package com.annotations;

import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@AnotareaNoastra
public class AnnotatedClass {

	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void method() {
		List list = new ArrayList<>();
	}
	
	
}
