import java.io.*;

public class CopyFile {

    public static StringBuilder data = new StringBuilder();

    public static void main(String[] args) {

        File f1 = new File("C:\\filesInJAVA\\new.txt");
        File f2 = new File("C:\\filesInJAVA\\bufferWrite.txt");
        CopyFile.copyFile(f1, f2);
    }


    public static void copyFile(File f1, File f2) {

        try {
            if (!f1.exists() || !f2.exists()) {
                System.out.println("One or both files don't exist.");
            }

            else {

                BufferedReader br = new BufferedReader(new FileReader(f1));
                int c;
                while((c = br.read()) != -1) {
                    data.append((char)c);
                }
                br.close();

                BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
                bw.write(data.toString());
                bw.close();
                System.out.println("DATA SUCCESFULLY COPIED!!");
            }
        }

        catch(IOException e) {
            System.out.println(e);
        }
    }

}
