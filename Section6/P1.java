public class P1{
    public static void main(String[] args){
        int rand,cnt=0;
        for(int i=0;i<100;i++){
            rand=(int)(100*Math.random());
            if(rand<32){
                cnt++;
            }
            System.out.println("Random["+i+"]="+rand);
        }
        System.out.println("amount of lower than 33 is "+cnt);
    }
}