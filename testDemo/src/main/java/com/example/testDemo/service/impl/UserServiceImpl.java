package com.example.testDemo.service.impl;

import com.example.testDemo.dto.UserDTO;
import com.example.testDemo.entity.UserEntity;
import com.example.testDemo.repository.UserRepository;
import com.example.testDemo.service.UserService;
import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public void insert(UserDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(dto, UserEntity.class);
        repository.saveAndFlush(userEntity);
    }

    @Override
    public void update(UserDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(dto, UserEntity.class);
        repository.saveAndFlush(userEntity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
