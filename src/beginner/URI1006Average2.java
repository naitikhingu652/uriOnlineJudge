package beginner;

import java.io.*;

public class URI1006Average2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        double wa = 2;
        double b = Double.parseDouble(br.readLine());
        double wb = 3;
        double c = Double.parseDouble(br.readLine());
        double wc = 5;

        bw.write("MEDIA = " + String .format("%.1f", ((wa *a) + (wb * b) + (wc * c)) / (wa + wb + wc)));
        bw.write("\n");
        bw.flush();
    }
}
