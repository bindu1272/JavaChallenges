package MyEncapsulation;
class Vehicle{
    protected String carName = "benz";
    public void carMethod(){
        System.out.println("this is the car Method in vehicle class");
    }
}

class MyInheritanceConcept  extends Vehicle{
    public static void main(String[] args) {
        MyInheritanceConcept myInheritanceConcept = new MyInheritanceConcept();
        myInheritanceConcept.carMethod();
        System.out.println(myInheritanceConcept.carName);
    }

}
