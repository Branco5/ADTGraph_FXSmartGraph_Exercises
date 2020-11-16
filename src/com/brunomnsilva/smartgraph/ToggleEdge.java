package com.brunomnsilva.smartgraph;

import java.util.Objects;

public class ToggleEdge implements ValuedEdge {
    private static int AUTO_ID_COUNTER = 1;

    private String id;
    private int value;
    private boolean isActive;

    public ToggleEdge(int value, boolean isActive) {
        this.id = ""+(AUTO_ID_COUNTER++);

        this.value = value;
        this.isActive = isActive;
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return value + " | " + isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToggleEdge that = (ToggleEdge) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
