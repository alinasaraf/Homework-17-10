package Synth;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.*;
import java.util.Scanner;

public class App { private static final byte C = 60; //do
    private static final byte D = 62; //re
    private static final byte E = 64; //mi
    private static final byte F = 65; //fa
    private static final byte G = 67; //sol
    private static final byte A = 69; //la
    private static final byte B = 70; //si

    public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {
        System.out.println("Please enter notes: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] notes = text.toUpperCase().trim().split(" ");
        Synthesizer synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();

        Receiver receiver = synthesizer.getReceiver();

        for (String note : notes) {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(ShortMessage.NOTE_ON, convertToId(note), 100);
            receiver.send(msg, -1);

            Thread.sleep(1000);
            msg.setMessage(ShortMessage.NOTE_OFF, convertToId(note), 100);
            receiver.send(msg, -1);

        }

    }

    private static int convertToId(String note) {
        switch (note) {
            case "A":
                return A;
            case "B":
                return B;
            case "C":
                return C;
            case "D":
                return D;
            case "E":
                return E;
            case "F":
                return F;
            case "G":
                return G;
            default:
                System.out.println("You entered incorrect note: " + note);

        }
        return 0;
    }

}


