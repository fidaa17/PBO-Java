package jalan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class  Dino extends JPanel implements ActionListener, KeyListener {
	    private int dinoX, dinoY, dinoDY;
	    private boolean isJumping;
	    private Timer timer;

	    public Dino() {
	        dinoX = 50;
	        dinoY = 150;
	        dinoDY = 0;
	        isJumping = false;

	        timer = new Timer(10, this);
	        timer.start();

	        addKeyListener(this);
	        setFocusable(true);
	        setFocusTraversalKeysEnabled(false);
	    }

	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.setColor(Color.GREEN);
	        g.fillRect(0, 200, getWidth(), 10); // Ground

	        g.setColor(Color.GRAY);
	        g.fillRect(dinoX, 150 - dinoY, 20, 20); // Dino
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (isJumping) {
	            dinoY -= dinoDY;
	            dinoDY--;
	            if (dinoY == 0) {
	                dinoDY = 0;
	                isJumping = false;
	            }
	        }
	        repaint();
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	        if (e.getKeyCode() == KeyEvent.VK_SPACE && !isJumping) {
	            isJumping = true;
	            dinoDY = 15;
	        }
	    }

	    @Override
	    public void keyTyped(KeyEvent e) {
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
	    }

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Dino Game");
	        Dino game = new Dino();
	        frame.add(game);
	        frame.setSize(800, 400);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	}

