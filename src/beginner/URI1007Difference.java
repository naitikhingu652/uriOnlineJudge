package beginner;

import java.io.*;

public class URI1007Difference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        bw.write("DIFERENCA = " + ((a * b) - (c * d)));
        bw.write("\n");
        bw.flush();
    }
}
