package integratemybatiswithmysql;

import integratemybatiswithmysql.domain.Book;
import integratemybatiswithmysql.domain.User;
import integratemybatiswithmysql.mapper.BookMapper;
import integratemybatiswithmysql.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUserMapper() {
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testBook(){
        List<Book> books = bookMapper.findAll();
        for(Book book:books){
            System.out.println(book.toString());
        }
    }
}
