package verTwo;

public class MoneyDispenseChainTwoImpl implements MoneyDispenseChain {


    private  MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmout() >= 500){
            int numberOfNote = currency.getAmout()/500;
            int remainder = currency.getAmout() % 500;
            System.out.println("Depensing " + numberOfNote + "Notes of Rs 500");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            } else {
                moneyDispenseChain.dispense(currency);
            }
        }
    }
}
