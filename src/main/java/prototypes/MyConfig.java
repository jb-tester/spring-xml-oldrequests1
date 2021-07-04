package prototypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * *
 * <p>Created by irina on 04.07.2021.</p>
 * <p>Project: apring-xml-ver</p>
 * *
 */
@Configuration
@ImportResource("classpath:spring-config.xml")
public class MyConfig {
    @Bean
    public Foo1 foo1() {
        return new Foo1();
    }

    @Bean() @Scope("prototype")
    public Bar1 bar1() {
        return new Bar1();
    }
}
