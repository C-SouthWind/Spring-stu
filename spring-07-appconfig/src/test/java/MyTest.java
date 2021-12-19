import com.chj.config.ChjConfig;
import com.chj.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：chj
 * @date ：Created in 2021/11/16 20:56
 * @params :
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(ChjConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
