package week04.day03;

import java.util.Scanner;

public class Hangman {

    private static final String[] WORDS = {"almafa","zebra","elefánt","körte"};

    private String wordToFind = "almafa";  //generateRandomWord();
    private String wordStatus = "_".repeat(wordToFind.length());
    private int chances = 7;

    public static void main(String[] args) {
        new Hangman().run();
    }

//    private String setUpWordStatus(){
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<wordToFind.length();i++){
//            sb.append("_");
//        }
//        return sb.toString();
//    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Itt tartasz:" + wordStatus);
            System.out.println("ENnyi a próbálkozásod:" + chances);
            System.out.println("Mi a tipped:");
            String guess = scanner.nextLine();

            if (wordToFind.contains(guess)) {
                System.out.println("Talált!");
                updateWordStatus(guess);
            } else {
                System.out.println("Nem talált!");
                chances--;
            }
        } while (!wordToFind.equals(wordStatus) && chances > 0);

        if(chances ==0){
            System.out.println("Bukta");
        }else{
            System.out.println("Nyertél!");
        }
    }

    private void updateWordStatus(String guess) {
        char[] actualStatus = wordStatus.toCharArray();
        for (int i = 0; i < wordToFind.length(); i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                actualStatus[i] = guess.charAt(0);
            }
        }
        wordStatus = new String(actualStatus);
    }


}
