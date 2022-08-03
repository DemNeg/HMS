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
@DiscriminatorValue(value = "SVR")
public class Server extends  Employee{
    private Long serverId;
    private int orderId;
}
