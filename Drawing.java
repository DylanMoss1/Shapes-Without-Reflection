package uk.ac.cam.acr31.oop.democode1920.lecture6.drawing2;

import java.util.List;

public class Drawing {

  public static void draw(List<Shape> shapes) {
    AsciiImage asciiImage = new AsciiImage();
    for (Shape s : shapes) {
      if (s.type == "circle") {
        ((Circle) s).draw(asciiImage);
      }
      if (s.type == "square") {
        ((Square) s).draw(asciiImage);
      }
      if (s.type == "stick") {
        ((Stick) s).draw(asciiImage);
      }
    }
    System.out.println(asciiImage);
  }

  public static void main(String[] args) {
    draw(List.of(new Circle(0), new Circle(5), new Square(1), new Square(4)));
  }
}
