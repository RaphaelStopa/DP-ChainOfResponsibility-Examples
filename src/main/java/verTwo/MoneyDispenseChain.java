package verTwo;

public interface MoneyDispenseChain {

    public abstract void setNextChain(MoneyDispenseChain moneyDispenseChain);
    public abstract void dispense(Currency currency);

}
