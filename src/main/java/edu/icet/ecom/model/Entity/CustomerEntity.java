package edu.icet.ecom.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, unique = true)
    private String contactno;

    public CustomerEntity(String name, String email, String password, String address, String contactno) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contactno = contactno;
    }
}
