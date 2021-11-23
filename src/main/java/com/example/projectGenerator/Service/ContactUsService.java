package com.example.projectGenerator.Service;

import java.util.List;

import com.example.projectGenerator.entity.ContactUs;

public interface ContactUsService {

	public ContactUs saveContact(ContactUs contactUs);

	public List<ContactUs> getContact();

}
