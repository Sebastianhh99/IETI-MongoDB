package org.ada.school.service;

import java.util.List;

import org.ada.school.dto.UserDto;
import org.ada.school.repository.UserDocument;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceMongoDB implements UserService{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserDocument create(UserDto userDto) {
        return userRepository.save( new UserDocument(userDto) );
    }

    @Override
    public UserDocument findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserDocument> all() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public UserDocument update(UserDto userDto, String id) {
        if(userRepository.existsById(id)){
            UserDocument user = userRepository.findById(id).get();
            user.update(userDto);
            userRepository.save(user);
            return user;
        }
        return null;
    }
    
}
