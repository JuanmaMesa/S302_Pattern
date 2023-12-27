package nivell2_CallBack;

public class Main {

    public static void main(String[] args){

        ShoeStore shoeStore = new ShoeStore();
        PaymentMethod paymentMethod = new CreditCardPayment();
        PaymentDetalls detall = new PaymentDetalls("2023-01");

        shoeStore.processPurchase(paymentMethod,detall);



    }




}
