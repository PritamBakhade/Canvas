package com.db.canvas;

import com.db.canvas.command.CanvasCommand;
import com.db.canvas.command.CommandParser;
import com.db.canvas.command.RenderCommand;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Draw A Canvas");
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine().trim();
      String[] cmd = line.split("\\s+");
      try {
        CanvasCommand command = CommandParser.parse(cmd);
        if(command != null)
        {
        command.execute();
        RenderCommand render = new RenderCommand();
        render.execute();
        }
      
      } catch (IllegalArgumentException | IllegalStateException ex){
        System.out.println(ex.getMessage());
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
