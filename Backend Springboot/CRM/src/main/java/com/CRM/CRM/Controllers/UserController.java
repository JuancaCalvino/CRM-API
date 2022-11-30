package com.CRM.CRM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.CRM.Models.User;
import com.CRM.CRM.Services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	//Cuando se registra un usuario, comprueba y luego inserta
	@CrossOrigin()
	@PostMapping("/createuser")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
		
		User usuario = userService.saveUser(user);
		
		if(usuario != null)
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	// Cuando se loguea el user, se comprueba que exista, si no existe se devuelve
	// un 404 (contraseña o correo no coincide con base de datos)
	@CrossOrigin()
	@PostMapping("/verify")
	public ResponseEntity<User> loginUser(@RequestBody User user) {		

		List<User> usuarioEncontrado = userService.loginUser(user);

		if (usuarioEncontrado.size() != 0)
			return new ResponseEntity<>(usuarioEncontrado.get(0), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	// Devuelve todos los usuarios
	@CrossOrigin()
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> returnsUsers() {
		
		List<User> userList = userService.retrieveUsers();
		
		if(userList.size()!=0)
			return new ResponseEntity<>(userList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
