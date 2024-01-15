package bai9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomMouseListener implements MouseListener {

    private JButton button;
    private JPanel currentPanel;
    private JPanel nextPanel;

    public CustomMouseListener(JButton button, JPanel currentPanel, JPanel nextPanel) {
        this.button = button;
        this.currentPanel = currentPanel;
        this.nextPanel = nextPanel;
    }
    public void mouseClicked(MouseEvent e) {
        currentPanel.setVisible(false);
        nextPanel.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
