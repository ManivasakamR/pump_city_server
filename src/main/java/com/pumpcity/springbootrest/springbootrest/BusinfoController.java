package com.pumpcity.springbootrest.springbootrest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/businfo")
public class BusinfoController {
  @Autowired
  private BusinfoRepository repo;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<Businfo> findItems() {
    return repo.findAll();
  }
  
  @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  public Businfo findone(@PathVariable Integer id) {
    return  repo.findOne(id);
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public Businfo addItem(@RequestBody Businfo Businfo) {
	  Businfo.setId(null);
    return repo.saveAndFlush(Businfo);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Businfo updateBusinfo(@RequestBody Businfo updatedBusinfo, @PathVariable Integer id) {
    updatedBusinfo.setId(id);
    return repo.saveAndFlush(updatedBusinfo);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteItem(@PathVariable Integer id) {
    repo.delete(id);
  }
}