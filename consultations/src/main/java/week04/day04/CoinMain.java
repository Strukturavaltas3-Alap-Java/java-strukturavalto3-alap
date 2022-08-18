package week04.day04;

public class CoinMain {

    public static void main(String[] args) {
        Coin coin = Coin.TEN;
        Coin[] coins = Coin.values();
        for(Coin actual: coins){
            System.out.println(actual);
        }
    }
}
