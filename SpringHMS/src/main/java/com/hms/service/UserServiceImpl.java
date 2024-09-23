
package com.hms.service;

import com.hms.model.User;
import com.hms.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return userRepo.findAll();
    }

    @Override
    public User fetchUserById(int userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public void deleteUserById(int userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public User updateUser(int userId, User user) {
        User userDB = userRepo.findById(userId).get();
        if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername());
        )
    }


}
