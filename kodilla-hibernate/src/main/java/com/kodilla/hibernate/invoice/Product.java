package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="PRODUCT")
public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();
    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }
    @OneToMany(targetEntity = Item.class,mappedBy = "product")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    @Id
    @NotNull
    @GeneratedValue
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name="NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}