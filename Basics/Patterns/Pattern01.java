public class Pattern01{
    public static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println();
        }

    }
    public static void main(String[] args) {
        printPattern(4); // Call your method with a number, e.g., 4
    }
}
