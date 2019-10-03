public class CodingBatExercises {

	/*
	█░░░█ █▀▀█ █▀▀█ █▀▄▀█ █░░█ █▀▀█   ▄█░
	█▄█▄█ █▄▄█ █▄▄▀ █░▀░█ █░░█ █░░█   ░█░
	░▀░▀░ ▀░░▀ ▀░▀▀ ▀░░░▀ ░▀▀▀ █▀▀▀   ▄█▄
	*/

	/*
	The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. 
	Return true if we sleep in.

	sleepIn(false, false) → true
	sleepIn(true, false) → false
	sleepIn(false, true) → true
	*/
	public boolean sleepIn(boolean weekday, boolean vacation) {
  		if(weekday == false && vacation == false || weekday == false && vacation == true || weekday == true && vacation == true) {
    		return true;
  		}
  		else {
    		return false;
  		}
	}

	/*
	We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. 
	Return true if we are in trouble.

	monkeyTrouble(true, true) → true
	monkeyTrouble(false, false) → true
	monkeyTrouble(true, false) → false
	*/

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  		if(aSmile == true && bSmile == true || aSmile == false && bSmile == false) {
    		return true;
  		}
  		else {
    		return false;
  		}
	}

	/*
	Given two int values, return their sum. Unless the two values are the same, then return double their sum.

	sumDouble(1, 2) → 3
	sumDouble(3, 2) → 5
	sumDouble(2, 2) → 8
	*/

	public int sumDouble(int a, int b) {
  		if(a == b) {
    		return (a+b) * 2;
 		}
  		else {
    		return a + b;
  		}
	}

	/*
	Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

	diff21(19) → 2
	diff21(10) → 11
	diff21(21) → 0
	*/

	public int diff21(int n) {
  		int diff = 21 - n;
  		int double_ = -(21 - n) * 2;
  		if(n <= 21) {
    		return diff;
  		}
  		else {
   			return double_;
  		}
	}

	/*
	We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
	Return true if we are in trouble.

	parrotTrouble(true, 6) → true
	parrotTrouble(true, 7) → false
	parrotTrouble(false, 6) → false
	*/

	public boolean parrotTrouble(boolean talking, int hour) {
  		if(hour < 7 && talking == true || hour > 20 && talking == true) {
    		return true;
  		}
  		else {
    		return false;
  		}
	}

	/*
	Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

	makes10(9, 10) → true
	makes10(9, 9) → false
	makes10(1, 9) → true
	*/
	public boolean makes10(int a, int b) {
  		int sum = a + b;
  		if(a == 10 || b == 10 || sum == 10) {
    		return true;
  		}
  		else {
    		return false;
  		}
	}

	/*
	Given an int n, return true if it is within 10 of 100 or 200. Note: 
	Math.abs(num) computes the absolute value of a number.

	nearHundred(93) → true
	nearHundred(90) → true
	nearHundred(89) → false
	*/

	public boolean nearHundred(int n) {
		int num = Math.abs(n);
	  
	  	if(n < 0) {
	    	return false;
	  	}
	  
	  	if(num <= 100) {
	    	if(100 - num <= 10) {
	      		return true;
	    	} 
	  	}
	  
	  	if(num >= 100) {
	    	if(num - 100 <= 10) {
	      		return true;
	   	 	} 
	  	}
	  
	  	if(num <= 200) {
	    	if(200 - num <= 10) {
	      		return true;
	    	} 
	  	}
	  
	  	if(num >= 200) {
	    	if(num - 200 <= 10) {
	      		return true;
	    	} 
	  	}
	  
	  	return false;
	}

	/*
	Given 2 int values, return true if one is negative and one is positive. 
	Except if the parameter "negative" is true, then return true only if both are negative.

	posNeg(1, -1, false) → true
	posNeg(-1, 1, false) → true
	posNeg(-4, -5, true) → true
	*/
	public boolean posNeg(int a, int b, boolean negative) {
  		if(negative == true && a < 0 && b < 0) {
    		return true;
  		}
  		else if (a < 0 && b > 0 && negative == false || a > 0 && b < 0 && negative == false) {
    		return true;
  		} 
  		return false;
	}

	/*
	Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", 
	return the string unchanged. Note: use .equals() to compare 2 strings.
	
	notString("candy") → "not candy"
	notString("x") → "not x"
	notString("not bad") → "not bad"
	*/
	public String notString(String str) {
  		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    		return str;
  		}
  		return "not " + str;
	}

	/*
	Given a non-empty string and an int n, return a new string where the char at index 
	n has been removed. The value of n will be a valid index of a char in the original 
	string (i.e. n will be in the range 0..str.length()-1 inclusive).
	
	missingChar("kitten", 1) → "ktten"
	missingChar("kitten", 0) → "itten"
	missingChar("kitten", 4) → "kittn"
	*/
	public String missingChar(String str, int n) {
  		String retVal = "";
		for (int i = 0; i < n; i++) {
			retVal += str.charAt(i);
		}

		for (int i = n + 1; i < str.length(); i++) {
			retVal += str.charAt(i);
		}
		return retVal;
	}

	/*
	Given a string, return a new string where the first and last chars have been exchanged.
	
	frontBack("code") → "eodc"
	frontBack("a") → "a"
	frontBack("ab") → "ba"
	*/
	public String frontBack(String str) {
  		if(str.length() <= 1) {
			return str;
		}	
		String first = str.substring(str.length() - 1, str.length());
		String middle = str.substring(1, str.length() - 1);
		String last = str.substring(0, 1);
		String retVal = first + middle + last;
		return retVal;
  	}

  	/*
	Given a string, we'll say that the front is the first 3 chars of the string. 
	If the string length is less than 3, the front is whatever is there. 
	Return a new string which is 3 copies of the front.

	front3("Java") → "JavJavJav"
	front3("Chocolate") → "ChoChoCho"
	front3("abc") → "abcabcabc"
	*/
	public String front3(String str) {
		String retVal = "";
	  
	  	if(str.length() == 1) {
	   		String concat_ = str.substring(0,1);
	    	for(int i = 0; i < 3; i++) {
	      		retVal += concat_;
	    	}
	  	}
	  
	  	if(str.length() == 2) {
	    	String concat_ = str.substring(0,2);
	    	for(int i = 0; i < 3; i++) {
	      		retVal += concat_;
	    	}
	  	}	
	  
	  	if(str.length() >= 3) {
	    	String concat_ = str.substring(0,3);
	    	for(int i = 0; i < 3; i++) {
	      		retVal += concat_;
	    	}
	  	}
	  	return retVal;
	}

	/*
	Given a string, take the last char and return a new string with the last char 
	added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

	backAround("cat") → "tcatt"
	backAround("Hello") → "oHelloo"
	backAround("a") → "aaa"
	*/
	public String backAround(String str) {
		String char_ = str.substring(str.length() - 1, str.length());
	  	return char_ + str + char_;
	}

	/*
	Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
	Use the % "mod" operator

	or35(3) → true
	or35(10) → true
	or35(8) → false
	*/
	public boolean or35(int n) {
		if(n > 0){
	    	if(n % 3 == 0 || n % 5 == 0){
	      		return true;
	    	}
	  	}	
	  	return false;
	}

	/*
	Given a string, take the first 2 chars and return the string with the 2 chars added at both the 
	front and back, so "kitten" yields"kikittenki". If the string length is less than 2, 
	use whatever chars are there.

	front22("kitten") → "kikittenki"
	front22("Ha") → "HaHaHa"
	front22("abc") → "ababcab"
	*/
	public String front22(String str) {
		String retVal = "";
		if(str.length() <= 1) {
			String firstChars = str.substring(0,str.length());
		    retVal = firstChars + str + firstChars;
		}
		if(str.length() > 1) {
		    String firstTwo = str.substring(0,2);
		    retVal = firstTwo + str + firstTwo;
		}
		return retVal;
	}

	/*
	Given a string, return true if the string starts with "hi" and false otherwise.

	startHi("hi there") → true
	startHi("hi") → true
	startHi("hello hi") → false
	*/
	public boolean startHi(String str) {
		if(str.length() >= 2) {
			String var_ = str.substring(0,2);
	    	if(var_.equals("hi") == true) {
	      		return true;
	    	}	
	    	return false;
	  	}
	  	return false;
	}

	/*
	Given two temperatures, return true if one is less than 0 and the other is greater than 100.

	icyHot(120, -1) → true
	icyHot(-1, 120) → true
	icyHot(2, 120) → false
	*/
	public boolean icyHot(int temp1, int temp2) {
  		if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0) {
    		return true;
  		}
  		return false;
	}

	/*
	Given 2 int values, return true if either of them is in the range 10..20 inclusive.

	in1020(12, 99) → true
	in1020(21, 12) → true
	in1020(8, 99) → false
	*/
	public boolean in1020(int a, int b) {
  		if(a >= 10 && a <= 20 || b >= 10 && b <= 20) {
    		return true;
  		}
  		return false;
  	}

  	/*
	We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	Given 3 int values, return true if 1 or more of them are teen.

	hasTeen(13, 20, 10) → true
	hasTeen(20, 19, 10) → true
	hasTeen(20, 10, 13) → true
	*/
	public boolean hasTeen(int a, int b, int c) {
  		if(a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
    		return true;
  		}
  		return false;
	}

	/*
	Given a string, if the string "del" appears starting at index 1, 
	return a string where that "del" has been deleted. Otherwise, return the string unchanged.

	delDel("adelbc") → "abc"
	delDel("adelHello") → "aHello"
	delDel("adedbc") → "adedbc"
	*/
	public String delDel(String str) {
		int length = str.length();
	  	if(str.length() == 3 && str != "del" || str.length() < 3) {
	    	return str;
	  	}
	  	if(str.length() == 3 && str == "del") {
	    	return "del";
	  	}
		if(str.substring(1,4).equals("del")) {
			return str.substring(0,1) + "" + str.substring(4,length);
		}
		
		else { 
			return str;
		}
	}

	/*
	█░░░█ █▀▀█ █▀▀█ █▀▄▀█ █░░█ █▀▀█   █▀█
	█▄█▄█ █▄▄█ █▄▄▀ █░▀░█ █░░█ █░░█   ░▄▀
	░▀░▀░ ▀░░▀ ▀░▀▀ ▀░░░▀ ░▀▀▀ █▀▀▀   █▄▄
	*/

	/*
	Given a string and a non-negative int n, return a larger string that is n copies of the original string.

	stringTimes("Hi", 2) → "HiHi"
	stringTimes("Hi", 3) → "HiHiHi"
	stringTimes("Hi", 1) → "Hi"
	*/
	public String stringTimes(String str, int n) {
		String retval = "";
	  	for(int i = 0; i < n; i++) {
	    	retval += str;
	  	}
	  	return retval;
	}

	/*
	Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or 
	whatever is there if the string is less than length 3. Return n copies of the front;

	frontTimes("Chocolate", 2) → "ChoCho"
	frontTimes("Chocolate", 3) → "ChoChoCho"
	frontTimes("Abc", 3) → "AbcAbcAbc"
	*/
	public String frontTimes(String str, int n) {
	 	String concat = "";
	  	for(int i = 0; i < n; i++) {
	    	if(str.length() <= 2) {
	      		concat += str;
	    	}
	    	else {
	      		concat += str.substring(0,3); 
	    	}
	  	}
	  	return concat;
	}

	/*
	Count the number of "xx" in the given string. 
	We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

	countXX("abcxx") → 1
	countXX("xxx") → 2
	countXX("xxxx") → 3
	*/
	public int countXX(String str) {
  		int count = 0;
  		String arr[] = str.split("");
  		for(int i = 0; i < arr.length - 1; i++) {
    		if(arr[i].equals("x") && arr[i + 1].equals("x")) {
	      			count += 1;
	    	}
  		}
  		return count;
	}

	/*	
	Given a string, return true if the 
	first instance of "x" in the string is immediately followed by another "x".

	doubleX("axxbb") → true
	doubleX("axaxax") → false
	doubleX("xxxxx") → true
	*/

	boolean doubleX(String str) {
  		String arr [] = str.split("");
  		String firstInstance = "";
  		for(int i = 0; i < arr.length - 1; i++) {
    		if(arr[i].equals("x")) {
      			firstInstance = arr[i];
      			if(arr[i + 1].equals(firstInstance)) {
        			return true;
      			}
      			else {
        			return false;
      			}	
    		}
  		}
  		return false;
	}

	/*
	Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

	stringBits("Hello") → "Hlo"
	stringBits("Hi") → "H"
	stringBits("Heeololeo") → "Hello"
	*/

	public String stringBits(String str) {
  		String arr [] = str.split("");
  		String concat = "";
  		for(int i = 0; i < arr.length; i++) {
    		if(i == 0 || i % 2 == 0) {
      			concat += arr[i];
    		}
  		}
  		return concat;
	}

	/*
	Given a non-empty string like "Code" return a string like "CCoCodCode".

	stringSplosion("Code") → "CCoCodCode"
	stringSplosion("abc") → "aababc"
	stringSplosion("ab") → "aab"
	*/

	public String stringSplosion(String str) {
	 	String concat = "";
	  	for(int i = 0; i <= str.length(); i++) {
	    	concat += str.substring(0, i);
	  	}
	  	return concat;
	}


	/*
	Given a string, return the count of the number of times that a substring 
	length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

	last2("hixxhi") → 1
	last2("xaxxaxaxx") → 1
	last2("axxxaaxx") → 2
	*/
	public int last2(String str) {
	  	int count = 0;
	  	if(str.length() >= 2) {
	    	String sub = str.substring(str.length() - 2,str.length());
	    	for(int i = 0; i < str.length() - 2; i++) {
	      		if(str.substring(i , i + 2).equals(sub)) {
	        		count += 1;
	      		}
	    	}
	    	return count;
	  	}
	  	else {
	    	return 0;
	  	}
	}

	/*
	Given an array of ints, return the number of 9's in the array.

	arrayCount9([1, 2, 9]) → 1
	arrayCount9([1, 9, 9]) → 2
	arrayCount9([1, 9, 9, 3, 9]) → 3
	*/

	public int arrayCount9(int[] nums) {
  		int count = 0;
  		for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == 9) {
      			count += 1;
    		}
  		}
  		return count;
	}

	/*
	Given an array of ints, return true if one of the first 4 elements 
	in the array is a 9. The array length may be less than 4.

	arrayFront9([1, 2, 9, 3, 4]) → true
	arrayFront9([1, 2, 3, 4, 9]) → false
	arrayFront9([1, 2, 3, 4, 5]) → false

	*/

	public boolean arrayFront9(int[] nums) {
  		for(int i = 0; i < nums.length; i++) {
    		if(i <= 3 && nums[i] == 9) {
      			return true;
    		}
  		}
  		return false;
	}

	/*
	Given an array of ints, return true if the sequence of numbers 1, 2, 3 
	appears in the array somewhere.

	array123([1, 1, 2, 3, 1]) → true
	array123([1, 1, 2, 4, 1]) → false
	array123([1, 1, 2, 1, 2, 3]) → true
	*/

	public boolean array123(int[] nums) {
  		for(int i = 0; i < nums.length - 2; i++) {
    		if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
      			return true;
    		}
  		}
  		return false;
	}

	/*
	Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

	stringMatch("xxcaazz", "xxbaaz") → 3
	stringMatch("abc", "abc") → 2
	stringMatch("abc", "axc") → 0
	*/

	public int stringMatch(String a, String b) {
  		int count = 0;
  		int min; 
  		if(a.length() < b.length()) {
    		min = a.length();
  		}
  		else {
    		min = b.length();
  		}
  
  		for(int i = 0; i < min - 1; i++) {
    		if(a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
      			count += 1;
    		}
  		}
  		return count;
	}

	/*
	Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

	stringX("xxHxix") → "xHix"
	stringX("abxxxcd") → "abcd"
	stringX("xabxxxcdx") → "xabcdx"
	*/

	public String stringX(String str) {
  		if(str.length() == 1) {
    		return str;
  		}
  
  		String letter [] = str.split("");
  		String concat = "";
  		if(letter[0].equals("x")) {
    		concat += "x";
  		}
  		for(int i = 0; i < letter.length; i++) {
    		if(!(letter[i].equals("x"))) {
      			concat += letter[i];
    		}
  		}
  		if(letter[letter.length - 1].equals("x")) {
    		concat += "x";
  		}
  		return concat;
	}








	/*
	█▀▀ ▀▀█▀▀ █▀▀█ ░▀░ █▀▀▄ █▀▀▀   ▄█░
	▀▀█ ░░█░░ █▄▄▀ ▀█▀ █░░█ █░▀█   ░█░
	▀▀▀ ░░▀░░ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀▀   ▄█▄
	*/

	/*
	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

	helloName("Bob") → "Hello Bob!"
	helloName("Alice") → "Hello Alice!"
	helloName("X") → "Hello X!"
	*/
	public String helloName(String name) {
  		return "Hello " + name + "!";
	}

	/*
	Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

	makeAbba("Hi", "Bye") → "HiByeByeHi"
	makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	makeAbba("What", "Up") → "WhatUpUpWhat"
	*/
	public String makeAbba(String a, String b) {
  		return a + b + b + a;
	}

	/*
	The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
	In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
	Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

	makeTags("i", "Yay") → "<i>Yay</i>"
	makeTags("i", "Hello") → "<i>Hello</i>"
	makeTags("cite", "Yay") → "<cite>Yay</cite>"
	*/
	public String makeTags(String tag, String word) {
	 	return "<" + tag + ">" + word + "</" + tag + ">";
	}

	/*
	Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word 
	is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) 
	to extract the String starting at index i and going up to but not including index j.

	makeOutWord("<<>>", "Yay") → "<<Yay>>"
	makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	makeOutWord("[[]]", "word") → "[[word]]"
	*/
	public String makeOutWord(String out, String word) {
		//char outArr = out.split("");
	  	String firstTwo = out.substring(0,2);
	  	String lastTwo = out.substring(2,4);
	  	return firstTwo + word + lastTwo;
	}

	/*
	Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	The string length will be at least 2.

	extraEnd("Hello") → "lololo"
	extraEnd("ab") → "ababab"
	extraEnd("Hi") → "HiHiHi"
	*/
	public String extraEnd(String str) {
	 	String concat = "";
	  	for(int i = 0; i < 3; i++) {
	    	concat += str.substring(str.length() - 2, str.length());
	  	}
	  	return concat;
	}

	/*
	Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

	firstTwo("Hello") → "He"
	firstTwo("abcdefg") → "ab"
	firstTwo("ab") → "ab"
	*/
	public String firstTwo(String str) {
  		if(str.length() < 2) {
    		return str;
  		}
  		else {
    		return str.substring(0,2);
  		}
	}

	/*	
	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

	firstHalf("WooHoo") → "Woo"
	firstHalf("HelloThere") → "Hello"
	firstHalf("abcdef") → "abc"
	*/

	public String firstHalf(String str) {
  		if(str.length() % 2 == 0) {
    		return str.substring(0, str.length() / 2);
  		}
  		return str;
	}

	/*
	Given a string, return a version without the first and last char, so 
	"Hello" yields "ell". The string length will be at least 2.

	withoutEnd("Hello") → "ell"
	withoutEnd("java") → "av"
	withoutEnd("coding") → "odin"
	*/

	public String withoutEnd(String str) {
  		if(str.length() < 3) {
    		return "";
  		}
  		if(str.length() > 3) {
    		return str.substring(1, str.length() - 1);
  		}
  		return str;
	}	

	/*	
	Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. 
	The strings will not be the same length, but they may be empty (length 0).

	comboString("Hello", "hi") → "hiHellohi"
	comboString("hi", "Hello") → "hiHellohi"
	comboString("aaa", "b") → "baaab"
	*/

	public String comboString(String a, String b) {
  		String short_ = "";
  		String long_= "";
  		if(a.length() < b.length()) {
    		short_ = a;
    		long_ = b;
  		}
  		if(a.length() > b.length()) {
    		short_ = b;
    		long_ = a;
  		}
  		return short_ + long_ + short_;
	}

	/*
	Given 2 strings, return their concatenation, except omit the first char of each. 
	The strings will be at least length 1.

	nonStart("Hello", "There") → "ellohere"
	nonStart("java", "code") → "avaode"
	nonStart("shotl", "java") → "hotlava"
	*/

	public String nonStart(String a, String b) {
	  	String a_ = a.substring(1,a.length());
	  	String b_ = b.substring(1,b.length());
	  	return a_ + b_;
	}

	/*
	Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	The string length will be at least 2.

	left2("Hello") → "lloHe"
	left2("java") → "vaja"
	left2("Hi") → "Hi"
	*/
	public String left2(String str) {
  		return str.substring(2, str.length()) + str.substring(0,2);
	}

	/*
	Given a string, return a string length 1 from its front, unless front is false, in which 
	case return a string length 1 from its back. The string will be non-empty.

	theEnd("Hello", true) → "H"
	theEnd("Hello", false) → "o"
	theEnd("oh", true) → "o"
	*/

	public String theEnd(String str, boolean front) {
  		if(front == true) {
    		return str.substring(0,1);
  		}
  		return str.substring(str.length() - 1, str.length());
	}

	/*
	Given a string, return a version without both the first 
	and last char of the string. The string may be any length, including 0.

	withouEnd2("Hello") → "ell"
	withouEnd2("abc") → "b"
	withouEnd2("ab") → ""
	*/

	public String withouEnd2(String str) {
	  	if(str.length() == 0  || str.length() == 1) {
	    	return "";
	  	}
	  	return str.substring(1,str.length() - 1);
	}

	/*
	Given a string of even length, return a string made of the middle two chars, 
	o the string "string" yields "ri". The string length will be at least 2.

	middleTwo("string") → "ri"
	middleTwo("code") → "od"
	middleTwo("Practice") → "ct"
	*/

	public String middleTwo(String str) {
  		int middle = str.length() / 2;
  		return str.substring(middle - 1, middle + 1);
	}

	/*
	Given a string, return true if it ends in "ly".

	endsLy("oddly") → true
	endsLy("y") → false
	endsLy("oddy") → false
	*/
	public boolean endsLy(String str) {
	  	if(str.length() <= 1) {
	    	return false;
	  	}
	  	if(str.substring(str.length() - 2, str.length()).equals("ly")) {
	    	return true;
	  	}
	  	return false;
	}

	/*
	Given a string and an int n, return a string made of the first and last n chars 
	from the string. The string length will be at least n.

	nTwice("Hello", 2) → "Helo"
	nTwice("Chocolate", 3) → "Choate"
	nTwice("Chocolate", 1) → "Ce"
	*/
	public String nTwice(String str, int n) {
  		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	/*
	Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string 
	length 2, use the first 2 chars. The string length will be at least 2.

	twoChar("java", 0) → "ja"
	twoChar("java", 2) → "va"
	twoChar("java", 3) → "ja"
	*/

	public String twoChar(String str, int index) {
  		if(str.length() - 1 == index || index == str.length() || index < 0 || index > str.length()) {
    		return str.substring(0, 2);
  		}
  		return str.substring(index, index + 2);
	}

	/*
	Given a string of odd length, return the string length 3 from its middle, so 
	"Candy" yields "and". The string length will be at least 3.

	middleThree("Candy") → "and"
	middleThree("and") → "and"
	middleThree("solving") → "lvi"
	*/

	public String middleThree(String str) {
  		if(str.length() < 3) {
    		return str;
  		}
		int middle = str.length() / 2;
		return str.substring(middle - 1, middle + 2);
	}

	/*
	Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

	hasBad("badxx") → true
	hasBad("xbadxx") → true
	hasBad("xxbadxx") → false
	*/

	public boolean hasBad(String str) {
  		if(str.length() < 3 || str.length() == 3 && !(str.substring(0,3).equals("bad"))) {
    		return false;
  		}
  		if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")) {
    		return true;
  		}
  		return false;
	}

	/*
	Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

	atFirst("hello") → "he"
	atFirst("hi") → "hi"
	atFirst("h") → "h@"
	*/
	public String atFirst(String str) {
  		if(str.length() == 0) {
    		return "@@";
  		}
  		if(str.length() == 1) {
    		return str.substring(0,1) + "@";
  		}
  		return str.substring(0,2);
	}

	/*
	Given 2 strings, a and b, return a new string made of the first char of a and 
	the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

	lastChars("last", "chars") → "ls"
	lastChars("yo", "java") → "ya"
	lastChars("hi", "") → "h@"
	*/

	public String lastChars(String a, String b) {
	  	if(a.length() == 0 && b.length() == 0) {
	    	return "@@";
	  	}
	  	if(a.length() > 0 && b.length() == 0) {
	    	return a.substring(0,1) + "@";
	  	}
	  	if(a.length() == 0 && b.length() > 0) {
	    	return "@" + b.substring(b.length() - 1, b.length());
	  	}
	  	return a.substring(0,1) + b.substring(b.length() - 1, b.length());
	}

	/*
	Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

	conCat("abc", "cat") → "abcat"
	conCat("dog", "cat") → "dogcat"
	conCat("abc", "") → "abc"
	*/
	public String conCat(String a, String b) {
  		if(a.length() == 0) {
    		return b;
  		}
  		if(b.length() == 0) {
    		return a;
  		}
  		if(a.substring(a.length() - 1, a.length()).equals(b.substring(0,1))) {
    		return a.substring(0, a.length() - 1) + b;
  		}
  		return a + b;
	}

	/*
	Given a string of any length, return a new string where the last 2 chars, 
	if present, are swapped, so "coding" yields "codign".

	lastTwo("coding") → "codign"
	lastTwo("cat") → "cta"
	lastTwo("ab") → "ba"
	*/
	public String lastTwo(String str) {
	  	if(str.length() <= 1) {
	    	return str;
	  	}
	  	String secondToLast = str.substring(str.length() - 2, str.length() - 1);
	  	String last = str.substring(str.length() - 1, str.length());
	  	return str.substring(0,str.length() - 2) + last + secondToLast;
	}

	/*
	Given a string, if the string begins with "red" or "blue" return 
	that color string, otherwise return the empty string.

	seeColor("redxx") → "red"
	seeColor("xxred") → ""
	seeColor("blueTimes") → "blue"
	*/

	public String seeColor(String str) {
	  	if(str.length() <= 2) {
	    	return "";
	  	}
	  	if(str.substring(0,3).equals("red")) {
	    	return "red";
	  	}
	  	if(str.length() == 3 && !(str.substring(0,2).equals("red"))) {
	    	return "";
	  	}
	  	if(str.substring(0,4).equals("blue")) {
	    	return "blue";
	  	}
	  	return "";
	}


	/*
	Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

	minCat("Hello", "Hi") → "loHi"
	minCat("Hello", "java") → "ellojava"
	minCat("java", "Hello") → "javaello"
	*/
	public String minCat(String a, String b) {
  		int length = b.length();
  		if(b.length() > a.length()) {
    		int a_length = a.length();
    		return a + b.substring(b.length() - a_length, b.length());
  		}
  		return a.substring(a.length() - length, a.length()) + b;
	}

	/*
	Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

	extraFront("Hello") → "HeHeHe"
	extraFront("ab") → "ababab"
	extraFront("H") → "HHH"
	*/

	public String extraFront(String str) {
  		if(str.length() == 0) {
    		return "";
  		}
  		if(str.length() == 1) {
    		return str + str + str;
  		}
  		return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
	}


	/*
	Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

	without2("HelloHe") → "lloHe"
	without2("HelloHi") → "HelloHi"
	without2("Hi") → ""
	*/
	public String without2(String str) {
  		if(str.length() == 0) {
    		return "";
  		}
  		if(str.length() == 1) {
    		return str;
  		}
  		if(str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))) {
    		return str.substring(2,str.length());
  		}
  		return str;
	}


	/*
	Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

	deFront("Hello") → "llo"
	deFront("java") → "va"
	deFront("away") → "aay"
	*/
	public String deFront(String str) {    
  		if(str.substring(0,1).equals("a") && !(str.substring(1,2).equals("b"))) {
    		return str.substring(0,1) + str.substring(2,str.length());
  		}
  		if(!(str.substring(0,1).equals("a")) && (str.substring(1,2).equals("b"))) {
    		return str.substring(1,str.length());
  		}
 		 if(!(str.substring(0,1).equals("a")) && !(str.substring(1,2).equals("b"))) {
    		return str.substring(2, str.length());
  		}
  		return str;
	}

















	/*
	█▀▀█ █▀▀█ █▀▀█ █▀▀█ █░░█   ▄█░
	█▄▄█ █▄▄▀ █▄▄▀ █▄▄█ █▄▄█   ░█░
	▀░░▀ ▀░▀▀ ▀░▀▀ ▀░░▀ ▄▄▄█   ▄█▄
	*/

	/*
	Given an array of ints, return true if 6 appears as either the first or last element in the array. 
	The array will be length 1 or more.

	firstLast6([1, 2, 6]) → true
	firstLast6([6, 1, 2, 3]) → true
	firstLast6([13, 6, 1, 2, 3]) → false
	*/
	public boolean firstLast6(int[] nums) {
	  	if(nums[0] == 6 || nums[nums.length - 1] == 6) {
	    	return true;
	  	}
	  	return false;
	}

	/*
	Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

	sameFirstLast([1, 2, 3]) → false
	sameFirstLast([1, 2, 3, 1]) → true
	sameFirstLast([1, 2, 1]) → true
	*/
	public boolean sameFirstLast(int[] nums) {
  		if(nums.length >= 1) {
    		if(nums[0] == nums[nums.length - 1]){
      			return true;
    		}
  		}
  		return false;
	}

	/*	
	Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

	makePi() → [3, 1, 4]
	*/
	public int[] makePi() {
		int [] arr_ = {3,1,4};
	  	return arr_;
	}

	/*	
	Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
	Both arrays will be length 1 or more.

	commonEnd([1, 2, 3], [7, 3]) → true
	commonEnd([1, 2, 3], [7, 3, 2]) → false
	commonEnd([1, 2, 3], [1, 3]) → true
	*/
	public boolean commonEnd(int[] a, int[] b) {
	 	if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
	    	return true;
	  	}
  		else {
    		return false;
  		}
	}

	/*	
	Given an array of ints length 3, return the sum of all the elements.

	sum3([1, 2, 3]) → 6
	sum3([5, 11, 2]) → 18
	sum3([7, 0, 0]) → 7
	*/
	public int sum3(int[] nums) {
		int sum = 0; 
  		for(int i = 0; i < nums.length; i++) {
    		sum += nums[i];
  		}
  		return sum;
	}

	/*	
	Given an array of ints length 3, return an array with the elements 
	"rotated left" so {1, 2, 3} yields {2, 3, 1}.

	rotateLeft3([1, 2, 3]) → [2, 3, 1]
	rotateLeft3([5, 11, 9]) → [11, 9, 5]
	rotateLeft3([7, 0, 0]) → [0, 0, 7]
	*/
	public int[] rotateLeft3(int[] nums) {
		int [] arr = {nums[1], nums[2], nums[0]};
		return arr;
	}

	/*	
	Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

	reverse3([1, 2, 3]) → [3, 2, 1]
	reverse3([5, 11, 9]) → [9, 11, 5]
	reverse3([7, 0, 0]) → [0, 0, 7]
	*/
	public int[] reverse3(int[] nums) {
  		int arr [] = {nums[2], nums[1], nums[0]};
  		return arr;
	}

	/*	
	Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
	and set all the other elements to be that value. Return the changed array.

	maxEnd3([1, 2, 3]) → [3, 3, 3]
	maxEnd3([11, 5, 9]) → [11, 11, 11]
	maxEnd3([2, 11, 3]) → [3, 3, 3]
	*/
	public int[] maxEnd3(int[] nums) {
		int arr [] = new int[nums.length];

	  	if(nums[0] > nums[2]) {
	    	for(int i = 0; i <= nums.length - 1; i++) {
	      		arr[i] += nums[0];
	    	}
	  	}
	  
	  	if(nums[2] > nums[0]) {
	    	for(int i = 0; i <= nums.length - 1; i++) {
	      		arr[i] += nums[2];
	    	}
	  	}
	  
	  	if(nums[2] == nums[0]) {
	    	for(int i = 0; i <= nums.length - 1; i++) {
	      		arr[i] += nums[2];
	    	}
	  	}
	  	return arr;
	}

	/*	
	Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

	sum2([1, 2, 3]) → 3
	sum2([1, 1]) → 2
	sum2([1, 1, 1, 1]) → 2
	*/
	public int sum2(int[] nums) {
	  	int sum = 0;
	  
	  	if(nums.length == 0) {
	    	return 0;
	  	}
	  
	  	else if(nums.length < 2) {
	    	for(int i = 0; i < nums.length; i++) {
	      		sum += nums[i];
	    	}
	  	}

	  	else {
	    	for(int i = 0; i < 2; i++) {
	      		sum += nums[i];
	    	}
	  	}
	  	return sum;
	}

	/*	
	Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

	middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	*/
	public int[] middleWay(int[] a, int[] b) {
		int midA = a[a.length / 2];
	  	int midB = b[b.length / 2];
	  	int [] arr = {midA, midB};
	  	return arr;
	}

	/*	
	Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
	The original array will be length 1 or more.

	makeEnds([1, 2, 3]) → [1, 3]
	makeEnds([1, 2, 3, 4]) → [1, 4]
	makeEnds([7, 4, 6, 2]) → [7, 2]
	*/
	public int[] makeEnds(int[] nums) {
	  	int firstEle = nums[0];
	  	int lastEle = nums[nums.length - 1];
	  	int [] retVal = {firstEle, lastEle};
	  	return retVal;
	}

	/*	
	Given an int array length 2, return true if it contains a 2 or a 3.

	has23([2, 5]) → true
	has23([4, 3]) → true
	has23([4, 5]) → false
	*/
	public boolean has23(int[] nums) {
	  	for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] == 2 || nums[i] == 3) {
	      		return true;
	    	}
	  	}
	  	return false;
	}

	/*	
	Given an int array length 2, return true if it does not contain a 2 or 3.

	no23([4, 5]) → true
	no23([4, 2]) → false
	no23([3, 5]) → false
	*/
	public boolean no23(int[] nums) {
	  	for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] == 2 || nums[i] == 3) {
	      		return false;
	    	}
	  	}
	  	return true;
	}

	/*
	Given an int array, return a new array with double the length where its last element is the same as 
	the original array, and all the other elements are 0. The original array will be length 1 or more. 
	Note: by default, a new int array contains all 0's.

	makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	makeLast([1, 2]) → [0, 0, 0, 2]
	makeLast([3]) → [0, 3]
	*/
	public int[] makeLast(int[] nums) {
	  	int arr [] = new int[nums.length * 2];
	  	int doub = arr.length; 
	  	for(int i = 0; i <= arr.length - 1; i++) {
	    	arr[i] += 0;
	    	arr[arr.length - 1] = nums[nums.length - 1];
	  	}
	  	return arr;
	}

	/*
	Given an int array, return true if the array contains 2 twice, or 3 twice. 
	The array will be length 0, 1, or 2.

	double23([2, 2]) → true
	double23([3, 3]) → true
	double23([2, 3]) → false
	*/
	public boolean double23(int[] nums) {
	  	if(nums.length == 0 || nums.length == 1) {
	    	return false;
	  	}
	  	int twocount = 0;
	  	int threecount = 0;
	  	for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] == 2) {
	      		twocount += 1;
	    	}
	    	if(nums[i] ==3){
	      		threecount += 1;
	    	}
	  	}
	  
	  	if(twocount == 2 || threecount == 2) {
	    	return true;
	  	}
	  	else {
	    	return false;
	  	}
	}

	/*
	Given an int array length 3, if there is a 2 in the array immediately followed by a 3, 
	set the 3 element to 0. Return the changed array.

	fix23([1, 2, 3]) → [1, 2, 0]
	fix23([2, 3, 5]) → [2, 0, 5]
	fix23([1, 2, 1]) → [1, 2, 1]
	*/
	public int[] fix23(int[] nums) {
  		int store2index = 0;
  		int arr [] = new int[nums.length];
  		for(int i = 0; i <= nums.length - 1; i++) {
  			if(nums[i] == 2) {
  				store2index = i;
    		}
	  	}

	  	if(nums[store2index + 1] != 3) {
	  	  	arr[0] = nums[0];
	  	  	arr[1] = nums[1];
	  	  	arr[2] = nums[2];
	  	}
		
		if(nums[0] == 2 && nums[store2index + 1] == 3) {
			arr[0] = 2;
			arr[1] = 0;
			arr[2] = nums[nums.length - 1];
		}

		if(nums[1] == 2 && nums[store2index + 1] == 3) {
			arr[0] = nums[0];
			arr[1] = 2;
			arr[2] = 0;
		}

		return arr;
	}

	/*
	Start with 2 int arrays, a and b, of any length. Return how many of 
	the arrays have 1 as their first element.

	start1([1, 2, 3], [1, 3]) → 2
	start1([7, 2, 3], [1]) → 1
	start1([1, 2], []) → 1
	*/
	public int start1(int[] a, int[] b) {
	  	if(a.length <= 0 && b.length > 0 && b[0] == 1){
	    	return 1;
	  	}
	  	if(b.length <= 0 && a.length > 0 && a[0] == 1){
	    	return 1;
	  	}
	  	// These two cases will check for only one that equals 1
	  	if(a.length > 0 && a[0] != 1 && b.length > 0 && b[0] == 1) {
	    	return 1;
	  	}
	  	if(b.length > 0 && b[0] != 1 && a.length > 0 && a[0] == 1) {
	    	return 1;
	  	}
	  	// checking for both arrays that equal 1
	  	if(a.length > 0 && a[0] == 1 && b[0] == 1 && b.length > 0) {
	    	return 2;
	  	}
	  return 0;
	}

	/*
	Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
	Return the array which has the largest sum. In event of a tie, return a.

	biggerTwo([1, 2], [3, 4]) → [3, 4]
	biggerTwo([3, 4], [1, 2]) → [3, 4]
	biggerTwo([1, 1], [1, 2]) → [1, 2]
	*/
	public int[] biggerTwo(int[] a, int[] b) {
	  	int sum1 = 0;
	  	int sum2 = 0;
	  
	  	for(int i = 0; i <= a.length - 1; i++) {
	    	sum1+=a[i];
	  	}
	  	for(int i = 0; i <= b.length - 1; i++) {
	    	sum2+=b[i];
	  	}
	  	if(sum1 > sum2 || sum1 == sum2) {
	    	return a;
	  	}
	  	else {
	    	return b;
	  	}
	}

	/*
	Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
	The original array will be length 2 or more.

	makeMiddle([1, 2, 3, 4]) → [2, 3]
	makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	makeMiddle([1, 2]) → [1, 2]
	*/
	public int[] makeMiddle(int[] nums) {
	  	int after2ndindex = nums.length / 2;
	  	if(nums.length <= 2) {
	    	return nums;
	  	}
	  	int numbers [] = {nums[after2ndindex - 1], nums[after2ndindex]};
	  	return numbers;
	}

	/*
	Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

	plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	*/

	public int[] plusTwo(int[] a, int[] b) {
  		int [] array = {a[0], a[1], b[0], b[1]};
  		return array;
	}

	/*
	Given an array of ints, swap the first and last elements in the array. Return the modified array. 
	The array length will be at least 1.

	swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	swapEnds([1, 2, 3]) → [3, 2, 1]
	swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	*/

	public int[] swapEnds(int[] nums) {
	  	int [] arr = new int[nums.length];
	  	for(int i = 1; i < nums.length - 1; i++) {
	    	arr[i] += nums[i];
	  	}
	  	arr[0] = nums[nums.length-1];
	  	arr[nums.length-1] = nums[0];
	  	return arr;
	}

	/*
	Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
	
	midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	midThree([1, 2, 3]) → [1, 2, 3]
	*/

	public int[] midThree(int[] nums) {
	  	int start = (nums.length / 2) - 1; // 1
	  	int middlePos = start + 1; // 2
	  	int end = middlePos + 1; // 3
	  	int [] arr = {nums[start], nums[middlePos], nums[end]};
	  	return arr;
	}

	/*	
	Given an array of ints of odd length, look at the first, last, 
	and middle values in the array and return the largest. The array length will be a least 1.

	maxTriple([1, 2, 3]) → 3
	maxTriple([1, 5, 3]) → 5
	maxTriple([5, 2, 3]) → 5
	*/

	public int maxTriple(int[] nums) {
	  	int firstEle = nums[0];
	  	int middle = nums[nums.length/2];
	  	int last = nums[nums.length - 1];
	  	if(firstEle > middle && firstEle > last) {
	    	return firstEle;
	  	}
	  	if(middle > firstEle && middle > last) {
	    	return middle;
	  	}
	  	else{
	    	return last;
	    }
	}

	/*
	Given an int array of any length, return a new array of its first 2 elements. 
	If the array is smaller than length 2, use whatever elements are present.

	frontPiece([1, 2, 3]) → [1, 2]
	frontPiece([1, 2]) → [1, 2]
	frontPiece([1]) → [1]
	*/

	public int[] frontPiece(int[] nums) {
	  	int double_ [] = new int[2];
	  	int single_ [] = new int[1];
	  	int emp [] = {};

	  	if(nums.length == 1) {
	    	single_[0] = nums[0];
	    	return single_;
	  	}
	  	if(nums.length >= 2) {
	    	double_[0] = nums[0];
	    	double_[1] = nums[1];
	    	return double_;
	  	}
	  	return emp;
	}

	/*
	We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
	Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

	unlucky1([1, 3, 4, 5]) → true
	unlucky1([2, 1, 3, 4, 5]) → true
	unlucky1([1, 1, 1]) → false
	*/
	public boolean unlucky1(int[] nums) {
	  	int num = 0;
	  	for(int i = 0; i < nums.length - 1; i++) {
	    	if(nums[i] == 1) {
	      		num = i;
	      		if(nums[num + 1] == 3) {
	        		return true;
	      		}
	    	}
	  	}
	  	return false;
	}


	/*
	Given 2 int arrays, a and b, return a new array length 2 containing, 
	as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, 
	but there will be 2 or more elements available between the 2 arrays.

	make2([4, 5], [1, 2, 3]) → [4, 5]
	make2([4], [1, 2, 3]) → [4, 1]
	make2([], [1, 2]) → [1, 2]
	*/
	public int[] make2(int[] a, int[] b) {
	  	int [] array = new int[2];

	  	if(a.length == 0 && b.length >= 2) {
	    	for(int i = 0; i < 2; i++) {
	      		array[i] += b[i];
	    	}
	  	}
	  
	  	if(b.length == 0 && a.length >= 2) {
	    	for(int i = 0; i < 2; i++) {
	      		array[i] += a[i];
	    	}
	  	}
	  
	  	if(a.length >= 2 && b.length == 0) {
	    	array[0] = a[0];
	    	array[1] = a[1];
	  	}

	  	if(a.length == 1 && b.length == 1) {
	    	array[0] = a[0];
	    	array[1] = b[0];
	  	}

	  	if(a.length == 0 && b.length >= 2) {
	    	array[0] = b[0];
	    	array[1] = b[1];
	  	}

	  	if(a.length == 1 && b.length >= 2) {
	    	array[0] = a[0];
	    	array[1] = b[0];
	  	}
	  
	  	if(a.length >= 2 && b.length >= 2) {
	    	array[0] = a[0];
	    	array[1] = a[1];
	  	}
	  	return array;
	}  


	/*
	Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
	If either array is length 0, ignore that array.

	front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	front11([1], [2]) → [1, 2]
	front11([1, 7], []) → [1]
	*/

	public int[] front11(int[] a, int[] b) {
	  	int arr [] = new int[1];
	  	int arr2 [] = new int[2];
	  	int arrempty [] = {};
	  	if(a.length == 0 && b.length == 0) {
	    	return arrempty;
	  	}
	  	if(a.length >= 1 && b.length == 0) {
	    	arr[0] = a[0];
	    	return arr;
	  	}
	  	if(b.length >= 1 && a.length == 0) {
	    	arr[0] = b[0];
	    	return arr;
	  	}
	  	arr2[0] = a[0];
	  	arr2[1] = b[0];
	  	return arr2;
	}


	/*
	█░░ █▀▀█ █▀▀▀ ░▀░ █▀▀   ▄█░
	█░░ █░░█ █░▀█ ▀█▀ █░░   ░█░
	▀▀▀ ▀▀▀▀ ▀▀▀▀ ▀▀▀ ▀▀▀   ▄█▄
	*/

	/*
	█░░ █▀▀█ █▀▀▀ ░▀░ █▀▀   █▀█
	█░░ █░░█ █░▀█ ▀█▀ █░░   ░▄▀
	▀▀▀ ▀▀▀▀ ▀▀▀▀ ▀▀▀ ▀▀▀   █▄▄
	*/

	/*
	█▀▀ ▀▀█▀▀ █▀▀█ ░▀░ █▀▀▄ █▀▀▀   █▀█
	▀▀█ ░░█░░ █▄▄▀ ▀█▀ █░░█ █░▀█   ░▄▀
	▀▀▀ ░░▀░░ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀▀   █▄▄
	*/

	/*
	█▀▀ ▀▀█▀▀ █▀▀█ ░▀░ █▀▀▄ █▀▀▀   █▀▀█
	▀▀█ ░░█░░ █▄▄▀ ▀█▀ █░░█ █░▀█   ░░▀▄
	▀▀▀ ░░▀░░ ▀░▀▀ ▀▀▀ ▀░░▀ ▀▀▀▀   █▄▄█
	*/

	/*
	█▀▀█ █▀▀█ █▀▀█ █▀▀█ █░░█   █▀█
	█▄▄█ █▄▄▀ █▄▄▀ █▄▄█ █▄▄█   ░▄▀
	▀░░▀ ▀░▀▀ ▀░▀▀ ▀░░▀ ▄▄▄█   █▄▄
	*/

	/*
	Return the number of even ints in the given array. Note: the % "mod" 
	operator computes the remainder, e.g. 5 % 2 is 1.

	countEvens([2, 1, 2, 3, 4]) → 3
	countEvens([2, 2, 0]) → 3
	countEvens([1, 3, 5]) → 0
	*/
	public int countEvens(int[] nums) {
	  	int count = 0;
	  	for(int i = 0; i < nums.length; i++) {
	    	if(nums[i] % 2 == 0) {
	      		count++;
	    	}
	  	}
	  	return count;
	}

	/*
	Given an array length 1 or more of ints, return the difference between the largest and smallest 
	values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return 
	the smaller or larger of two values.

	bigDiff([10, 3, 5, 6]) → 7
	bigDiff([7, 2, 10, 9]) → 8
	bigDiff([2, 10, 7, 2]) → 8
	*/
	public int bigDiff(int[] nums) {
		int largest = nums[0];
  		int smallest = nums[0];
  		for(int i = 0; i < nums.length; i++) {
    		if(largest < nums[i]) {
      			largest = nums[i];
    		}
  		}

  		for(int i = 0; i < nums.length; i++) {
    		if(smallest > nums[i]) {
      			smallest = nums[i];
    	}
  	}
  	return largest - smallest;
	}



	/*
	█▀▀█ █▀▀█ █▀▀█ █▀▀█ █░░█   █▀▀█
	█▄▄█ █▄▄▀ █▄▄▀ █▄▄█ █▄▄█   ░░▀▄
	▀░░▀ ▀░▀▀ ▀░▀▀ ▀░░▀ ▄▄▄█   █▄▄█
	*/

	/*
	█▀▀█ █▀▀█   ▄   ▄█░
	█▄▄█ █░░█   ░   ░█░
	▀░░▀ █▀▀▀   ▀   ▄█▄
	*/

	/*
	█▀▀█ █▀▀ █▀▀ █░░█ █▀▀█ █▀▀ ░▀░ █▀▀█ █▀▀▄   ▄█░
	█▄▄▀ █▀▀ █░░ █░░█ █▄▄▀ ▀▀█ ▀█▀ █░░█ █░░█   ░█░
	▀░▀▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀░▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀░░▀   ▄█▄
	*/

	/*
	█▀▀█ █▀▀ █▀▀ █░░█ █▀▀█ █▀▀ ░▀░ █▀▀█ █▀▀▄   █▀█
	█▄▄▀ █▀▀ █░░ █░░█ █▄▄▀ ▀▀█ ▀█▀ █░░█ █░░█   ░▄▀
	▀░▀▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀░▀▀ ▀▀▀ ▀▀▀ ▀▀▀▀ ▀░░▀   █▄▄
	*/

	/*
	█▀▄▀█ █▀▀█ █▀▀█   ▄█░
	█░▀░█ █▄▄█ █░░█   ░█░
	▀░░░▀ ▀░░▀ █▀▀▀   ▄█▄
	*/

	/*
	█▀▄▀█ █▀▀█ █▀▀█   █▀█
	█░▀░█ █▄▄█ █░░█   ░▄▀
	▀░░░▀ ▀░░▀ █▀▀▀   █▄▄
	*/

	/*
	█▀▀ █░░█ █▀▀▄ █▀▀ ▀▀█▀▀ ░▀░ █▀▀█ █▀▀▄ █▀▀█ █░░   ▄█░
	█▀▀ █░░█ █░░█ █░░ ░░█░░ ▀█▀ █░░█ █░░█ █▄▄█ █░░   ░█░
	▀░░ ░▀▀▀ ▀░░▀ ▀▀▀ ░░▀░░ ▀▀▀ ▀▀▀▀ ▀░░▀ ▀░░▀ ▀▀▀   ▄█▄
	*/

	/*
	█▀▀ █░░█ █▀▀▄ █▀▀ ▀▀█▀▀ ░▀░ █▀▀█ █▀▀▄ █▀▀█ █░░   █▀█
	█▀▀ █░░█ █░░█ █░░ ░░█░░ ▀█▀ █░░█ █░░█ █▄▄█ █░░   ░▄▀
	▀░░ ░▀▀▀ ▀░░▀ ▀▀▀ ░░▀░░ ▀▀▀ ▀▀▀▀ ▀░░▀ ▀░░▀ ▀▀▀   █▄▄
	*/



}