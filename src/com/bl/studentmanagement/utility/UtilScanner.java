package com.bl.studentmanagement.utility;

import java.util.Scanner;

public class UtilScanner {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int getInt(String message) {
		message(message);
		return SCANNER.nextInt();
	}

	public static byte getByte(String message) {
		message(message);
		return SCANNER.nextByte();
	}

	public static long getLong(String message) {
		message(message);
		return SCANNER.nextLong();
	}

	public static short getShort(String message) {
		message(message);
		return SCANNER.nextShort();
	}

	public static double getDouble(String message) {
		message(message);
		return SCANNER.nextDouble();
	}

	public static float getFloat(String message) {
		message(message);
		return SCANNER.nextFloat();
	}

	public static boolean getBoolean(String message) {
		message(message);
		return SCANNER.nextBoolean();
	}

	public static String getString(String message) {
		message(message);
		return SCANNER.next();
	}

	public static String getStringLine(String message) {
		message(message);
		return SCANNER.nextLine();
	}

	private static void messageNewLine(String msg) {
		System.out.println(msg);
	}

	private static void message(String msg) {
		System.out.print(msg);
	}
}