import com.yang.config.YangConfig;
import com.yang.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(YangConfig.class);
        User bean = (User) context.getBean("getUser");
        System.out.println(bean);
        String string = (String) context.getBean("getStr");
        System.out.println(string);
        Integer integer = (Integer)context.getBean("integer");
        System.out.println(integer);
    }
}
