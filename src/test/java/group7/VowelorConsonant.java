package group7;

public class VowelorConsonant 
{
	// Function to find whether an input
    // character is vowel or not
    static void Vowel_Or_Consonant(char y)
    {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U')
        	
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
	public static void main(String[] args) 
	{

		 Vowel_Or_Consonant('W');
	        Vowel_Or_Consonant('I');
	}

}
