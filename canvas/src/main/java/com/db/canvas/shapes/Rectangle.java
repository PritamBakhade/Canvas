package com.db.canvas.shapes;

import com.db.canvas.Canvas;

import static com.db.canvas.util.Validator.*;

public class Rectangle implements Shape {
  private final Line left;
  private final Line right;
  private final Line bottom;
  private final Line top;

  public Rectangle(int leftX, int leftY, int rightX, int rightY) {
    positive(leftX, leftY, rightX, rightY);
    // test that it is upper left and lower right
    lessThan(rightX, leftX);
    lessThan(rightY, leftY);
    this.left = new Line(leftX, leftY, leftX, rightY);
    this.bottom = new Line(leftX, rightY, rightX, rightY);
    this.right = new Line(rightX, rightY, rightX, leftY);
    this.top = new Line(rightX, leftY, leftX, leftY);
  }

  @Override
  public void fillCanvas(Canvas canvas, char p) {
    left.fillCanvas(canvas, p);
    bottom.fillCanvas(canvas, p);
    right.fillCanvas(canvas, p);
    top.fillCanvas(canvas, p);
  }
}
