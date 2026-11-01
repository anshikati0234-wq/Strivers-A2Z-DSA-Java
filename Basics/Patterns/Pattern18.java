public class Pattern18 {
    public static void printPattern(int n){
        for (int i = n; i >=1; i--) {
            for (char j = (char)('A'+i-1); j < 'A'+n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        printPattern(5);
    }
}
