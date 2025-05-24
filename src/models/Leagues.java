package models;

import javax.lang.model.element.ModuleElement;
import java.util.List;

public class Leagues {
    String alias;
    String name;
    String id;
    List<Division> divisions;

    public Leagues(String alias, String name, String id, List<Division> divisions) {
        this.alias = alias;
        this.name = name;
        this.id = id;
        this.divisions = divisions;
    }

    public Leagues() {
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + name.toUpperCase() + System.lineSeparator() +
                divisions + System.lineSeparator();
    }
}
