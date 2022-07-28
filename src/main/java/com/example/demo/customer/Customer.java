package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
public class Customer {

    @Id
    private  Long id;
    @NotBlank(message = "name cannot be empty")
    private  String name;

    @NotBlank(message = "password cannot be empty")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  String password;

    @NotBlank(message = "email cannot be empty and must be properly formatted")
    @Email
    private  String email;




}
