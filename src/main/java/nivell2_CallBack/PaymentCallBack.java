package nivell2_CallBack;

public interface PaymentCallBack {

    void onPaymentSuccess();
    void onPaymentError(String errorMessage);

}
