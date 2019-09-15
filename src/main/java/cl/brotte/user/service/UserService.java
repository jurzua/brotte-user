package cl.brotte.user.service;

import cl.brotte.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Long, User> userMap = new HashMap<>();


    public User getUserById(final Long userId) {
        return userMap.get(userId);
    }

    public User saveUser(final User user) {
        user.setId((long) userMap.size());
        userMap.put(user.getId(), user);
        return user;
    }
}
