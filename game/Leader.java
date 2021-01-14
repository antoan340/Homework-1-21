package game;

import java.awt.*;

/**
 *
 * @author Antoan
 * @param "Лидера наследява стойностите на фигурата"
 */
    public class Leader extends Figure {
        public Leader(float row, float col) {
            super();
        }

        /**
         *
         * @author Antoan
         * @param "Визоализиране на лидерите"
         */
        public void render(Graphics g){
            g.setColor(Color.yellow);
            g.fillRect(435,56,50,50);
            g.setColor(Color.green);
            g.fillRect(35,456,50,50);
        }
}
