package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    //all four (Employer, Location, CoreCompetency, & PositionType:
    //have a value field
    //have a unique ID
    //overrides for toString, equals, and hashcode

    //fields
    private int id;
    private static int nextId = 1;
    private String value;

    //constructors
    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //getters and setter
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    //equals and hashcode overrides
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
