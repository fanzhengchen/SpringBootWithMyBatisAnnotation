package integratemybatiswithmysql.requestbody;

/**
 * Created by mark on 17-1-18.
 */
public class Login {
    private String name;
    private String id;

    public Login(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
