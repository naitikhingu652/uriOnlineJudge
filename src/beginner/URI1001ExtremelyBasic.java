package beginner;

import java.io.*;

public class URI1001ExtremelyBasic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write("X = " + (a + b));
        bw.write("\n");
        bw.flush();
    }
}
