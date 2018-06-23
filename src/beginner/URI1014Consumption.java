package beginner;

import java.io.*;

public class URI1014Consumption {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int distance = Integer.parseInt(br.readLine());
        double fuel = Double.parseDouble(br.readLine());

        bw.write(String.format("%.3f", distance/fuel) + " km/l\n");
        bw.flush();
    }
}
