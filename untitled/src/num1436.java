import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num1436 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        visited = new boolean[N + 1];

        permutation(0, new int[M]);

        System.out.println(sb.toString());;
    }

    public static void permutation(int idx, int[] selected) {
        if(idx == M) {
            String result = "";
            for(int i=0; i<M; i++){
                result += selected[i] + " ";
            }
            sb.append(result + "\n");
            return;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]) continue;

            selected[idx] = i;
            visited[i] = true;
            permutation(idx + 1, selected);
            visited[i] = false;
        }
    }

    public static int stoi(String s){
        return Integer.parseInt(s);
    }
}
