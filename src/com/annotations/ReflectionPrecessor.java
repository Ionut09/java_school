package com.annotations;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

public class ReflectionPrecessor {

	public static void main(String[] args) {
		Class<AnnotatedClass> clazz = AnnotatedClass.class;

		Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
		Stream.of(declaredAnnotations).forEach(annotation -> System.out.println(annotation.annotationType()));
	}
}
