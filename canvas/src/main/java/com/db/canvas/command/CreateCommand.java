package com.db.canvas.command;

import com.db.canvas.Canvas;
import com.db.canvas.cache.ApplicationCache;
import static com.db.canvas.util.Validator.positive;

public class CreateCommand implements CanvasCommand{
  private final Canvas canvas;
  public CreateCommand(String args[]) {
    if (args.length != 3) {
      throw new IllegalArgumentException("Two parameters are required to creat canvas");
    }
    int height = Integer.parseInt(args[2]);
    int width = Integer.parseInt(args[1]);
    positive(height, width);
    canvas = new Canvas(height, width);
  }

  @Override
  public void execute() {
    ApplicationCache.getInstance().setCanvas(canvas);
  }
}
