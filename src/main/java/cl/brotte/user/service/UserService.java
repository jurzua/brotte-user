package cl.brotte.user.service;

import cl.brotte.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private Map<Long, User> userMap;

    public UserService() {
        this.userMap = new HashMap<>();
        this.userMap.put(0L, User.builder().id(0L).lastname("urzua").name("jorge").build());
        this.userMap.put(1L, User.builder().id(1L).lastname("urzua").name("ricardo").build());
        this.userMap.put(2L, User.builder().id(2L).lastname("urzua").name("joaquin").build());
        this.userMap.put(3L, User.builder().id(3L).lastname("urzua").name("gerardo").build());

    }


    public List<User> findAll(Optional<String> nameFilter) {

        if (!nameFilter.isPresent()) {
            return new ArrayList<>(this.userMap.values());
        }

        List<User> result = new ArrayList<>();
        for(User user : this.userMap.values()) {
            if(user.getName().contains(nameFilter.get())) {
                result.add(user);
            }
        }
        return result;
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
