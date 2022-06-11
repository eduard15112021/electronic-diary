package com.spring.diary.electronic.diary.dao;

import com.spring.diary.electronic.diary.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
