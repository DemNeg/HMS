package com.koko.HMS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@ToString
@DiscriminatorValue(value = "CHF")
public class Chef extends Employee{
    private Long chef_Id;
    private int orderId;
}
