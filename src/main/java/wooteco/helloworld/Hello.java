package wooteco.helloworld;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;

public class Hello {
    @Id
    private Long id;
    private final String name;
    private final LocalDateTime createdAt;

    public Hello(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
