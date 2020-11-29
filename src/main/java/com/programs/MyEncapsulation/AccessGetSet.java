package MyEncapsulation;

public class AccessGetSet {
    public static void main(String[] args) {
        GetSetMethods myobj = new GetSetMethods();
        myobj.setName("bindu",20);
        System.out.println(myobj.getName()+" "+myobj.getAge());
    }
}
