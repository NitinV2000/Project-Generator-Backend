package com.example.projectGenerator.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projectGenerator.Repository.ContactUsRepository;
import com.example.projectGenerator.entity.ContactUs;

@Service
public class ContactUsServiceImpl implements ContactUsService{
	
	private ContactUsRepository contactUsRepository;
	
	@Override
	public ContactUs saveContact(ContactUs contactUs) {
		// TODO Auto-generated method stub
		return contactUsRepository.save(contactUs);
	}

	@Override
	public List<ContactUs> getContact() {
		// TODO Auto-generated method stub
		return contactUsRepository.findAll();
	}

}
