package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemApplication implements CommandLineRunner {
	@Autowired
	private ItemRepository itemRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		itemRepository.findAll().forEach(i->{
			System.out.println(i.getIdItem());
		});
	}
}
