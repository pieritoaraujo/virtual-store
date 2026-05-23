package adapter;

public class PayPalAdapter implements PaymentProcessor{
    private ExternalPaypalService paypalService;

    public PayPalAdapter(ExternalPaypalService paypalService){
        this.paypalService = paypalService;
    }
    @Override
    public void pay(double amount) {
        paypalService.makePayment("PEN", amount);
    }
}
