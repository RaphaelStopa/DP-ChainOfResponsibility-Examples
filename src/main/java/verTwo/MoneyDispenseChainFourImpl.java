package verTwo;

public class MoneyDispenseChainFourImpl implements MoneyDispenseChain {


    private  MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmout() >= 100){
            int numberOfNote = currency.getAmout()/ 100;
            int remainder = currency.getAmout() % 100;
            System.out.println("Depensing " + numberOfNote + "Notes of Rs 100");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            } else {
                moneyDispenseChain.dispense(currency);
            }
        }
    }
}
