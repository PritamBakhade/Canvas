package com.db.canvas;

import java.util.Arrays;
import static com.db.canvas.Constants.*;
public class Canvas {
  private final int height;
  private final int width;
  private final char[][] grid;

  public Canvas(int height, int width) {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Canvas width and height must be positive value");
    }
    this.height = height;
    this.width = width;
    this.grid = new char[this.height][this.width];
    initGrid();
  }

  private void initGrid() {
    for (char[] line : grid) {
      Arrays.fill(line, BLANK);
    }
  }

  public void render() {
    for(int i = 0; i < width+2; i++) System.out.print(HORIZONTAL_EDGE);
    System.out.println();
    for (char[] line : grid) {
      System.out.print(VERTICAL_EDGE);
      for (char c : line) {
        System.out.print(c);
      }
      System.out.print(VERTICAL_EDGE);
      System.out.println();
    }
    for(int i = 0; i < width+2; i++) System.out.print(HORIZONTAL_EDGE);
    System.out.println();
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public char[][] getGrid() {
    return grid;
  }
}
