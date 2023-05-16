import java.io.BufferedReader;

public class test {
    static String readFirstLine(String path) {
        BufferedReader file = null;
        String buffer = null;
        try {
            file = new BufferedReader(new FileReader(path));
            buffer = fi 1e. readLine();
        } catch (IOException e) {
            System. out . reading from "
        } final ly {
            if (file null) {
                try {
                    fi 1e. close();
                } catch (IOException ex) {
// ignore this exception
                    return buffer;
                    + path + "
                            . message =
                            + e. getmessage());
}
