package com.codeup.quasarspringblog.lectureCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String make;

    @Column(nullable = false, length = 50)
    private String model;

    @ManyToMany(mappedBy = "vehicle")
    private List<Owner> carOwner;

    public void setId(long id) {
        this.id = id;
    }


    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
