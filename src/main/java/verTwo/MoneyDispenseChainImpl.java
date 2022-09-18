package verTwo;

public class MoneyDispenseChainImpl implements MoneyDispenseChain {


    private  MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmout() >= 2000){
            int numberOfNote = currency.getAmout()/2000;
            int remainder = currency.getAmout() % 2000;
            System.out.println("Depensing " + numberOfNote + "Notes of Rs 2000");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            } else {
                moneyDispenseChain.dispense(currency);
            }
        }
    }
}
