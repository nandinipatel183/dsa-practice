package Basics;
public static boolean isEven(int n)
{
  int rem= n%2;
  if (rem==0)
{
  return true;


}
return false;
}


public static void main(String[] args) {
  int n=5;
  if(isEven(n)==true){
    System.out.println("it is a even number");
  }
else{
  System.out.println("it is a odd no.");
}
}