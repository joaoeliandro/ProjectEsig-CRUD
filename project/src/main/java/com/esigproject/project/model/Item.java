package com.esigproject.project.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "item")
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // @Column
    // @NotNull
    // private Cliente cliente;

}