public class strings {
    public static void main(String[] args){
        String name="Akhil Jada";
        String name1="Soumya Jaligam";
        String name2="Kireeti Sriramula";

        if(name.equals(name1)){
            System.out.println(name + " equals "+ name1);
        }
        else {
            System.out.println(name + " not equals "+ name1);
        }
        if(name1.compareTo(name2)>0){
            System.out.println(name1 + " greater than "+ name2);
        }
        else{
            System.out.println(name1 + "less than" + name2);
        }
        String upper=name1.toUpperCase();
        String lower=name2.toLowerCase();
        int find= name1.indexOf("a");
        String surname= name2.substring(8);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println("a in "+ name1+ " is at "+ find);
        System.out.println(name2+ " last name is " + surname);
        StringBuilder s=new StringBuilder(name);
        s.append(" "+name1+" "+name2+" are in meeting");
        System.out.println(s);
        s.replace(51,58,"hyderabad");
        System.out.println(s);
        s.insert(60," trip");
        System.out.println(s);
        s.delete(43,65);
        System.out.println(s);
        s.insert(43," NONE");
        System.out.println(s);
    }
}
