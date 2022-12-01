package Strategy;

public class Main {
    
    public static void main(String[] args) {
        PaymentStrategy strategy;

        String paymentMethod = 'paypal';
        if (paymentMethod.equals("creditcard")) {
            strategy = new CreditCardPayment();
        } else {
            strategy = new PayPalPayment();
        }

        strategy.pay(amount: 100);
    }
}
