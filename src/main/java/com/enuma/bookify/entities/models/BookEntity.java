package com.enuma.bookify.entities.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity extends BaseEntity{
    @Column(nullable = false, length = 100)
    private String bookName;

    @Column(nullable = false)
    private String bookUrl;

    private long bookPage;

    @Column(nullable = false)
    private String bookAuthor;

    private String dateWritten;

    private BigDecimal bookPrice;

    @OneToMany
    private List<BookCategory> bookCategories = new ArrayList<>();
}
