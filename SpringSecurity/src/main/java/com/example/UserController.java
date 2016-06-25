package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="User")
public class UserController 
{
	@Autowired
	private UserServicesImpl serv;
	
//	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value ="/Create",method = RequestMethod.POST)
	public String createUser(@RequestBody UserDto dto)
	{
		serv.createUser(dto.convertToModel(null));
		return "User : " + dto.getUserName()+" is successfully created!"; 
	}
	
//	@PreAuthorize("hasRole('ROLE_USER')")
	@RequestMapping(value ="/test",method = RequestMethod.GET)
	public String test()
	{
		
		return "User : is successfully created!"; 
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping(value ="/test2",method = RequestMethod.GET)
	public String test2()
	{
		
		return "ADMIN"; 
	}
	
	@RequestMapping(value ="/login",method = RequestMethod.POST)
	public String login()
	{
		
		return "ADMIN"; 
	}
	
	
}
