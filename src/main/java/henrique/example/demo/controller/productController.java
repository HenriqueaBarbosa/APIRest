package henrique.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import henrique.example.demo.entities.Departament;
import henrique.example.demo.entities.Product;
import henrique.example.demo.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class productController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObject() {
		
		List<Product> list = productRepository.findAll();
		
		return list;
	}
}
