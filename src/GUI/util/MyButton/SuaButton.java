/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.util.MyButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SuaButton extends JButton {
    public SuaButton() {
        this.setText("Sửa");
        this.setIcon(new ImageIcon(this.getClass().getResource("/images/icon/update.png")));
    }
}