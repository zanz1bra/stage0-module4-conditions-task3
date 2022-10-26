package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'o' || character == 'u' || character == 'i') {
            System.out.println("Vowel");
        } else if (character == 'b' || character == 'd' || character == 'c' || character == 'f' || character == 'g' || character == 'j' || character == 'k' || character == 'l' || character == 'm' || character == 'n' ||character == 'p' || character == 'q' || character == 's' || character == 't' || character == 'v' || character == 'x' || character == 'z' || character == 'h' || character == 'r' || character == 'w' || character == 'y') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
