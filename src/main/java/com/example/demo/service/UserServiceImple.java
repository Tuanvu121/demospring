package com.example.demo.service;
import com.example.demo.model.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImple implements UserService{
    private static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "Nguyen Thi Mong mo", "mongmo@gmail.com","0987654321","avatar.img","123"));
        users.add(new User(2, "bui nhu lac", "laclac@gmail.com","0123456789","avatar1.img","123"));
        users.add(new User(3, "Phan Thị Lỏng Lẻo", "longleo@gmail.com","0987564664","avatar3.img","123"));
        users.add(new User(4, "Bành Thị Tèo", "teo@gmail.com","0874845455","avatar9.img","123"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<>();
        for( User user : users)
            result.add(UserMapper.toUserDto(user));
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for( User user : users){
            if(user.getId() == id)
                return UserMapper.toUserDto(user);
        }
        throw new NotFoundException("User not exits");
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<UserDto> result = new ArrayList<>();
        for( User user : users) {
            if(user.getName().contains(keyword))
                result.add(UserMapper.toUserDto(user));
        }
        return result;
    }
}
