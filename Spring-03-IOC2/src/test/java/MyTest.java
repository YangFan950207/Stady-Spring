import com.yangfan.model.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Hello hello = (Hello) context.getBean("hello2");
        System.out.println(hello.getString());
    }
}
