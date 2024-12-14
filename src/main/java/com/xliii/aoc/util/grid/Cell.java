package com.xliii.aoc.util.grid;

public record Cell<T>(int x, int y, T value) {
    public Vector2D pos() {
        return new Vector2D(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ":" + y + "|" + value + ")";
    }
}