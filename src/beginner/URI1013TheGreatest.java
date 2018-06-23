package beginner;

import java.io.*;
import java.util.StringTokenizer;

public class URI1013TheGreatest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int temp = (a + b + Math.abs(a - b))/2;

        bw.write((temp + c + Math.abs(temp - c))/2 + " eh o maior\n");
        bw.flush();
    }
}
