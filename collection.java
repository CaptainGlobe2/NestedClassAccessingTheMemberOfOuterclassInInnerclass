import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main (String [] args){
        ArrayList<Integer> aList = new ArrayList<>();//it supports redundency
        for(int i=1;i<=5;i++){
            aList.add(i);
            //System.out.println(aList);
        }
        System.out.println(aList);
        ArrayList<String> slist = new ArrayList<>();//this array list is only for string and we mentioned the string class here in the <>
        slist.add("new data");
        System.out.println(slist);
        slist.add("for string");
        System.out.println(slist);
        ArrayList comlist =new ArrayList();//in this arraylist we does not mention anythin in <> it means this arraylist is not only for particular its for all datatype we can use in it
        comlist.add("String");
        comlist.add(1);
        System.out.println(comlist);//but in the above we only enter the data in mentioned data type
    }
    
}
