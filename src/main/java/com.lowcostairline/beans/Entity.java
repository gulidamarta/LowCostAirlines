package com.lowcostairline.beans;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.lowcostairline.singleton.IdGenerator;

import java.util.Objects;


public class Entity {
    @JacksonXmlProperty(isAttribute=true)
    private int Id = IdGenerator.getNewId();

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Id == entity.Id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Id: " + Id;
    }
}
