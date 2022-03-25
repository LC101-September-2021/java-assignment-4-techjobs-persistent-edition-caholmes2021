package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

//    @ManyToOne
    @Size(min=1, max=100)
    @NotBlank(message = "Location is required")
    private String location;

    @JoinColumn(name = "employer_id")
    @OneToMany
    private final List<Job> jobs= new ArrayList();

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
}
