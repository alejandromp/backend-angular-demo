package com.example.myyoutubebackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myyoutubebackend.dao.UserRepository;
import com.example.myyoutubebackend.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		//this.userRepository.delete(id);
		this.userRepository.deleteById(id);
	}

}
