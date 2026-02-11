public class linearSearchCharacter {
public static int searchMenu(String menu[], String key){
    for (int i=0;i<menu.length;i++){
        if(menu[i].equals(key)){
            return i;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        String menu[]={"dosa","idli","cake","chole"};
        String key="cake";
        int idx= searchMenu( menu, key);
        if(idx==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found"+idx);
        }
    }
}
