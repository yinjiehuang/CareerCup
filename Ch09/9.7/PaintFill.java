// Implement the "paint fill" function that one might see on many image editing programs. That is, given a screen (represented by a two-dimensional array of colors), a point, and a new color, fill in the surrounding area until the color changes from the original color.
//

import java.util.*;

public class PaintFill {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.7!!!");
        }

        enum Color {
                Black, White, Red, Yellow, Green
        }

        public boolean run(Color[][] screen, int x, int y, Color ncolor) {
                if (Color[y][x] == ncolor) {
                        return false;
                }
                return paintFill(screen, x, y, Color[y][x], ncolor);
        }

        public boolean paintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor) {
                if (x < 0 || x >= screen[0].length || y <0 || y >= screen.length) {
                        return false;
                }
                if (screen[y][x] == ocolor) {
                        paintFill(screen, x-1, y, ocolor, ncolor);
                        paintFill(screen, x+1, y, ocolor, ncolor);
                        paintFill(screen, x, y-1, ocolor, ncolor);
                        paintFill(screen, x, y+1, ocolor, ncolor);
                }
                return true;
        }
}
