package shapes;

import java.util.List;


// public class Canvas{
//     public void drawAll(List<?> shapes){
//         for (Object shape : shapes) {
//             Shape s = (Shape)shape;
//             s.draw(this);
//         }
//     }
// }

public class Canvas{
    public void drawAll(List<? extends Shape> shapes){
        for (Shape shape : shapes) {
            shape.draw(this);
        }
    }
}