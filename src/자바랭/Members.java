package 자바랭;

public class Members {
    private String id;
    private String name;

    public Members(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id +","+name;
    }
}
