package org.example.task13JSON;

import java.util.List;
import java.util.Objects;

public class ListColor {

   private List<ColorData> colors;

    public List<ColorData> getColors() {
        return colors;
    }

    public void setColors(List<ColorData> colors) {
        this.colors = colors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListColor listColor)) return false;
        return Objects.equals(getColors(), listColor.getColors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColors());
    }


}