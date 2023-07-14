import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame createFrame() {
        JFrame myFrame = new JFrame();
        myFrame.setTitle("TicTacToe Game");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setLayout(null);
        myFrame.setSize(310,385);
        myFrame.setVisible(true);
        return myFrame;
    }

    static String currentPlayer = "X";
    static String topLeftString = "";
    static String topString = "";
    static String topRightString = "";
    static String middleLeftString = "";
    static String middleString = "";
    static String middleRightString= "";
    static String bottomLeftString = "";
    static String bottomString = "";
    static String bottomRightString = "";

    static boolean checkWinner(String player) {
        if (topLeftString.equals(player) && topString.equals(player) && topRightString.equals(player)) {
            return true;
        } else if (middleLeftString.equals(player) && middleString.equals(player) && middleRightString.equals(player)) {
            return true;
        } else if (bottomLeftString.equals(player) && bottomString.equals(player) && bottomRightString.equals(player)) {
            return true;
        } else if (topLeftString.equals(player) && middleString.equals(player) && bottomRightString.equals(player)) {
            return true;
        } else if (bottomLeftString.equals(player) && middleString.equals(player) && topRightString.equals(player)) {
            return true;
        } else {
            return false;
        }
    }
    static void toggleCurrentPlayer() {
        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else if (currentPlayer.equals("O")) {
            currentPlayer = "X";
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.GRAY);
        headerPanel.setBounds(0,0,300,50);
        JLabel headerPanelLabel = new JLabel();
        headerPanelLabel.setText("Current Player: " + currentPlayer);
        headerPanelLabel.setHorizontalTextPosition(JLabel.CENTER);
        headerPanelLabel.setVerticalTextPosition((JLabel.CENTER));
        headerPanel.add(headerPanelLabel);

        JPanel topLeftPanel = new JPanel();
        topLeftPanel.setBackground(new Color(0xcccfcd));
        topLeftPanel.setBounds(0,50,100,100);
        JLabel topLeftLabel = new JLabel();
        topLeftLabel.setText(topLeftString);
        topLeftLabel.setHorizontalTextPosition(JLabel.CENTER);
        topLeftLabel.setVerticalTextPosition((JLabel.CENTER));
        topLeftPanel.add(topLeftLabel);
        JButton topLeftButton = new JButton();
        topLeftButton.setBounds(0,50,100,100);
        topLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == topLeftButton) {//rename
                    topLeftLabel.setText(currentPlayer);
                    topLeftString = currentPlayer;
                    String tempCurrentPlayer = currentPlayer;
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    topLeftButton.setEnabled(false);
                    topLeftButton.setVisible(false);
                    if (result) {
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });
//
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0xbbbdbb));
        topPanel.setBounds(100,50,100,100);
        JLabel topLabel = new JLabel();
        topLabel.setText(topString); //here
        topLabel.setHorizontalTextPosition(JLabel.CENTER);
        topLabel.setVerticalTextPosition((JLabel.CENTER));
        topPanel.add(topLabel);
        JButton topButton = new JButton();
        topButton.setBounds(100,50,100,100);
        topButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == topButton) {//rename
                    topLabel.setText(currentPlayer);
                    topString = currentPlayer;
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    topButton.setEnabled(false);
                    topButton.setVisible(false);
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel topRightPanel = new JPanel(); //rename here
        topRightPanel.setBackground(new Color(0xcccfcd)); // change colour
        topRightPanel.setBounds(200,50,100,100); // move coords
        JLabel topRightLabel = new JLabel(); //rename
        topRightLabel.setText(topRightString); //rename
        topRightLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        topRightLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        topRightPanel.add(topRightLabel);//rename
        JButton topRightButton = new JButton(); //rename
        topRightButton.setBounds(200,50,100,100);//move//rename
        topRightButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == topRightButton) {//rename
                    topRightLabel.setText(currentPlayer);//rename
                    topRightString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    topRightButton.setEnabled(false);//rename
                    topRightButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel middleLeftPanel = new JPanel(); //rename here
        middleLeftPanel.setBackground(new Color(0xbbbdbb)); // change colour
        middleLeftPanel.setBounds(0,150,100,100); // move coords
        JLabel middleLeftLabel = new JLabel(); //rename
        middleLeftLabel.setText(middleLeftString); //rename
        middleLeftLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        middleLeftLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        middleLeftPanel.add(middleLeftLabel);//rename
        JButton middleLeftButton = new JButton(); //rename
        middleLeftButton.setBounds(0,150,100,100);//move//rename
        middleLeftButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == middleLeftButton) {//rename
                    middleLeftLabel.setText(currentPlayer);//rename
                    middleLeftString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    middleLeftButton.setEnabled(false);//rename
                    middleLeftButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel middlePanel = new JPanel(); //rename here
        middlePanel.setBackground(new Color(0xcccfcd)); // change colour
        middlePanel.setBounds(100,150,100,100); // move coords
        JLabel middleLabel = new JLabel(); //rename
        middleLabel.setText(middleString); //rename
        middleLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        middleLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        middlePanel.add(middleLabel);//rename
        JButton middleButton = new JButton(); //rename
        middleButton.setBounds(100,150,100,100);//move//rename
        middleButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == middleButton) {//rename
                    middleLabel.setText(currentPlayer);//rename
                    middleString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    middleButton.setEnabled(false);//rename
                    middleButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel middleRightPanel = new JPanel(); //rename here
        middleRightPanel.setBackground(new Color(0xbbbdbb)); // change colour
        middleRightPanel.setBounds(200,150,100,100); // move coords
        JLabel middleRightLabel = new JLabel(); //rename
        middleRightLabel.setText(middleRightString); //rename
        middleRightLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        middleRightLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        middleRightPanel.add(middleRightLabel);//rename
        JButton middleRightButton = new JButton(); //rename
        middleRightButton.setBounds(200,150,100,100);//move//rename
        middleRightButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == middleRightButton) {//rename
                    middleRightLabel.setText(currentPlayer);//rename
                    middleRightString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    middleRightButton.setEnabled(false);//rename
                    middleRightButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel bottomLeftPanel = new JPanel(); //rename here
        bottomLeftPanel.setBackground(new Color(0xcccfcd)); // change colour
        bottomLeftPanel.setBounds(000,250,100,100); // move coords
        JLabel bottomLeftLabel = new JLabel(); //rename
        bottomLeftLabel.setText(bottomLeftString); //rename
        bottomLeftLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        bottomLeftLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        bottomLeftPanel.add(bottomLeftLabel);//rename
        JButton bottomLeftButton = new JButton(); //rename
        bottomLeftButton.setBounds(0,250,100,100);//move//rename
        bottomLeftButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bottomLeftButton) {//rename
                    bottomLeftLabel.setText(currentPlayer);//rename
                    bottomLeftString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    bottomLeftButton.setEnabled(false);//rename
                    bottomLeftButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel bottomPanel = new JPanel(); //rename here
        bottomPanel.setBackground(new Color(0xbbbdbb)); // change colour
        bottomPanel.setBounds(100,250,100,100); // move coords
        JLabel bottomLabel = new JLabel(); //rename
        bottomLabel.setText(bottomString); //rename
        bottomLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        bottomLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        bottomPanel.add(bottomLabel);//rename
        JButton bottomButton = new JButton(); //rename
        bottomButton.setBounds(100,250,100,100);//move//rename
        bottomButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bottomButton) {//rename
                    bottomLabel.setText(currentPlayer);//rename
                    bottomString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    bottomButton.setEnabled(false);//rename
                    bottomButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JPanel bottomRightPanel = new JPanel(); //rename here
        bottomRightPanel.setBackground(new Color(0xcccfcd)); // change colour
        bottomRightPanel.setBounds(200,250,100,100); // move coords
        JLabel bottomRightLabel = new JLabel(); //rename
        bottomRightLabel.setText(bottomRightString); //rename
        bottomRightLabel.setHorizontalTextPosition(JLabel.CENTER);//rename
        bottomRightLabel.setVerticalTextPosition((JLabel.CENTER));//rename
        bottomRightPanel.add(bottomRightLabel);//rename
        JButton bottomRightButton = new JButton(); //rename
        bottomRightButton.setBounds(200,250,100,100);//move//rename
        bottomRightButton.addActionListener(new ActionListener() {//rename
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bottomRightButton) {//rename
                    bottomRightLabel.setText(currentPlayer);//rename
                    bottomRightString = currentPlayer;//rename
                    String tempCurrentPlayer = currentPlayer; //copy
                    Boolean result = checkWinner(currentPlayer);
                    toggleCurrentPlayer();
                    headerPanelLabel.setText("Current Player: " + currentPlayer);
                    bottomRightButton.setEnabled(false);//rename
                    bottomRightButton.setVisible(false);//rename
                    if (result) { //copy
                        headerPanelLabel.setText("Player " + tempCurrentPlayer + " has won!");
                    }
                }
            }
        });

        JFrame myFrame = createFrame();
        myFrame.add(headerPanel);

        myFrame.add(topLeftPanel);
        myFrame.add(topLeftButton);

        myFrame.add(topPanel);
        myFrame.add(topButton);

        myFrame.add(topRightPanel);
        myFrame.add(topRightButton);

        myFrame.add(middleLeftPanel);
        myFrame.add(middleLeftButton);

        myFrame.add(middlePanel);
        myFrame.add(middleButton);

        myFrame.add(middleRightPanel);
        myFrame.add(middleRightButton);

        myFrame.add(bottomLeftPanel);
        myFrame.add(bottomLeftButton);

        myFrame.add(bottomPanel);
        myFrame.add(bottomButton);

        myFrame.add(bottomRightPanel);
        myFrame.add(bottomRightButton);

//        myFrame.pack();
//        myFrame.setVisible(true);
        // There are two players "O" and "X"
        // "X" starts first

    }
}