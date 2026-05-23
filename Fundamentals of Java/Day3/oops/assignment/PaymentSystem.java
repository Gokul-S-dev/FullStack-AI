interface Payment {
    void CreditCardPayment();
    void UPIpayment();    
}

class OnlinePayment implements Payment{
    @Override
    public void CreditCardPayment(){
        System.out.println("Payment done through Credit Card");
    }

    @Override
    public void UPIpayment(){
        System.out.println("Payment done through UPI");
    }
}

public class PaymentSystem {

    public static void main(String[] args){
        Payment payment = new OnlinePayment();
        payment.CreditCardPayment();
        payment.UPIpayment();
    }
    
}
