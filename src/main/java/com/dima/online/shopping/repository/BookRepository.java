package com.dima.online.shopping.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dima.online.shopping.entity.Book;


@Repository
//crossorigin fixes cors-policy exception
@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {
	
	//change the url path with @RestResource
	@RestResource(path ="categoryid")
	Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);

}
