package my.home.helper.model;

public class BusinessBuilder {

    private static BusinessBuilder instance = new BusinessBuilder();
    private String id = null;
    private String description = "";

    private BusinessBuilder(){};

    public static BusinessBuilder create() {
        return instance;
    }

    public BusinessBuilder withDescription(String description) {
        this.description = description;
        return instance;
    }

    public BusinessBuilder withId(String id) {
        this.id = id;
        return instance;
    }

    public Business build() {
        Business result = new Business(this.description);
        if (id != null) {
            result.setId(id);
        }
        return result;
    }
}
