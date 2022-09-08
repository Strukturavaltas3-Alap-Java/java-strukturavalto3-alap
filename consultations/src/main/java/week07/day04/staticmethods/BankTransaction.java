package week07.day04.staticmethods;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions = 0;
    private static long sumOfTransactions = 0;
    private static long currentMinValue = MAX_TRANSACTION_VALUE;
    private static long currentMaxValue = MIN_TRANSACTION_VALUE;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MAX_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Transaction is not valid:" + transactionValue);
        }
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        if (transactionValue < currentMinValue) {
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }

    }

    public static void initDay() {
        countOfTransactions = 0;
        long sumOfTransactions = 0;
        long currentMinValue = MAX_TRANSACTION_VALUE;
        long currentMaxValue = MIN_TRANSACTION_VALUE;
    }

    public static long getAverageOfTransaction() {
        if (countOfTransactions > 0) {
            return (long) (sumOfTransactions * 1.0 / countOfTransactions);
        }
        return 0;
    }

    public long getCurrentMinValue() {
        if (countOfTransactions == 0) {
            return 0;
        }
        return currentMinValue;
    }

    public long getCurrentMaxValue() {
        if (countOfTransactions == 0) {
            return 0;
        }
        return currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    //CTRL+ALT+L
}
