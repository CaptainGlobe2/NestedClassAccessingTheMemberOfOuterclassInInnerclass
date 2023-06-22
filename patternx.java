class oddletters{
    public void patternodd(String word){
        int length= word.length();
        System.out.println(length);
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j||i+j==length-1){// this is the core of the programm the condition i give check the i and j is equal at ever iteration if i =0 if j=0 it print the p and check i+j=length-1 i+j=length-1 0+0=5-1 wrong 0+5=lenght-1
                    System.out.print(word.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class patternx {
    public static void main(String[] args){
        oddletters od =new oddletters();
        od.patternodd("programmer");
    }
}
