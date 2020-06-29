package com.db.canvas.command;

public class CommandParser {
  public static CanvasCommand parse(String args[]) {
    if (args == null || args.length < 1 ) {
      throw new IllegalArgumentException("Invalid arguments");
    }
    switch (args[0].toUpperCase()) {
      case "C":
        return new CreateCommand(args);
      case "L":
        return new LineCommand(args);
      case "R":
        return new RectangleCommand(args);
      case "Q":
        System.exit(0);
    }
    return null;
  }
}
