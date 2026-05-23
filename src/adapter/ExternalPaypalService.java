package adapter;

public class ExternalPaypalService {
    public void makePayment(String currency, double amount){
        System.out.println("Pago realizado con Paypal: " +currency + "" +amount);
    }
}
