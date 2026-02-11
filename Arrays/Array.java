import java.util.Scanner;

public class Array {
    public static void update(int marks[]){
        for(int i= 0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
     int marks[]={23,45,45};
        update(marks);

        for(int i=0 ; i<marks.length;i++) {
            System.out.println(marks[i]);
        }
//        int marks[] = new int[50];
//        int numbers[] = {1,2,3};
//        String fruits[]={"apple","orange","mango"};
////        Scanner sc = new Scanner(System.in);
//        marks[0]=sc.nextInt(); //phy
//        marks[1]=sc.nextInt();//chem
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        marks[1]= marks[1] + 89;
//        System.out.println(marks[1]);

//        System.out.println(marks.length);
    }

}
