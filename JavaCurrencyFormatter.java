import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            double payment = in.nextDouble();
            in.close();
            
            // Write your code here.
            String us = String.format("US: " + "$%,.2f", payment);
            String india = String.format("India: " + "Rs.%,.2f", payment);
            String china = String.format("China: " + "￥%,.2f", payment);
            String france = String.format("France: " + "%.2f €", payment);
            
            System.out.println(us);
            System.out.println(india);
            System.out.println(china);
            System.out.println(france);
    }
    
}
