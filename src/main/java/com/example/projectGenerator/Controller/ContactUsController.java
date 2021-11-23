package com.example.projectGenerator.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectGenerator.Service.ContactUsService;
import com.example.projectGenerator.entity.ContactUs;

@RestController
public class ContactUsController {
	
	@Autowired
	private ContactUsService contactUsService;
	
	@PostMapping("/contact")
	public ContactUs saveContact(@RequestBody ContactUs contactUs) {
		return contactUsService.saveContact(contactUs);
	}
	
	@GetMapping("/contact")
	public List<ContactUs> getContact(){
		return contactUsService.getContact();
	}
}
