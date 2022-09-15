package week08.day04;

public class Caesar implements Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypt(String input) {
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char actualChar = input.charAt(i);
            if (Character.isLetter(actualChar)) {
                int actualPosition = actualChar - 'a';
                int newPosition = (actualPosition + offset) % 26;
                char newChar = (char) ('a' + newPosition);
                result.append(newChar);
            } else {
                result.append(actualChar);
            }
        }
        return result.toString();
    }
}
