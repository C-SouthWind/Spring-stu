package com.chj.mapper;

import com.chj.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/11/18 21:40
 * @params :
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {



    public List<User> selectUser() {
        User user = new User(7, "小李", "21312");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        addUser(user);
        deleteUser(7);
        return mapper.selectUser();
    }

    public Integer addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public Integer deleteUser(Integer id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
