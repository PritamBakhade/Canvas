package com.db.canvas.util;

public class Validator {
  public static void positive(int... args) {
    for(int i : args){
      if(i < 0) {
        throw new IllegalArgumentException(i + " not allowed. Value should be positive");
      }
    }
  }

  public static void lessThan(int rhs, int... args) {
    for(int i : args){
      if(i > rhs) {
        throw new IllegalArgumentException(i + " not allowed. Value should be less than " + rhs);
      }
    }
  }
}
