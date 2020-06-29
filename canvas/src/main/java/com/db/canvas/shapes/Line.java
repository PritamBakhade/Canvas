package com.db.canvas.shapes;

import com.db.canvas.Canvas;

import static com.db.canvas.util.Validator.*;

public class Line implements Shape{
  private final int startX;
  private final int startY;
  private final int endX;
  private final int endY;

  public Line(int startX, int startY, int endX, int endY) {
    positive(startX, startY, endX, endY);
    if(startX != endX && startY != endY) {
      throw new IllegalArgumentException("Not valid coordinates for a line");
    }
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
  }

  @Override
  public void fillCanvas(Canvas canvas, char p) {
    lessThan(canvas.getWidth()-1, startX, endX);
    lessThan(canvas.getHeight()-1, startY, endY);
    if (startX == endX) {
      fillLine(startX, startY, endY, false, canvas.getGrid(), p);
    } else if (startY == endY) {
      fillLine(startY, startX, endX, true, canvas.getGrid(), p);
    }
  }

  private void fillLine(int fixed, int begin, int end, boolean horizontal, char[][] grid, char p) {
    if (begin > end) {
      // swap begin and end
      begin = begin ^ end;
      end = begin ^ end;
      begin = begin ^ end;
    }
    for(int i=begin; i<=end; i++) {
      if (horizontal) {
        grid[fixed][i] = p;
      } else {
        grid[i][fixed] = p;
      }

    }
  }

}
