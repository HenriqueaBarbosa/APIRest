package henrique.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import henrique.example.demo.entities.Departament;
import henrique.example.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class productController {
	
	@GetMapping
	public List<Product> getObject() {
		Departament d1 = new Departament(1L, "Tech");
		Departament d2 = new Departament(1L, "Pet");
		
		Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
		Product p2 = new Product(1L, "PC Gamer", 5000.0, d1);
		Product p3 = new Product(1L, "Pet House", 300.0, d2);
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		
		return list;
	}
}
