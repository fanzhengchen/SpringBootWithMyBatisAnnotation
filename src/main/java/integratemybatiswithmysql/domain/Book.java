package integratemybatiswithmysql.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.ibatis.annotations.Property;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;

import java.io.Serializable;

/**
 * Created by mark on 17-1-18.
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("book_id")
    private String bookId;

    private String name;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id :" + bookId + " name:" + name + "]";
    }
}
