package com.deb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deb.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
