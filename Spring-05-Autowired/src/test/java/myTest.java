import com.yang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test1()
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shut();
        people.getDog().shut();
    }
}
