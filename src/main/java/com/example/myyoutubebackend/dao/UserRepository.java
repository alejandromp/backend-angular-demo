package com.example.myyoutubebackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myyoutubebackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @SuppressWarnings("unchecked")
	User save(User user);
    
    //void delete(Long id);    
}
