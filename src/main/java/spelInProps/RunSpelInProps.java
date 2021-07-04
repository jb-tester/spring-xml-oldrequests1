package spelInProps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunSpelInProps {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spelInProps.xml");
        Dummy dummy = ctx.getBean(Dummy.class);
        System.out.println(dummy.getMyprops().get("key1"));
        System.out.println(dummy.getMyprops().get("key2"));
    }
}
