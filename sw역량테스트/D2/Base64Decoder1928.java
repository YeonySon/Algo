package sw역량테스트.D2;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Base64Decoder1928 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int tc = 1; tc <= T; tc++){
            String message = sc.nextLine();
            byte[] decoded = Base64.getDecoder().decode(message);
            System.out.println("#"+tc+ " " + new String(decoded, StandardCharsets.UTF_8));



        }


    }
}
