package painpoints;

public class Pojo {
    private String user;
    private Integer age;

    public Pojo(String user) {
        this.user = user;
    }

    public Pojo(String user, Integer age) {
        this.user = user;
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
