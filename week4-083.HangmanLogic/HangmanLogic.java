
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // if the word does not contain the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if (!this.word.contains(letter) && !guessedLetters.contains(letter)) {
            this.numberOfFaults++;
            this.guessedLetters += letter;
        }
        else if (guessedLetters.contains(letter)) {
            // if the letter has already been guessed, nothing happens
        }
        else {
            this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // create the hidden word by going through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        String hiddenword = "";
        for (int i = 0; i < this.word.length(); i++) {
           char thisLetter = this.word.charAt(i);
           String word = "" + thisLetter;

           if (this.guessedLetters.contains(word)) {
               hiddenword += thisLetter;
           }
           else {
               hiddenword += "_";
           }
        }
        return hiddenword;
        // return the hidden word at the end
    }



}