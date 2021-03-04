/*
 * Test09_BufferedReader, BufferedWriter
 */
package other2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Test09_BufferedReaderWriter {
	public static void main(String[] args) {
// 1) BufferedReader
        String fileName = "C:\\Temp\\helloReader.txt";

        BufferedReader br = null;	// 행단위 읽기
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String strLine;

            while ((strLine = br.readLine()) != null) {     // 한 라인 씩 읽기
                System.out.println(strLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
//--------------------------------------------------------------------------------------- 
// 2) BufferedWriter       
        String fileName1 = ("C:\\Temp\\helloWriter.txt");

        BufferedWriter bw = null;	// // 행단위 쓰기
        FileWriter fw = null;
        try {
            String str = "BufferedWriter Test 파일입니다.\n";    // 개행 해서 3행으로
            str += "BufferedWriter Test 파일입니다.\n";
            str += "BufferedWriter Test 파일입니다.\n";

            fw = new FileWriter(fileName1);
            bw = new BufferedWriter(fw);
            bw.write(str);
            System.out.println("end");      // 문제가 없다면 end 출력

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
              
    }
}
