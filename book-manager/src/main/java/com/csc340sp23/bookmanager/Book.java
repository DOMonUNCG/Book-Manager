package com.csc340sp23.bookmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Darian Morales
 */
@AllArgsConstructor
@Entity
@Table(name = "product")
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String isbn;
    private double price;

    public Book(String name, String writer, String code, double cost) {
        this.title = name;
        this.author = writer;
        this.isbn = code;
        this.price = cost;
    }

}
