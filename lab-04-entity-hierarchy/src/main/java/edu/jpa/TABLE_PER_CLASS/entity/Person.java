package edu.jpa.TABLE_PER_CLASS.entity;

import jakarta.persistence.*;

// fiecare entitate cu tabela ei
// are nevoie de sql union pentru a naviga prin entitati
// NU se fac joinuri
// The UNION operator is used to combine the result-set of two or more SELECT statements.
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
