package integratemybatiswithmysql.mapper;

import integratemybatiswithmysql.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by mark on 17-1-18.
 */
@Mapper
public interface BookMapper {

    @Results(id = "findAllBooks", value = {
            @Result(property = "bookId", column = "book_id", id = false)
    })
    @Select("select * from Book")
    public List<Book> findAll();
}
