public class encap {
    public static void main(String[] args){
        hidden my=new hidden(4,2,"blue");
        hidden you=new hidden(6,4,"red");
        printhouse(my);
        printhouse(you);

      /*  my.setwindows(4);
        my.setcolour("blue");
        my.setfloors(2);*/


       /* you.setwindows(6);
        you.setcolour("red");
        you.setfloors(4);*/

       /* System.out.println("my "+my.getColour()+" colour house has "+ my.getwindows() +" windows and "+ my.getfloors() +" floors.");

        System.out.println("my "+you.getColour()+" colour house has "+ you.getwindows() +" windows and "+ you.getfloors() +" floors.");*/

    }
    public static void printhouse(hidden Hidden){
        System.out.println("my "+Hidden.getColour()+" colour house has "+ Hidden.getwindows() +" windows and "+ Hidden.getfloors() +" floors.");
    }
}
