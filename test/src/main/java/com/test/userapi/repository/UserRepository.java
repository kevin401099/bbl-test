package com.test.userapi.repository;

import com.test.userapi.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public List<User> findAll(){
        return userList;
    }

    public User findById(Long id){
        for(User user: userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User save(User user){
        Random rand = new Random();
        user.setId(rand.nextLong());
        if(user.getAddress() == null){
            //validate
            return null;
        }
        userList.add(user);
        return user;
    }

    public User update(Long id){
        User user = findById(id);
        // update user
        return user;
    }

    public void delete(Long id){
        User user = findById(id);
        userList.remove(user);
        // to be implemented delete user
    }


}
