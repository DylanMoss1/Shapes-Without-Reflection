package uk.ac.cam.acr31.oop.democode1920.lecture6.drawing2;

public class Square extends Shape {

  private final int x;

  public Square(int x) {
    super();
    this.x = x;
  }

  @Override
  public void setType(){
    type = "square";
  }

  void draw(AsciiImage asciiImage) {
    asciiImage.draw(x, '#');
  }
}
