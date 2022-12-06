package org.example;


import java.awt.*;

public class Rect {
    public int width;
    public int height;
    private Point pos;

    private Color col;
    public Rect(Point initPos, Color col, int width, int height) {
        this.width = width;
        this.height = height;
        pos = initPos;
        this.col = col;
    }}
