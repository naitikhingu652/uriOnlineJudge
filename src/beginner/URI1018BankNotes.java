package beginner;

import java.io.*;

public class URI1018BankNotes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(n + "\n");
        bw.write(n / 100 + " nota(s) de R$ 100,00" + "\n");
        n %= 100;
        bw.write(n / 50 + " nota(s) de R$ 50,00" + "\n");
        n %= 50;
        bw.write(n / 20 + " nota(s) de R$ 20,00" + "\n");
        n %= 20;
        bw.write(n / 10 + " nota(s) de R$ 10,00" + "\n");
        n %= 10;
        bw.write(n / 5 + " nota(s) de R$ 5,00" + "\n");
        n %= 5;
        bw.write(n / 2 + " nota(s) de R$ 2,00" + "\n");
        n %= 2;
        bw.write(n / 1 + " nota(s) de R$ 1,00" + "\n");
        bw.flush();
    }
}
