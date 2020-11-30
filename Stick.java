package uk.ac.cam.acr31.oop.democode1920.lecture6.drawing2;

public class Stick extends Shape {

  private final int x;

  public Stick(int x) {
    super();
    this.x = x;
  }

  @Override
  public void setType(){
    type = "stick";
  }

  void draw(AsciiImage asciiImage) {
    asciiImage.draw(x, '|');
  }
}
