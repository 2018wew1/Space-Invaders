import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Background extends Entity {
	
	private Game game;
	
	private boolean used = false;
	
	public Background(Game game, String sprite, int x, int y) {
		super(sprite, x, y);
		
		this.game = game;
	}
	public void collidedWith(Entity other) {
		
		if (used) {
			return;
		}
		
		if (other instanceof ShipEntity) {

			used = true;
		}
	}
}

/**
public class Background {

    public Background() {
        Frame frame = new Frame("Space Invaders Prototype");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(new ImageCanvas());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public class ImageCanvas extends Canvas {

        private BufferedImage img;

        public ImageCanvas() {
            try {
                img = ImageIO.read(new File("C://Users/2017pth1/workspace/Space-Invaders/bin/sprites/background.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return img == null ? new Dimension(800, 600) : new Dimension(img.getWidth(), img.getHeight());
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            if (img != null) {
                int x = (getWidth() - img.getWidth()) / 2;
                int y = (getHeight() - img.getHeight()) / 2;
                g.drawImage(img, x, y, this);
                }
        }
    }
}
**/