

/* This is a class that will beome a table in H2 database
* The annotations being used will determine how your
* application interacts with the database
*
* */


package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Job {
    // Automatically generating an ID which is used as
    // a primary key for that table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min=4)
    private String title;
    @NotNull
    @Size(min=3)
    private String employeer;
    @NotNull
    @Size(min=10)
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeer() {
        return employeer;
    }

    public void setEmployeer(String employeer) {
        this.employeer = employeer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
