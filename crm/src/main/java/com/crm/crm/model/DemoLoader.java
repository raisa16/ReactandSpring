package com.crm.crm.model;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DemoLoader implements CommandLineRunner{
 private final ContactRepository repository;
 
 @Autowired
 public DemoLoader(ContactRepository repository){
     this.repository = repository;
 }

 @Override
 public void run(String... Strings)throws Exception{
     this.repository.save(new Contact("Raisa", "Toscano", "daisa1690@gmai.com"));
 }
}
