package com.bl.studentmanagement.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilValidation {	
	public static boolean isValid(String input, String regexExpression) {
		Pattern pattern = Pattern.compile(regexExpression);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}
}