package com.service.management.constraints;

import java.util.Arrays;
import java.util.stream.IntStream;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumberPlayerValidator implements ConstraintValidator<NumberPlayer, Integer> {
	
	
	Integer [] arrayOfInt;
	
	@Override
	public void initialize(NumberPlayer constraintAnnotation) {
		
		int[] values = constraintAnnotation.Values();
		this.arrayOfInt = IntStream.of(values).boxed().toArray(Integer[]::new );
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		arrayOfInt = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		return Arrays.asList(this.arrayOfInt).contains(value);
	}




}
