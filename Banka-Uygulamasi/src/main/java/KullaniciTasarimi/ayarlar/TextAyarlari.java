
package KullaniciTasarimi.ayarlar;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class TextAyarlari {
    
    /*
    text odaklanma ayarları
    */
    
    private static String OrijinalText;
    private static Color OrijinalFgColor;
    
    
    public static void chechTheTextFocusGained(JTextField textField,String org){
        OrijinalText = org;
        if(textField.getText().trim().equals(org)){
            OrijinalFgColor = textField.getForeground();
            textField.setText("");
        }       
        textField.setForeground(OrijinalFgColor);
    }
    
    
    public static void chechTheTextFocusLost(JTextField textField){
        if(textField.getText().trim().equals("")){
            textField.setText(OrijinalText);
            textField.setForeground(OrijinalFgColor);
        }
        else {
            textField.setForeground(Color.BLACK);
        }
        
    }
    
    /*
    Key Ayarları
    */
    
    public static void setOnlyNumber(JTextField textField){
        textField.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
            
        });
        
    }
}

