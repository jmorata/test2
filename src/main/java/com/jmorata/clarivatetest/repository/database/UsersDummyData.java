package com.jmorata.clarivatetest.repository.database;

import com.jmorata.clarivatetest.domain.User;
import com.jmorata.clarivatetest.domain.UserId;
import org.springframework.stereotype.Component;

import java.util.TreeMap;

@Component
public class UsersDummyData {

    public void loadDummyData(TreeMap<UserId, User> userIdUserTreeMap) {
        userIdUserTreeMap.clear();
        for (int i = 0; i < 5; i++) {
            createUserDummy(userIdUserTreeMap, "demo" + i);
        }
    }

    private void createUserDummy(TreeMap<UserId, User> userIdUserTreeMap, String username) {
        UserId userId = UserId.of(username);
        User user = User.of(username);
        userIdUserTreeMap.put(userId, user);
    }
}
