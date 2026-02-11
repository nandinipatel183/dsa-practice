public class KadanesArray {
    public static void kedanes(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs= 0;

        for(int i=0; i<numbers.length; i++){
            cs=cs+ numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,2,7,-4,9};
        kedanes(numbers);
    }
}
