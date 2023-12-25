package com.enuma.bookify.entities.models;

import com.enuma.bookify.entities.enums.Gender;
import com.enuma.bookify.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_table")
public class UserEntity extends BaseEntity{
    @Column(nullable = false,length = 25)
    private String firstName;

    @Column(length = 25)
    private String lastName;

    @Column(nullable = false, length = 35)
    private String email;

    @Column(nullable = false, length = 60)
    private String password;

    @Transient
    private String confirmPassword;

    @Column(nullable = false,length = 15)
    private String phoneNumber;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 11)
    private String dob;

    private String pictureUrl;

    @Enumerated(EnumType.STRING)
    private Roles roles;

    private Boolean isVerified;

    @OneToOne(mappedBy = "userEntity", cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private CardDetailsEntity cardDetails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserBookEntity> userBookList = new ArrayList<>();
}
