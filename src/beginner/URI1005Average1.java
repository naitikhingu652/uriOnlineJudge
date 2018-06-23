package beginner;

import java.io.*;

public class URI1005Average1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        double wa = 3.5;
        double b = Double.parseDouble(br.readLine());
        double wb = 7.5;

        bw.write("MEDIA = " + String .format("%.5f", ((wa *a) + (wb * b)) / (wa + wb)));
        bw.write("\n");
        bw.flush();
    }
}
