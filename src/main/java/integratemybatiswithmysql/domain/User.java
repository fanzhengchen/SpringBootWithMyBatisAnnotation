package integratemybatiswithmysql.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by mark on 17-1-18.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("name")
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[name :" + name + " id: " + id + "]";
    }
}
