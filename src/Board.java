import com.sun.jdi.event.StepEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board {
    private JComboBox DDPlayers;
    private JTextArea TxtResults;
    private JLabel LblPlayers;
    private JButton BtnRun;
    private JPanel mainPanel;
    private JCheckBox ChkShowPlays;
    private JCheckBox ChkShowScores;
    private Integer[] listOfDrops;

    public Board() {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(this.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.add(DDPlayers);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);

        Timer timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnRun.setEnabled(true);
            }
        });
        timer.setRepeats(false);

        BtnRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TxtResults.setText("");
                //Match runMatch = new Match();
                TxtResults.append("The Match is starting...\n");
                BtnRun.setEnabled(false);
                //timer.start();
                Match match = new Match(convertData(DDPlayers));
                match.calcRounds();
                TxtResults.append("As there are " + DDPlayers.getSelectedItem().toString() + " players equaling " + match.numberOfRounds + " rounds");
                if (ChkShowPlays.isSelected()){
                    for (Player player : match.getPlayersInMatch()){

                    }
                }

//                try{
//
//                } catch (InterruptedException ex){
//
//                }
                //BtnRun.setEnabled(true);
            }
        });

    }

    public int convertData(JComboBox DDPlayers) {
        String ddPlayers = DDPlayers.getSelectedItem().toString();
        try{
            int noOfPlays = Integer.parseInt(ddPlayers);
            return  noOfPlays;
        } catch (NumberFormatException ex){
            return 0;
        }
    }
}

