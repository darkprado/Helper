package my.home.helper.model;

import com.sun.istack.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Business {

    @NotNull
    private String id;
    @NotNull
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public Business() {
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }

    public Business(String description) {
        this();
        this.description = description;
    }
}
