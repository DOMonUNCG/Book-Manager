package com.csc340sp23.bookmanager;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Darian Morales
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
