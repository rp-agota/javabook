public class P2{
    public static void main(String[] args){
        int cnt=0,rand;
        for(int i=0;i<10000;i++){
            rand=(int)(100*Math.random());
            if(rand%2==1){
                cnt++;
            }
            System.out.println("rand["+i+"]="+rand);
        }
        System.out.println("cnt="+cnt);
    }
}