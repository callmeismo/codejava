public class SavingsAcountTest {
    public static void main(String[] args) {
        SavingsAcount saver1 = new SavingsAcount();
        saver1.setSavBal(2000);
        saver1.setIntRate(0.04);

        SavingsAcount saver2 = new SavingsAcount();
        saver2.setSavBal(3000);
        saver2.setIntRate(0.04);
        
        System.out.printf("New balance for saver 1 with interest at 4%%: $%.2f\n", saver1.calculateMonthlyInterest());

        System.out.printf("New balance for saver 2 with interest at 4%%: $%.2f\n", saver2.calculateMonthlyInterest());

        saver1.setIntRate(0.05);
        saver2.setIntRate(0.05);

        System.out.printf("New balance for saver 1 with interest at 5%%: $%.2f\n", saver1.calculateMonthlyInterest());

        System.out.printf("New balance for saver 2 with interest at 5%%: $%.2f\n", saver2.calculateMonthlyInterest());
    }
}
