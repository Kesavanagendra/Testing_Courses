package com.app.Junit;

import java.lang.annotation.Annotation;

public class MyAnnotationsDemo implements MetaAnnotation {

	@Override
	public Class<? extends Annotation> annotationType() {
		
		return null;
	}

	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
	
}
