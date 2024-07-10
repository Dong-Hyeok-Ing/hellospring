package store.myfamily.hellospring;

public class ObjectFActory {

    public PaymentService PaymentService(){
        return new PaymentService(getExRateProvider());
    }

    public ExRateProvider getExRateProvider(){
        return new WebApiExRateProvider();
    }
}
