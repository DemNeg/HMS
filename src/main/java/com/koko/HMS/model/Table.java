package com.koko.HMS.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long table_id;
    private int tableNumber;
    private boolean occupiedStatus;
    private Server serverId;
    private Customer customerId;

}
