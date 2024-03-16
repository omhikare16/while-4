/*Write a program to print the only consonant alphabets from A to Z, but there must
not be any vowels in the output.
Output: B C D F G H J K L M N P Q R S T V W X Y Z*/
class Code6{
	public static void main(String[] args) {
        System.out.println("Consonant alphabets from A to Z (excluding vowels):");
        
        char letter = 'A';
        while (letter <= 'Z') {
            if (!isVowel(letter)) {
                System.out.print(letter + " ");
            }
            letter++;
        }
    }
    
    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
