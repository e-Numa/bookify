package com.enuma.bookify.entities.models;

import com.enuma.bookify.entities.enums.CollectionType;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_books")
public class UserBookEntity extends BaseEntity{

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
                        CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "book_id")
    private BookEntity book;

    @Enumerated(EnumType.STRING)
    private CollectionType collectionType;
}
