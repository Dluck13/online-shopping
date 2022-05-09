package com.dima.online.shopping.entity;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String category;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="category")
	private Set<Book> book;

}
