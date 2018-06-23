package beginner;

import java.io.*;
import java.util.StringTokenizer;

public class URI1015DistanceBetweenTwoPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        double x1 = Double.parseDouble(st.nextToken());
        double y1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double x2 = Double.parseDouble(st.nextToken());
        double y2 = Double.parseDouble(st.nextToken());

        bw.write(String.format("%.4f", Math.pow(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2), 0.5)) + "\n");
        bw.flush();
    }
}
