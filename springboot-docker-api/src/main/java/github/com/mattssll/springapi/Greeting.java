package github.com.mattssll.springapi;

public class Greeting {

    private final long id;
    private final String content;

    // constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // getters, jackson dependency will be able to, through the class, json this
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
