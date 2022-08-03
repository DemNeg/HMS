package com.koko.HMS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@ToString
public class HotelManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotel_id;
    private String hotel_name;
    private String numberOfEmployees;
}
