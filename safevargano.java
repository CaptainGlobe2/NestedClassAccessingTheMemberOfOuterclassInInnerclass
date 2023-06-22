import java.util.*;
class varar{
    public void displayList(List<String>... lists){
        for(List<String> list : lists){
            System.out.println(list);
        }
    }
}

public class safevargano {
    public static void main (String [] args){
        varar va = new varar();
        List<String> universityList = Arrays.asList("oxford","berlin");
        va.displayList(universityList);

    }
}
//if we use the varagrs annotation to this programm before the method this program does not shows warning