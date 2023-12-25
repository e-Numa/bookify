package com.enuma.bookify.entities.models;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "card_details")
public class CardDetailsEntity extends BaseEntity{
    @Column(nullable = false,length = 16)
    private String cardNo;

    @Column(nullable = false,length = 3)
    private String cardCVV;

    @Column(nullable = false,length = 55)
    private String holdersName;

    @Column(nullable = false,length = 15)
    private String cardPassword;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
