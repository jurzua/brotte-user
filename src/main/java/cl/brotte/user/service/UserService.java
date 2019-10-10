package cl.brotte.user.service;

import cl.brotte.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private Map<Long, User> userMap;

    public UserService() {
        this.userMap = new HashMap<>();
        this.userMap.put(0L, User.builder().id(0L).lastname("urzua").name("jorge").build());
        this.userMap.put(1L, User.builder().id(1L).lastname("urzua").name("ricardo").build());
    }

    public List<User> findAll() {
        return new ArrayList<>(this.userMap.values());
    }

    public User getUserById(final Long userId) {
        return userMap.get(userId);
    }

    public User saveUser(final User user) {
        user.setId((long) userMap.size());
        userMap.put(user.getId(), user);
        return user;
    }
}
