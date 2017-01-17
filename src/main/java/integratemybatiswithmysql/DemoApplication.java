package integratemybatiswithmysql;

import integratemybatiswithmysql.domain.User;
import integratemybatiswithmysql.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class DemoApplication implements CommandLineRunner {

    private final UserMapper userMapper;

    public DemoApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(userMapper.findUserByName("mark"));
    }

    @Bean
    public UserMapper getUserMapper() {
        return userMapper;
    }
}
