package wordguessinggame;

public class Game {
    String word;

        Game(String chosenWord) {
            word = chosenWord;
        }
    public static void main(String[] args) { }  

    // public String getWordToGuess() {
    //     StringBuilder hiddenWord = new StringBuilder(word); 
    //         for (int i = 1; i < word.length(); i++) {
    //             hiddenWord.replace(i, word.length(), "_");
    //         } 
    //     return hiddenWord.toString();
    // }

    // Debugging exercise 01: 
    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder(word);
            for (int i = 0; i < this.word.length(); i++) {
                Character currentLetter = word.charAt(0);
                if (i == 0) {
                    builder.append(currentLetter);
                } else {
                    builder.replace(i, word.length(), ("_"));
                }
            }
        return builder.toString();
    }
}


