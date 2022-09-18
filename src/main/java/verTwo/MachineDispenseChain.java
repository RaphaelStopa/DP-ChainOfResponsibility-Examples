package verTwo;

public class MachineDispenseChain {

    private MoneyDispenseChain moneyDispenseChain1;

    public MachineDispenseChain(){
        moneyDispenseChain1 = new MoneyDispenseChainImpl();
        MoneyDispenseChain moneyDispenseChain2 = new MoneyDispenseChainTwoImpl();
        MoneyDispenseChain moneyDispenseChain3 = new MoneyDispenseChainThreeImpl();
        MoneyDispenseChain moneyDispenseChain4 = new MoneyDispenseChainFourImpl();

        moneyDispenseChain1.setNextChain(moneyDispenseChain2);
        moneyDispenseChain2.setNextChain(moneyDispenseChain3);
        moneyDispenseChain3.setNextChain(moneyDispenseChain4);
    }

    public MoneyDispenseChain getMoneyDispenseChain1() {
        return moneyDispenseChain1;
    }
}
