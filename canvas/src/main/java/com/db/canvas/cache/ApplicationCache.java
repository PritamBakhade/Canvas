package com.db.canvas.cache;

import com.db.canvas.Canvas;

public class ApplicationCache {
  private static ApplicationCache instance;
  private Canvas canvas;

  private ApplicationCache() {
  }

  public static ApplicationCache getInstance() {
    if(instance == null) {
      instance = new ApplicationCache();
    }
    return instance;
  }

  public Canvas getCanvas() {
    return canvas;
  }

  public void setCanvas(Canvas canvas) {
    this.canvas = canvas;
  }
}
