package com.example.project.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.common.APIResponse;
import com.example.project.common.UserNotFoundException;
import com.example.project.entity.Author;
import com.example.project.entity.Book;
import com.example.project.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	ServiceIF service;
	
	//Normal post mapping 
	@PostMapping
	public Author createAccount(@RequestBody Author author){
		return service.createAccount(author);
	}
	
	//Normal get mapping and Multiple Requestparam
    @GetMapping("/get")
    public List<Author>getAllAccounts(@RequestParam (value="gender",required = false)Set<String> gen,
    		                          @RequestParam(value="name",required = false)String name){
    	return service.getAllAccounts(gen,name);
    }
    //Normal get mapping and UserNotFoundException 
    @GetMapping("/{id}")
    public Author getById(@PathVariable int id) throws UserNotFoundException {
    	return service.getById(id);
    }
   
    //Normal put mapping
   @PutMapping("/{id}")
   public ResponseEntity<?>updateAccount(@PathVariable int id,@RequestBody Author author){
	 return service.updateAccount(id,author);
   }
    
   //Normal delete mapping
   @DeleteMapping("/{id}")
   public ResponseEntity<?>deleteAccount(@PathVariable int id){
	  return service.deleteAccount(id);
   }
   
   //Multiple Requestparam with query
   @GetMapping("/raw")
   public List<Book>getByRawQuery(@RequestParam(value="yearOfPublication",required = false)Set<Integer>yop,
		                           @RequestParam(value="bookType",required = false)String book){
	   return service.getByRawQuery(yop,book);
   }
   
   //API Response
   @GetMapping("/find")
   public APIResponse getByBook(@RequestParam(value="bookType",required = false)Set<String> bok) {
	   return service.getByBook(bok);
   }
  
  //Arithmetic  
   @GetMapping("/exception")
	   public APIResponse getException(@RequestParam (value="number",required = false)Integer num) {
		   return service.getException(num);
	   }
   
   //pagination for fields
   @GetMapping("/pagination/{field}")
   public List<Book> getByPaginationField(@PathVariable String field){
	 return   service.getByPaginationField(field);
	  
   }
   
   //pagination 0/10
   @GetMapping("/page/{offset}/{pageSize}")
   public  Page<Author>getByPagination(@PathVariable int offset,@PathVariable int pageSize){
	   Page<Author> authorWithPagination=  service.getByPagination(offset,pageSize);
	   return  authorWithPagination;
   }
   
   //pagination with sorting and fields
   @GetMapping("/pagesort/{offset}/{pageSize}/{field}")
   public  Page<Author>getByPaginationWithSort(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
	   Page<Author> authorWithPagination=  service.getByPaginationWithSort(offset,pageSize,field);
	   return  authorWithPagination;
   }
   //pagination
   @GetMapping("/pageniation/{offset}/{pageSize}/{field}")
   public Page<Book>getByPageSort(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
	   return service.getByPageSort(offset,pageSize,field);
   }
   
   }

  
