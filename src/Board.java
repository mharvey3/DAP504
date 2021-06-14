import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Board {
    private JComboBox DDPlayers;
    private JTextArea TxtResults;
    private JLabel LblPlayers;
    private JButton BtnRun;
    private JPanel mainPanel;
    private JCheckBox ChkShowPlays;
    private JCheckBox ChkShowScores;
    private JButton BtnRunRound;
    private Integer[] listOfDrops;

    public Board() throws IOException {
        JFrame frame = new JFrame("Board");
        frame.setContentPane(this.mainPanel);
        JScrollPane scrollPane = new JScrollPane(TxtResults, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //TxtResults.setAutoscrolls(true);
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.add(DDPlayers);
        frame.pack();
        frame.setSize(600, 400);
        frame.setVisible(true);
        BtnRunRound.setEnabled(false);

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


                try {
                    Utilities.setPlayers(match);
                    match.setPlayersInMatch(Integer.parseInt(DDPlayers.getSelectedItem().toString()));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


//                for (Player player : match.getPlayersInWholeMatch()){
//                    System.out.println("Player: "+ player.firstName + " " + player.lastName + ", ID: " + player.id);
//                }


                match.calcRounds();
                TxtResults.append("As there are " + DDPlayers.getSelectedItem().toString() + " players equaling " + match.numberOfRounds + " rounds\n");

                //match

                for (int i = 0; i < match.numberOfRounds; i++){

                    //for ()
                }


                if (ChkShowPlays.isSelected()){
                    TxtResults.append("Players in the Tournament \n");
                    for (Player player : match.getPlayersInMatch()){
                        TxtResults.append("ID: " + player.id + " " + player.firstName + " " + player.lastName + "\n");
                    }
                }
//                try {
//                    Utilities.printPlayers();
//                } catch (IOException ioException) {
//                    ioException.printStackTrace();
//                }
                //TxtResults.append();

//                try{
//
//                } catch (InterruptedException ex){
//
//                }
                //BtnRun.setEnabled(true);
                BtnRunRound.setEnabled(true);

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

