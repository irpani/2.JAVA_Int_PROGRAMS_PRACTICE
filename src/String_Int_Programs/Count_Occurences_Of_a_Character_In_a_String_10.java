package String_Int_Programs;

public class Count_Occurences_Of_a_Character_In_a_String_10 {

	public static void main(String[] args) {

		String str = "JavaProgramming Java Oops";
		int strlength = str.length();
		int totalcountafterrem = str.replace("a", "").length();

		int acount = strlength - totalcountafterrem;
		System.out.println("No of times 'a' repeats..." + acount);
	}

}

// O/p: No of times 'j' repeats...2
// No of times 'a' repeats...5
// No of times 'o' repeats...2