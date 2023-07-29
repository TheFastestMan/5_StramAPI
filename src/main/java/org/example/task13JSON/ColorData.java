package org.example.task13JSON;

import java.util.Objects;

public class ColorData {
    private int id;
    private String color;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorData colorData)) return false;
        return getId() == colorData.getId() && Objects.equals(getColor(), colorData.getColor()) && Objects.equals(getValue(), colorData.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getColor(), getValue());
    }
}
