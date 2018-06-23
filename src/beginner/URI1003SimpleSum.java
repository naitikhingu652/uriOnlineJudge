package beginner;

import java.io.*;

public class URI1003SimpleSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write("SOMA = " + (a + b));
        bw.write("\n");
        bw.flush();
    }
}
