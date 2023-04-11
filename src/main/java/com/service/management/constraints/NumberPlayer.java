/**
 * 
 */
package com.service.management.constraints;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target({TYPE, FIELD})

public @interface NumberPlayer {
	
	
	int[] Values();
	
	//error message
	public String message() default "can't put more than 20 players by team";
	
	//represents group of constraints 
	public Class<?>[] groups() default {};
	
	//represents additional information about annotation
	public Class<? extends Payload>[] payload() default {};

}
