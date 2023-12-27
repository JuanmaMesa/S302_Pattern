package nivell2_CallBack;

public class ShoeStore {

    public void processPurchase(PaymentMethod paymentMethod, PaymentDetalls paymentDetalls){

        paymentMethod.pay(new PaymentCallBack() {
            @Override
            public void onPaymentSuccess() {
                System.out.println("Pago realizado con exito");
            }

            @Override
            public void onPaymentError(String errorMessage) {
                System.out.println("Error en el pago: " + errorMessage);

            }
        },paymentDetalls);


    }




}