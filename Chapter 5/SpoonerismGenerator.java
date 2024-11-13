import java.util.Scanner;

public class SpoonerismGenerator 
{
    
    public static void main(String[] args) 
    {
        run();  
    }
    public static String getWord(String input) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return scanner.nextLine().trim();
    }

    public static int vowelIndex(String word) 
    {
        word = word.toLowerCase();  
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;  
            }
        }
        return 0;  
    }

    public static void run() 
    {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");
        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        if (index1 == -1 || index2 == -1 || 
            word1.charAt(0) == 'a' || word1.charAt(0) == 'e' || word1.charAt(0) == 'i' || word1.charAt(0) == 'o' || word1.charAt(0) == 'u' ||
            word2.charAt(0) == 'a' || word2.charAt(0) == 'e' || word2.charAt(0) == 'i' || word2.charAt(0) == 'o' || word2.charAt(0) == 'u') {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
            String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);
            
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}
