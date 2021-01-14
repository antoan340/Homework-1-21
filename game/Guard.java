package game;

import java.awt.*;
/**
 *
 * @author Antoan
 * @param "Пазача наследява стойностите на фигурата"
 */
public class Guard extends Figure {
    public Guard(float row, float col) {
        super();
    }

    /**
     *
     * @author Antoan
     * @param "Визуализиране на пазачите"
     */
    public void render(Graphics g) {
        for (int i=33;i<433;i+=100){
            g.setColor(Color.green);
            g.fillOval(i,54,54,54);
            g.setColor(Color.yellow);
            g.fillOval(i+7,61,40,40);
        }
        for (int i=133;i<=433;i+=100){
            g.setColor(Color.yellow);
            g.fillOval(i,454,54,54);
            g.setColor(Color.green);
            g.fillOval(i+7,461,40,40);
        }
    }
}

