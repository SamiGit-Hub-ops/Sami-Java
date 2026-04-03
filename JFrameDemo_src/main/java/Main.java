import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // 1. Setup the Window
    JFrame frame = new JFrame("Interactive Music Test");
    frame.setSize(400, 300);
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 2. Add a Label (Status)
    final JLabel statusLabel = new JLabel("Status: Ready");
    statusLabel.setFont(new Font("Arial", Font.BOLD, 18));
    frame.add(statusLabel);

    // 3. Add an Interactive Button
    JButton playBtn = new JButton("▶ CLICK TO PLAY");
    playBtn.setPreferredSize(new Dimension(200, 50));

    // OLD SCHOOL ACTION LISTENER (Works on all Java versions)
    playBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          statusLabel.setText("Status: MUSIC PLAYING...");
          statusLabel.setForeground(Color.GREEN);
          System.out.println("Console: User clicked Play!");
         }
       });
    
    frame.add(playBtn);

    // 5. Add a Stop Button
    JButton stopBtn = new JButton("■ STOP");
    stopBtn.addActionListener(new ActionListener() {
        @Override
      public void actionPerformed(ActionEvent e) {
        statusLabel.setText("Status: STOPPED");
        statusLabel.setForeground(Color.RED);
        }
      });

    frame.add(stopBtn);

    // 6. Finalize
    frame.setLocationRelativeTo(null); // Center on VNC screen
    frame.setVisible(true);
    frame.toFront();             // Brings window to top
    frame.repaint();             // Forces a redraw
    frame.requestFocus();        // Grabs focus

    // Keep alive for the VNC session
    System.out.println("GUI launched. Check the VNC/Desktop tool!");
    
  }
}