import javax.swing.JOptionPane;


public class DialogLetterCounterProject {

public static void main(String[] args) {
    while (true){
        String input =  JOptionPane.showInputDialog("Please enter a message");
        if (input.equalsIgnoreCase("Stop")){
            break;
        }
            int countb =0;
            int counta= 0;
        
        for (int i = 0; i <input.length(); i++){
             
            if (input.charAt(i) == 'e'){
                
                counta++;
            }
            if (input.charAt(i) == 'E'){
                
                countb++;
            }
        }
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + counta  + "\n Number of lower case E's: " + countb );

    }
}
}