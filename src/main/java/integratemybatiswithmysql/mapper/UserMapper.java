package integratemybatiswithmysql.mapper;

import integratemybatiswithmysql.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mark on 17-1-18.
 */
@Mapper
public interface UserMapper {

    @Select("select * from User where name=#{name}")
    User findUserByName(@Param("name") String name);


    @Select("select * from User")
    List<User> findAll();
}
