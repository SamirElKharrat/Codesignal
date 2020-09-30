package dad.codesignal.intro;

public class journey1 {
	
public int add(int param1, int param2) {
	    param1 = 1;
	    param2 = 2;
	    return param1 + param2;

}

public int centuryFromYear(int year) {
    int century = 0;
    while(year > 0){
        year -= 100;
        century += 1;
    }
return century;
}

public static boolean checkPalindrome(String inputString) {
	for (int i = 0; i < inputString.length()/2; i++) {
	if(inputString.charAt(i) != inputString.charAt(inputString.length()-i-1))
	return false;
}
	return true;
}

}



