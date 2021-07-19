package com.company;

import java.util.Objects;

public class Point {
    private final String x;
    private final String y;

    Point(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object object) {
        if (this.hashCode() == object.hashCode()) {
            if (this == object)
                return true;
            if (getClass() != object.getClass())
                return false;
            Point point = (Point) object;
            return Objects.equals(x, point.x) && Objects.equals(y, point.y);
        } else return false;

    }

    public int hashCode() {
        int result = 0;
        if (x != null && y != null) {
            result = x.hashCode() + y.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
