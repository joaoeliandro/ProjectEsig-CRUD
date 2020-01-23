package com.esigproject.project.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="Item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column
    @NotNull
    @NotEmpty
    private String nomeItem;

    @Column
    @NotNull
    @NotEmpty
    private String destinatario;

    @Column
    @NotNull
    @NotEmpty
    private String remetente;

    @Column
    @NotNull
    @NotEmpty
    private String email;

    public long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getNomeItem(){
        return nomeItem;
    }
    
    public void setNomeItem(String nomeItem){
        this.nomeItem = nomeItem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}