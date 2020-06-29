package com.db.canvas.command;

import com.db.canvas.Canvas;
import com.db.canvas.cache.ApplicationCache;

public class RenderCommand implements CanvasCommand {
  @Override
  public void execute() {
    Canvas canvas = ApplicationCache.getInstance().getCanvas();
    if(canvas != null) {
      canvas.render();
    }
  }
}
