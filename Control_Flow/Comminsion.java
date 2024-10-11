package Control_Flow;

import java.util.Scanner;

class Commission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sale amount:");
        int sales_amount = scanner.nextInt();
        scanner.close();
        int commission_percent = 0;
        float commission;

        if (sales_amount > 10000) {
            commission_percent = 30;
            System.out.println("Your commission percentage is 30%");
            commission = Calculating_comission(commission_percent, sales_amount);
            System.out.println("Your commission value: $" + commission);

        } else if (sales_amount >= 5001 && sales_amount <= 9999) {
            commission_percent = 20;
            System.out.println("Your commission percentage is 20%");
            commission = Calculating_comission(commission_percent, sales_amount);
            System.out.println("Your commission value: $" + commission);

        } else if (sales_amount >= 1001 && sales_amount <= 4999) {
            commission_percent = 10;
            System.out.println("Your commission percentage is 10%");
            commission = Calculating_comission(commission_percent, sales_amount);
            System.out.println("Your commission value: $" + commission);

        } else if (sales_amount < 1000) {
            System.out.println("No commission applicable for sales below $1000.");
        } else {
            System.out.println("Invalid input");
        }
    }

    
    public static float Calculating_comission(int commission_percent, int sales_amount) {
        
        return (sales_amount * commission_percent) / 100;
    }
}
