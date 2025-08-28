package numberGuess;

public class numberGuess {
    private int number;

    public numberGuess() {
        this.number = (int) (Math.random() * (99 - 10 + 1) + 10);
    }

    public boolean onesCorrect(int guess) {
        boolean correct = false;
        if((guess % 10) == (number % 10)){
            correct = true;
        }
        return correct;
    }

    public boolean tensCorrect(int guess) {
        boolean correct = false;
        if(((guess / 10) % 10) == ((number / 10) % 10)){
            correct = true;
        }
        return correct;
    }

    public boolean tensExist(int guess) {
        boolean correct = false;
        if((guess % 10) == ((number / 10) % 10)){
            correct = true;
        }
        return correct;
    }

    public boolean onesExist(int guess) {
        boolean correct = false;
        if(((guess / 10) % 10) == (number % 10)){
            correct = true;
        }
        return correct;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
