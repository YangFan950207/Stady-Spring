import com.yang.pojo.Student;
import com.yang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
       Student student = (Student) context.getBean("student");
       User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user2",User.class);
        User user1 = (User) context.getBean("user2",User.class);
        System.out.println(user ==user1);
    }
}
