
class gfg1 {
    static int setBits(int N) {
        int count = 0;
        while(N>0){
            int t = N%2;
            if(t==1){
                count+=1;
            }
            N=N/2;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("POTD - 1st July");
    }
}