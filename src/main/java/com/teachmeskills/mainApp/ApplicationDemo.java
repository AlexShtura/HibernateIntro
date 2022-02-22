package com.teachmeskills.mainApp;

import com.teachmeskills.hibernateintro.model.User;
import com.teachmeskills.hibernateintro.service.BaseService;
import com.teachmeskills.hibernateintro.service.impl.UserServiceImpl;

public class ApplicationDemo {
    public static void main(String[] args) {
        User user = new User("Alex", "Shtura", "Minsk", true);
        BaseService<User> service = new UserServiceImpl();
        service.create(user);
    }
}
