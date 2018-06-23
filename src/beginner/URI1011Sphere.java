package beginner;

import java.io.*;

public class URI1011Sphere {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());
        double pi = 3.14159;

        bw.write("VOLUME = " + String.format("%.3f", (4.0/3) * pi * r * r * r ) + "\n");
        bw.flush();
    }
}
