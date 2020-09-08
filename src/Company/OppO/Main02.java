package Company.OppO;

import java.io.*;

public class Main02 {
    public static void main(String[] args) throws IOException {
        FileInputStream  fi = new FileInputStream("d:\\readme.md");
        InputStreamReader ir = new InputStreamReader(fi,"UTF-8");
        BufferedReader br = new BufferedReader(ir);
        String line;
        while ((line = br.readLine() )!= null){
            System.out.println(line);
        }
        br.close();
        ir.close();
        fi.close();
    }
}
