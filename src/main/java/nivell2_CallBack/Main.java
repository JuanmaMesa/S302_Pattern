package nivell2_CallBack;

public class Main {

    public static void main(String[] args){

        // metodos de pago
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new Paypal();
        PaymentMethod bankAccount = new BankAccount();


        PaymentDetalls paymentDetails = new PaymentDetalls("2023-01");// expira tu targeta de credito
        ShoeStore shoeStore = new ShoeStore();

        // pagos con distintas plataformas


    }




}
