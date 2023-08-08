package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    private int card;
    private int oldCard;
    private float balance;

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getCard() {
        return card;
    }

    public int getOldCard() {
        return oldCard;
    }

    public float getBalance() {
        return balance;
    }

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
