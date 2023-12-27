package nivell2_CallBack;

public class CreditCardPayment implements  PaymentMethod{


    @Override
    public void pay(PaymentCallBack callBack, PaymentDetalls paymentdetall) {
        boolean success = procesPayment(paymentdetall);
        if (success) {
            callBack.onPaymentSuccess();
        } else {
            callBack.onPaymentError("targeta de credito no valida");
        }

    }
    private boolean procesPayment(PaymentDetalls detalls){
        int expiryDate = converterDate(detalls.getExpireDate());

        int date = 202312;
        boolean success = false;

       if(date < expiryDate){
           return success = true;
       }

        return success;
    }

    private int converterDate(String date){
        return Integer.parseInt(date.replace("-",""));
    }

}

