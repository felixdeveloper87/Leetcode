import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // se o intervalo, ou seja somente tiver 1 array dentro do array "pai", retorna
        if (intervals.length <= 1)
            return intervals;
        // agora precisamos ordenar esse array, no caso abaixo usamos uma funcao anonima
        // chamada de lambda que compara apenas os dois primeiros elementos do array
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // agora criamos uma lista dinamica para armazenar os intervals
        List<int[]> merged = new ArrayList<>();

        // agora criamos um array ( variavel ) para armezenar cada intervalo e
        // adicionamos ela a nossa Lista // A lista merged inicial eh [[1,3]]
        int[] newInterval = intervals[0];
        merged.add(newInterval);

        // for loop para ler cada array dentro de intervals
        for (int i = 0; i < intervals.length; i++) {
            // e dentro de cada array ler cada numero, intervals[0] = [1,3]
            // actualInterval[0] = 1 / actualInterval[1]= 3
            int[] actualInterval = intervals[i];
            System.out.println("intervalo atual " + Arrays.toString(actualInterval));
            System.out.println("comparando se " + actualInterval[0] + " eh menor que " +
                    newInterval[1]);
            if (actualInterval[0] <= newInterval[1]) {
                System.out.println("SIM eh menor");
                System.out.println();
                // 
                newInterval[1] = Math.max(newInterval[1], actualInterval[1]);
                System.out.println("Max de " + Arrays.toString(newInterval) + "eh " + newInterval[1]);
            } else {
                System.out.println("nao eh!");
                newInterval = actualInterval;
                merged.add(newInterval);

            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    // method to test
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();

        int[][] input1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(Arrays.deepToString(solution.merge(input1)));
    }
}
