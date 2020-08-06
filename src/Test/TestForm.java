package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestForm {
    private JButton button1;
    private JPanel panel1;

    public TestForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("asdjasdjkllsl");
            }
        });
    }

    public static void main(String[] args) {

    }
}
