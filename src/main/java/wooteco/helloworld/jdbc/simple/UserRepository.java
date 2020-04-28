package wooteco.helloworld.jdbc.simple;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();

    /**
     * select count(1) from user where name = name
     */
    int countByName(String name);
}
