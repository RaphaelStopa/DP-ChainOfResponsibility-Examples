package verTwo;

public class MoneyDispenseChainThreeImpl implements MoneyDispenseChain {


    private  MoneyDispenseChain moneyDispenseChain;

    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmout() >= 200){
            int numberOfNote = currency.getAmout()/200;
            int remainder = currency.getAmout() % 200;
            System.out.println("Depensing " + numberOfNote + "Notes of Rs 200");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            } else {
                moneyDispenseChain.dispense(currency);
            }
        }
    }

    public MoneyDispenseChain getMoneyDispenseChain() {
        return moneyDispenseChain;
    }
}
