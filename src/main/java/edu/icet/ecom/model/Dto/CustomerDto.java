package edu.icet.ecom.model.Dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    private String name;
    private String email;
    private String password;
    private String address;
    private String contactno;

}
