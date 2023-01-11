public class listnote {
    public static void main(String[] args) {
        for (int a = 0; a <=9; a++) {
            for (int b = 0; b <=9; b++) {
                for(int c = 0; c<=9;c++){
                    for(int d= 0 ; d<=9;d++){
                    int sum1=4096*d+256*c+16*b+a;
                    int sum2=1000*d+100*c+10*b+a;
                    if(sum1 % sum2==0){
                        System.out.println(sum2);
                        }
                    }
                }
            }
        }
     return;
    }
}