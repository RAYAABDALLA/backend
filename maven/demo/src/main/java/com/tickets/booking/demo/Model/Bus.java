package com.tickets.booking.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Bus")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Bus{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long BusId;
    private String services;
    private String type;
}
