package game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class gameboard extends JFrame {

    private ArrayList<Object> pieceCollection;
    /**
     *
     * @author Antoan
     * @param "Създаване на игралното поле"
     */
    public gameboard() {
        this.pieceCollection = new ArrayList<>();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    @Override
    /**
     *
     * @author Antoan
     * @param "Пренаписване на вече написания родителски клас пеин"
     */
    public void paint(Graphics g) {

        super.paint(g);

        for (float row = 0; row < 5; row++) {
            for (float col = 0; col < 5; col++) {
                GameTile tile = new GameTile(row, col);
                tile.render(g);
                Guard guard = new Guard(row,col);
                guard.render(g);
                Leader leader = new Leader(row, col);
                leader.render(g);
            }
        }

    }

}
