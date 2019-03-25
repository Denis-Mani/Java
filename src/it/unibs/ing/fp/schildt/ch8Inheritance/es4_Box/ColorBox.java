package it.unibs.ing.fp.schildt.ch8Inheritance.es4_Box;
import  it.unibs.ing.fp.Shildt.ch8.es3_Box.*;

//*listing 4
// Here, Box is extended to include color.
class ColorBox extends Box {
  int color; // color of box

  ColorBox(double w, double h, double d, int c) {
    width = w;
    height = h;
    depth = d;
    color = c;
  }    
}
