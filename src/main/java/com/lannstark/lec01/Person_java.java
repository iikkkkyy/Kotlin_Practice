package com.lannstark.lec01;

import com.lannstark.lec12.JavaPerson;

public class Person_java {

  public static JavaPerson Factory;
  private final String name;

  public Person_java(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
