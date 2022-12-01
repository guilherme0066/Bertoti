package Strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println(String.format("Payment of %s $ with CreditCard completed", amount));
        
    }
    
}
