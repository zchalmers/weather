package com.weather.server.service;


import com.weather.server.repository.UserRecord;
import com.weather.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SQLService {

    @Autowired
    private UserRepository userRepository;

    public SQLService (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public void addUserToTable(UserRecord userRecord){
        UserRecord record = getUserFromTable(userRecord.getPhoneNumber());
        if (record == null){
            userRepository.save(userRecord);
        }
        else {
            System.out.println("USER PHONE NUMBER ALREADY IN TABLE");
        }
    }

    public UserRecord getUserFromTable(String phoneNumber){
        Optional<UserRecord> opt =  userRepository.findById(phoneNumber);
        if (opt.isPresent()){
            return opt.get();
        }
        else {
            System.out.println("COULD NOT FIND USER");
            return null;
        }
    }

    public List<UserRecord> getAllUsers(){
        return userRepository.findAll();

    }

    public String deleteUser(String phoneNumber){
        Optional<UserRecord> opt = userRepository.findById(phoneNumber);
        if (opt.isPresent()){
            userRepository.deleteById(phoneNumber);
            return "success";
        }
        else {
            return "fail";
        }



    }
}
