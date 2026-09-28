import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int years;

        principal = sc.nextDouble();
        rate = sc.nextDouble();
        years = sc.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), years);
        double interest = amount - principal;

        System.out.println("Compound Interest = " + interest);
        System.out.println("Amount = " + amount);
    }
}