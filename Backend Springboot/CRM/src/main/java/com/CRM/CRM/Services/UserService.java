package com.CRM.CRM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Repositories.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepository;

	// Intenta guardar el usuario recibido
	public User saveUser(User user) {

		return userRepository.save(user);
	}

	// Dado un usuario, comprueba que su email y su contraseña coincida con la de la
	// base de datos
	public List<User> loginUser(User user) {

		List<User> userList = userRepository.findByEmailPassword(user.getEmail(), user.getPassword());

		return userList;
	}

	// Devuelve todos los usuarios
	public List<User> retrieveUsers() {

		List<User> userList = userRepository.findAll();

		return userList;
	}
}
