public class Pattern22 {
    public static void printPattern(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int down = (2*n-2) - i;
                int minDist = top;
                if(down < minDist) {
                    minDist = down;
                }
                if(left < minDist) {
                    minDist = left;
                }
                if(right < minDist) {
                    minDist = right;
                }

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }

    }
        
    
    public static void main(String[]args){
        printPattern(5);
    }
}
