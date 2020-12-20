import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        Scanner scanner = new Scanner(System.in);

        String inputDirectory = "InData/3";
        String inputDelimiter = ",";
        String outputFilePath = "OutData/3/out.txt";
        String delOut = "+";

        int numOfWorkers = 32;

        Controller controller = new Controller(inputDelimiter, delOut, numOfWorkers);
        controller.parseDirectory(inputDirectory, outputFilePath);

        final long endTime   = System.nanoTime();
        final long totalTime = endTime - startTime;

        System.out.println("runtime is " + totalTime + " nano seconds");
    }
}
