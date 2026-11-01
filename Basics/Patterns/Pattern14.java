public class Pattern14 {
    public static void printPattern(int n){
        

        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A'+i; j++) {
                System.out.print(j);
                
            }System.out.println();
        } 
    }
    public static void main(String[]args){
        printPattern(5);
    }
}
