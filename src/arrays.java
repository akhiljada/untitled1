public class arrays {
    public static void main(String[] args){
        int[] array1=new int[5];
        array1[0]=2;
        array1[1]=6;
        array1[2]=3;
        array1[3]=9;
        array1[4]=4;
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        //enhanced for loop
        for(int num:array1){
            System.out.println(num);
        }
    }
}
