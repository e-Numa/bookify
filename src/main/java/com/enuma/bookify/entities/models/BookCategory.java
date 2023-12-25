package com.enuma.bookify.entities.models;

import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BookCategory extends BaseEntity{
   private String name;
}
