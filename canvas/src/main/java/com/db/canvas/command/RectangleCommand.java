package com.db.canvas.command;

import com.db.canvas.Constants;
import com.db.canvas.cache.ApplicationCache;
import com.db.canvas.shapes.Rectangle;

public class RectangleCommand implements CanvasCommand {
  private final Rectangle rectangle;

  public RectangleCommand(String args[]) {
    if (ApplicationCache.getInstance().getCanvas() == null) {
      throw new IllegalStateException("canvas not created");
    }
    if (args.length != 5) {
      throw new IllegalArgumentException("expecting 4 parameters for draw rectangle command");
    }
    this.rectangle = new Rectangle(
      Integer.parseInt(args[1]),
      Integer.parseInt(args[2]),
      Integer.parseInt(args[3]),
      Integer.parseInt(args[4])
    );
  }

  @Override
  public void execute() {
    rectangle.fillCanvas(ApplicationCache.getInstance().getCanvas(), Constants.FILL);
  }
}
