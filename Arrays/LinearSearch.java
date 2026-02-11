public class LinearSearch {
    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int marks[]={2,3,5,6,7,8,5,4};
      int key=5;
      int index= linearSearch(marks,key);
      if(index==-1){
          System.out.println("not found");

      }
      else{
          System.out.println("found at index:"+index);
      }
    }
}
