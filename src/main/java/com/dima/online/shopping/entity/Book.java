package com.dima.online.shopping.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tbl_book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String sku;
	
	private String name;
	
	private String desciption;
	
	private BigDecimal price;
	
	private String imageurl;
	
	private int units;
	
	@ManyToOne
	@JoinColumn(name= "category_id", nullable =false)
	private BookCategory category;
}
