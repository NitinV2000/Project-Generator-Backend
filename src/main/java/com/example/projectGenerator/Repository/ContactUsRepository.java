package com.example.projectGenerator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectGenerator.entity.ContactUs;

@Repository
public interface ContactUsRepository extends JpaRepository<ContactUs, String> {

}
