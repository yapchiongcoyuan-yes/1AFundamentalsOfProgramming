import java.io.*;
public class loop2BR {
        public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(
                  new InputStreamReader(System.in));

          String output = "";

          for (int i = 2; i <= 100; i += 2) {
            output += i + " ";

            if (i % 20 == 0) {
              output += "\n";
            }
          }

          System.out.println(output);
          br.readLine();
        }
      }
