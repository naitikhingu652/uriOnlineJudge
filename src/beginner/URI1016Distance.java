package beginner;

import java.io.*;

public class URI1016Distance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int distance = Integer.parseInt(br.readLine());

        bw.write( (distance * 2) +" minutos\n");
        bw.flush();
    }
}