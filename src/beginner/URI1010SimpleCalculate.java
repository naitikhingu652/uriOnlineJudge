package beginner;

import java.io.*;
import java.util.StringTokenizer;

public class URI1010SimpleCalculate {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int product1 = Integer.parseInt(st.nextToken());
        int unit1 = Integer.parseInt(st.nextToken());
        double price1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int product2 = Integer.parseInt(st.nextToken());
        int unit2 = Integer.parseInt(st.nextToken());
        double price2 = Double.parseDouble(st.nextToken());

        bw.write("VALOR A PAGAR: R$ " + String.format("%.2f", (unit1 * price1) + (unit2 * price2)) + "\n");
        bw.flush();
    }
}
