package verTwo;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        MachineDispenseChain machineDispenseChain = new MachineDispenseChain();

        Scanner scanner = null;
        while (true){
            int amout = 0;

            try {
                System.out.println("Please enter amout to despense:");
                scanner = new Scanner(System.in);
                amout = scanner.nextInt();

                if (amout %100 !=0){
                    System.out.println("Amount be multiple of Rs 100");
                } else {
                    machineDispenseChain.getMoneyDispenseChain1().dispense(new Currency(amout));
                }


            } catch (Exception e){
                e.printStackTrace();
            }
//            finally {
//                if(scanner != null)
//                    scanner.close();
//            }
        }
    }
}
