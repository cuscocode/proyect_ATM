package modelo;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangingPanel extends JPanel {

    private Timer timer;
    private Color color1 = Color.RED;   // Primer color
    private Color color2 = Color.GREEN; // Segundo color
    private boolean isColor1 = true;    // Bandera para alternar entre colores
    private Color stopColor;            // Color en el que se detendrá

    public ColorChangingPanel() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(isColor1 ? color1 : color2);
                isColor1 = !isColor1;
            }
        });
    }

    // Método para iniciar el cambio de color
    public void startColorChange() {
        timer.start();
    }

    // Método para detener el cambio de color y fijarlo en un color específico
    public void stopColorChange(Color finalColor) {
        timer.stop();
        setBackground(finalColor);
    }
}
