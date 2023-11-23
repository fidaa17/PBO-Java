package jalan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends JPanel implements ActionListener {
    Timer timer;
    int delay = 1000 / 144;
    boolean running = false;
    boolean gameOver = false;

    int playerY = 300;
    int obstacleY = 320;
    int playerHeight = 50;
    int obstacleHeight = 200;
    int playerSpeed = 10;
    int obstacleSpeed = 7;

    public Game() {
        timer = new Timer(delay, this);
        timer.start();
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (playerY > 0) {
                        playerY -= playerSpeed;
                    }
                }
            }
        });
        setFocusable(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 600);

        g.setColor(Color.red);
        g.fillRect(200, playerY, 100, playerHeight);

        g.setColor(Color.blue);
        g.fillRect(600, obstacleY, 100, obstacleHeight);

        g.setColor(Color.black);
        g.drawString("Score: " + (300 - playerY), 10, 20);

        if (gameOver) {
            g.setColor(Color.black);
            g.drawString("Game Over!", 300, 300);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (running) {
            playerY += playerSpeed;
            obstacleY += obstacleSpeed;

            if (playerY < 0 || playerY + playerHeight > 600) {
                gameOver = true;
                running = false;
            }

            if (obstacleY + obstacleHeight > 0 && obstacleY < playerY + playerHeight && obstacleY + obstacleHeight - playerY > 0) {
                gameOver = true;
                running = false;
            }

            if (obstacleY > 600) {
                obstacleY = -200;
            }
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dino Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}