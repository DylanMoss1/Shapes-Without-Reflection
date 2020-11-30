package uk.ac.cam.acr31.oop.democode1920.lecture6.drawing2;

public class Circle extends Shape {

  private final int x;

  public Circle(int x) {
    super();
    this.x = x;
  }

  @Override
  public void setType(){
    type = "circle";
  }

  void draw(AsciiImage asciiImage) {
    asciiImage.draw(x, 'o');
  }
}
