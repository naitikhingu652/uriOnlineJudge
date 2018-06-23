package beginner;

import java.io.*;
import java.util.StringTokenizer;

public class URI1012Area {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double pi = 3.14159;

        bw.write("TRIANGULO: " + String.format("%.3f", a * c / 2) + "\n");
        bw.write("CIRCULO: " + String.format("%.3f", pi * c * c) + "\n");
        bw.write("TRAPEZIO: " + String.format("%.3f", ((a + b) / 2) * c) + "\n");
        bw.write("QUADRADO: " + String.format("%.3f", b * b) + "\n");
        bw.write("RETANGULO: " + String.format("%.3f", a * b) + "\n");
        bw.flush();
    }
}
