package beginner;

import java.io.*;

public class URI1008Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        double sh = Double.parseDouble(br.readLine());

        bw.write("NUMBER = " + n + "\n");
        bw.write("SALARY = U$ " + String.format("%.2f", h * sh ) + "\n");
        bw.flush();
    }
}
