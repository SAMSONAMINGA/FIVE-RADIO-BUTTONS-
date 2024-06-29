import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    ButtonGroup bg;
    JLabel imageLabel;

    public RadioButtonDemo() {
        setTitle("RadioButton Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Create button group
        bg = new ButtonGroup();
        bg.add(birdButton);
        bg.add(catButton);
        bg.add(dogButton);
        bg.add(rabbitButton);
        bg.add(pigButton);

        // Create panel for radio buttons
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1));
        buttonPanel.add(birdButton);
        buttonPanel.add(catButton);
        buttonPanel.add(dogButton);
        buttonPanel.add(rabbitButton);
        buttonPanel.add(pigButton);

        // Set initial selection
        pigButton.setSelected(true);

        // Create label for image
        imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon("pig.png")); // Replace with actual image path

        // Add action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Add components to frame
        add(buttonPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            imageLabel.setIcon(new ImageIcon("bird.png")); // Replace with actual image path
        } else if (e.getSource() == catButton) {
            imageLabel.setIcon(new ImageIcon("cat.png")); // Replace with actual image path
        } else if (e.getSource() == dogButton) {
            imageLabel.setIcon(new ImageIcon("dog.png")); // Replace with actual image path
        } else if (e.getSource() == rabbitButton) {
            imageLabel.setIcon(new ImageIcon("rabbit.png")); // Replace with actual image path
        } else if (e.getSource() == pigButton) {
            imageLabel.setIcon(new ImageIcon("pig.png")); // Replace with actual image path
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}