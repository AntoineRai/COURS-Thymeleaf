package com.example.fullstackinterro.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String identification;

    @NotEmpty
    private String address;

    @NotNull
    private Date dateOfBirth;

    @NotEmpty
    private String mail;

    @NotEmpty
    private String phone;

    @NotNull
    private Date startOfContract;

    @NotNull
    private Date endOfContract;

    @NotEmpty
    private String jobTitle;

    @NotNull
    private Double wage;

    @NotEmpty
    private String observation;

    @ManyToOne
    @JoinColumn(name = "id_vacation")
    private Vacation vacation;

    @ManyToOne
    @JoinColumn(name = "id_absence")
    private Absence absence;
}
