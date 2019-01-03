package org.sid.web;

import org.sid.dao.ItemRepository;
import org.sid.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@CrossOrigin("*")
public class ItemRestService {
	@Autowired
	private ItemRepository itemRepository;
	@RequestMapping(value="/items",method=RequestMethod.GET)
	public List<Item> getItems(){
		return itemRepository.findAll();

}
	@RequestMapping(value="/items/facture/{id}",method=RequestMethod.GET)
	public List<Long> getItemsprFac(@PathVariable Long id){
		return itemRepository.getItemperFac(id);
	}
	
	@RequestMapping(value="/items/{id}",method=RequestMethod.GET)
	public Item getItem(@PathVariable Long id){
		return itemRepository.findOne(id);
		
}
	@RequestMapping(value="/items",method=RequestMethod.POST)
	public Item save(@RequestBody Item  i){
		return itemRepository.save(i);
		
}
		

	@RequestMapping(value="/items/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		itemRepository.delete(id);
		return true;
		
}
	@RequestMapping(value="/items/{id}",method=RequestMethod.PUT)
	public Item save(@PathVariable Long id,@RequestBody Item  i){
		i.setIdItem(id);
		return itemRepository.save(i);
		
}
	
	}
