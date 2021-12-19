import com.chj.pojo.Student;
import com.chj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：chj
 * @date ：Created in 2021/11/10 20:34
 * @params :
 */
public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         * Student {
         *      name='chj',
         *      address=Address{
         *          address='中国'
         *      },
         *      books=[
         *          红楼梦,
         *          西游记,
         *          水浒传,
         *          三国演义
         *      ],
         *      hobbys=[
         *          听歌,
         *          敲代码,
         *          看电影
         *      ],
         *      card={
         *          身份证=123456789,
         *          银行卡=987654321
         *      },
         *      games=[
         *          LOL,
         *          COC,
         *          BOB
         *      ],
         *      wife='null',
         *      info={
         *          学号=111,
         *          性别=男,
         *          姓名=小明}
         *     }
         * */
    }

    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }
}
