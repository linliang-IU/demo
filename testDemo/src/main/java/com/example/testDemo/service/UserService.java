package com.example.testDemo.service;

import com.example.testDemo.dto.UserDTO;

public interface UserService {
    /**
     * 新增用户
     * @param dto
     * @return
     */
    void insert(UserDTO dto);

    /**
     * 修改用户
     * @param dto
     */
    void update(UserDTO dto);

    /**
     * 根据ID删除
     * @param id
     */
    void delete(Integer id);
}
