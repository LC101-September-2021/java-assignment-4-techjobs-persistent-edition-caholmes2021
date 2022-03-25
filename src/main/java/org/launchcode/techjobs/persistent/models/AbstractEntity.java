package org.launchcode.techjobs.persistent.models;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.valadation.contraints.size;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue

    private int id;

    @NotBlank(message = "Please enter a name.")
    @Size(max=200, message = "Name cannot be longer than 200 characters.")

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}