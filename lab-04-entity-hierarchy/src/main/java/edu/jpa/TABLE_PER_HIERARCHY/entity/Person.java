package edu.jpa.TABLE_PER_HIERARCHY.entity;

import jakarta.persistence.*;
// Entitatile care fac parte din acelasi tabel au nevoie de ceva care
// sa discrimineze (diferentieze) intre clasele posibile ale instantelor
// O singura tabela, multe campuri care nu sunt comune entitatilor pe NULL
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
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
