package henrique.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import henrique.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
