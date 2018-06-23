package beginner;

import java.io.*;

public class URI1009SalaryWithBonus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = br.readLine();
        double salary = Double.parseDouble(br.readLine());
        double sales = Double.parseDouble(br.readLine());

        bw.write("TOTAL = R$ " + String.format("%.2f", (salary + (15 * sales / 100))) + "\n");
        bw.flush();
    }
}
