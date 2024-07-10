package store.myfamily.hellospring;


import java.io.IOException;
import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) throws IOException {
        // PaymentService에서 의존성을 설정했던 부분은 클라이언트에 넘겨서 사용
        // 생성자에 의존성을 넘김 이것이 기존에 사용했던 방법이다.
        ObjectFActory objectFactory = new ObjectFActory();
        PaymentService paymentService = objectFactory.PaymentService();

        Payment payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7));
        System.out.println("payment = " + payment);
    }
}
