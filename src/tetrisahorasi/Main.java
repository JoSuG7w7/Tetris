/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetrisahorasi;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Main extends JFrame {
    

    private JLabel statusbar;
    

    public Main() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    JLabel getStatusBar() {
        

        return statusbar;
    }

    public static void main(String[] args) {
        

            var game = new Main();
            game.setVisible(true);
            
        
    }
    
   
    
    
}