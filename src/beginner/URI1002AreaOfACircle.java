package beginner;

import java.io.*;

public class URI1002AreaOfACircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = 3.14159;
        double r = Double.parseDouble(br.readLine());

        bw.write("A=" + String.format("%.4f", n * r * r));
        bw.write("\n");
        bw.flush();
    }

}
