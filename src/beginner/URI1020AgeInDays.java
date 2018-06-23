package beginner;

import java.io.*;

public class URI1020AgeInDays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int days = Integer.parseInt(br.readLine());

        bw.write(days / 365 + " ano(s)\n");
        days %= 365;
        bw.write(days / 30 + " mes(es)\n");
        bw.write(days % 30 + " dia(s)\n");
        bw.flush();
    }
}
