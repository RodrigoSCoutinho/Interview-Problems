import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QuickSortPartition1 {

    class Result {

        /*
         * Complete the 'quickSort' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static List<Integer> quickSort(List<Integer> arr) {
            int pivot = arr.get(0);
            List<Integer> low = new ArrayList<>();
            List<Integer> equal = new ArrayList<>();
            List<Integer> high = new ArrayList<>();

            // Adiciona o pivô na lista "equal"
            equal.add(pivot);

            // Particiona os elementos
            for (int i = 1; i < arr.size(); i++) {
                int num = arr.get(i);
                if (num < pivot) {
                    low.add(num);
                } else if (num > pivot) {
                    high.add(num);
                } else {
                    equal.add(num);
                }
            }

            // Combina as listas
            List<Integer> result = new ArrayList<>(low);
            result.addAll(equal);
            result.addAll(high);

            return result;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> result = Result.quickSort(arr);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
