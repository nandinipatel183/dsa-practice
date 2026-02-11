public class Largest {
    public static int largest(int marks[]){
      int largest=Integer.MIN_VALUE;//-infinity
      for(int i=0;i<marks.length;i++){
          if(marks[i]>largest){
              largest=marks[i];

          }
      }
        return largest;
    }

    public static int smallest(int marks[]){
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<marks.length;i++){
            if(marks[i]<smallest){
                smallest=marks[i];

            }
        }
        return smallest;
    }



    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,65,64,33,76,87};
       int result= largest(marks);
        int result1= smallest(marks);
        System.out.println(result);
        System.out.println(result1);
    }
    }

