import com.chj.mapper.UserMapper;
import com.chj.mapper.UserMapperImpl;
import com.chj.mapper.UserMapperImpl2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author ：chj
 * @date ：Created in 2021/11/18 21:06
 * @params :
 */
public class Mytest {
    @Test
    public void selectUser() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        System.out.println(userMapper.selectUser());
    }
}
