import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.pojo.People;

/**
 * Created by leeyangy on 2021/7/24 17:58
 */
public class MyTese {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        People people = context.getBean("people",People.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
