package store.myfamily.hellospring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) throws IOException {
        // 스프링으로 하나씩 적용 어느것이 변하였는지 이 코드가 왜 스프링인지 확인하길 바란다.
        // BeanFactory가 스프링이다... 코드가 어떻게 변하였는지도 확인하세요.
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ObjectFActory.class);
        PaymentService paymentService = beanFactory.getBean(PaymentService.class);

        Payment payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7));
        System.out.println("payment = " + payment);
    }
}
