/*Q4. Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5
*/
public class String4
{
  public static void main (String[]args)
  {
     String S="Education";
	 int count=0;
	 for(int i=0;i<S.length();i++)
	 {
	    char ch=S.charAt(i);
	   if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	   {
	     count ++;
	   }
	 }System.out.println(count);
  }
}
/*
public class StringVC {
    public static void main(String[] args) {

        String str = "Education";
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is a letter
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                // Check vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {

                    vowels++;
                } 
                // Else consonant
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
