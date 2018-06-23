package beginner;

import java.io.*;

public class URI1017FuelSpent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hours = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        double mileage = Double.parseDouble("12");

        bw.write(String.format("%.3f", hours * speed / mileage) + "\n");
        bw.flush();
    }
}
