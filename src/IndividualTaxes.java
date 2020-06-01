import java.util.Scanner;

public class IndividualTaxes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of company: ");
        int comNum = input.nextInt();

        System.out.print("Yearly incomes: ");
        int[] yearIncomes = new int[comNum];
        for (int i = 0; i < yearIncomes.length; i++) {
            int income = input.nextInt();
            yearIncomes[i] = income;
        }

        System.out.print("Individual taxes: ");
        int[] individualTaxes = new int[comNum];
        for (int i = 0; i < individualTaxes.length; i++) {
            int tax = input.nextInt();
            individualTaxes[i] = tax;
        }

        double tax = 0;
        double highestTax = 0;
        int firstCom = 0;
        for (int i = 0; i < yearIncomes.length; i++) {
            for (int j = i; j < individualTaxes.length; j++) {
                tax = yearIncomes[i] * individualTaxes[j] / 100;
                if (tax > highestTax || yearIncomes.length == 1) {
                    highestTax = tax;
                    firstCom = i + 1;
                }
                break;
            }
        }
        System.out.println(firstCom);
    }
}
