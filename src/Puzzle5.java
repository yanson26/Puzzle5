
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Puzzle5 {

    public static void main(String[] args) throws IOException {

        Stack[] cargo = new Stack[9];
        for (int i = 0; i < cargo.length; i++) {
            cargo[i] = new Stack<>();
        }
        loadCargo(cargo);

        Scanner sc = new Scanner(new File("Puzzle5Instructions.txt"));
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] x = line.split(" ");
            int times = Integer.parseInt(x[1]);
            int from = Integer.parseInt(x[3]);
            int to = Integer.parseInt(x[5]);
            int c = 1;

            for (int i = 0; i < times; i++) {
                cargo[to-1].push(cargo[from-1].pop());
            }
        }

        String result = "";
        for (int c = 0; c < cargo.length; c++) {
            result += cargo[c].peek();
        }

        System.out.println(result);

    }

    private static void loadCargo(Stack[] cargo){
        cargo[0].push("Q");
        cargo[0].push("F");
        cargo[0].push("M");
        cargo[0].push("R");
        cargo[0].push("L");
        cargo[0].push("W");
        cargo[0].push("C");
        cargo[0].push("V");
        cargo[1].push("D");
        cargo[1].push("Q");
        cargo[1].push("L");
        cargo[2].push("P");
        cargo[2].push("S");
        cargo[2].push("R");
        cargo[2].push("G");
        cargo[2].push("W");
        cargo[2].push("C");
        cargo[2].push("N");
        cargo[2].push("B");
        cargo[3].push("L");
        cargo[3].push("C");
        cargo[3].push("D");
        cargo[3].push("H");
        cargo[3].push("B");
        cargo[3].push("Q");
        cargo[3].push("G");
        cargo[4].push("V");
        cargo[4].push("G");
        cargo[4].push("L");
        cargo[4].push("F");
        cargo[4].push("Z");
        cargo[4].push("S");
        cargo[5].push("D");
        cargo[5].push("G");
        cargo[5].push("N");
        cargo[5].push("P");
        cargo[6].push("D");
        cargo[6].push("Z");
        cargo[6].push("P");
        cargo[6].push("V");
        cargo[6].push("F");
        cargo[6].push("C");
        cargo[6].push("W");
        cargo[7].push("C");
        cargo[7].push("P");
        cargo[7].push("D");
        cargo[7].push("M");
        cargo[7].push("S");
        cargo[8].push("Z");
        cargo[8].push("N");
        cargo[8].push("W");
        cargo[8].push("T");
        cargo[8].push("V");
        cargo[8].push("M");
        cargo[8].push("P");
        cargo[8].push("C");
            }
}
