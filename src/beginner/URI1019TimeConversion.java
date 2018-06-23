package beginner;

import java.io.*;

public class URI1019TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int seconds = Integer.parseInt(br.readLine());

        bw.write(seconds / 3600 + ":");
        seconds %= 3600;
        bw.write(seconds / 60 + ":" + seconds % 60 + "\n");
        bw.flush();
    }
}
