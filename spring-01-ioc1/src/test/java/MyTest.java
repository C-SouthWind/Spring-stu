import com.chj.dao.UserDao;
import com.chj.dao.UserDaoImpl;
import com.chj.dao.UserDaoMysqlImpl;
import com.chj.service.UserService;
import com.chj.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：chj
 * @date ：Created in 2021/11/9 19:56
 * @params :
 */
public class MyTest {
    public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }
}
