/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alk_6
 */
public class ButtonActivator {
    public static void makeButtonDefaultOnEnter(JButton button) {
        button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    JRootPane rootPane = SwingUtilities.getRootPane(button);
                    if (rootPane != null) {
                        rootPane.setDefaultButton(button);
                    }
                }
            }
        });
    }
}
