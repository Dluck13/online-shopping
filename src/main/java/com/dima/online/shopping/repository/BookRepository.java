package com.dima.online.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dima.online.shopping.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
