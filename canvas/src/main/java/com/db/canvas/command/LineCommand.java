package com.db.canvas.command;

import com.db.canvas.Canvas;
import com.db.canvas.Constants;
import com.db.canvas.cache.ApplicationCache;
import com.db.canvas.shapes.Line;

public class LineCommand implements CanvasCommand {
  private final Line line;

  public LineCommand(String[] args) {
    if (ApplicationCache.getInstance().getCanvas() == null) {
      throw new IllegalStateException("Canvas not created");
    }
    if (args.length != 5) {
      throw new IllegalArgumentException("Four parameters needed in order to draw line");
    }
    this.line = new Line(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]));
  }

  @Override
  public void execute() {
    line.fillCanvas(ApplicationCache.getInstance().getCanvas(), Constants.FILL);
  }
}
