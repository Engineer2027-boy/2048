import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
public class GUI2048{
    public JFrame frame = new JFrame();
    public JPanel panel = new JPanel();
    public int[][] x = twothousandfortyeight.showboard();
    public boolean gameWon = false;
    public GUI2048(){
        frame.setTitle("GUI2048");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateBoard();
        panel.setLayout(new GridLayout(4, 4));
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(!gameWon){
                    int[][] newArray = new int[4][4];

                    for (int i = 0; i < 4; i++) {
                        System.arraycopy(x[i], 0, newArray[i], 0, 4);
                    }
                    updateBoard();
                    if(e.getKeyCode() == KeyEvent.VK_UP){
                        twothousandfortyeight.whatifplustwo(x);
                        updateBoard();
                    }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                        twothousandfortyeight.whatifminustwo(x);
                        updateBoard();
                    }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                        twothousandfortyeight.whatifplusone(x);
                        updateBoard();
                    }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                        twothousandfortyeight.whatifminusone(x);
                        updateBoard();
                    }
                    boolean isEqual = Arrays.deepEquals(x, newArray);
                    if (!isEqual) {
                        twothousandfortyeight.make_a_new_two_show_up(x);
                    }
                    updateBoard();
                    if(twothousandfortyeight.is_the_list_filled(x)) {
                        JOptionPane.showMessageDialog(frame, "Game Over!");
                        gameWon = true;
                    }
                    if(twothousandfortyeight.has_won(x)){
                        JOptionPane.showMessageDialog(frame, "You've Won");
                        gameWon = true;
                    }
                }
            }
        });
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
    public void updateBoard(){
        panel.removeAll();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                JLabel label = new JLabel(Integer.toString(x[i][j]));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                label.setFont(new Font("Arial", Font.ITALIC, 24));
                panel.add(label, BorderLayout.CENTER);
            }
        }
        frame.repaint();
        frame.revalidate();
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(GUI2048::new);
    }
}
