package store.myfamily.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFActory {

    @Bean
    public PaymentService PaymentService(){
        return new PaymentService(getExRateProvider());
    }

    @Bean
    public ExRateProvider getExRateProvider(){
        return new WebApiExRateProvider();
    }
}
