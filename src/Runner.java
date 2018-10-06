public class Runner {
    public static void main(String[] args) {
        int[]print =sort(1,76,8,88,9,7,2,6,76,0);
        for (int x: print){
            System.out.println(x);
        }
    }
    private static int[] sort(int... a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]<a[i+1]){
                int bak = a[i];
                a[i]=a[i+1];
                a[i+1]=bak;
                sort(a);
            }
        }
        return a;
    }
}
