package com.koko.HMS.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,length = 3)
public abstract class Employee {
    private Long employeeId;
    private String employeeName;
    private double employeeSalary;
}
