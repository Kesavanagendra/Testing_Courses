package com.app.Junit;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.TYPE , ElementType.METHOD})  	// where will annotation be applied- on a method
@Retention(RetentionPolicy.RUNTIME)			// when will annotation be triggered
@Tag("dev")
@Test            // our annotation is replica of @test annotation
public @interface MetaAnnotation {

	// to create an annotation in JUnit you will create an Interface
}
