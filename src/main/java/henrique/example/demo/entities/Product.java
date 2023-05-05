package henrique.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "departament_id")
	private Departament deprtament;
	
	public Product () {
		
	}

	public Product(Long id, String name, Double price, Departament deprtament) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.deprtament = deprtament;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Departament getDeprtament() {
		return deprtament;
	}

	public void setDeprtament(Departament deprtament) {
		this.deprtament = deprtament;
	}
}
