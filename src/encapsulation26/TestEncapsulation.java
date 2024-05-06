package encapsulation26;

public class TestEncapsulation {

        public static void main(String[] args) {
            Encapsulate obj=new Encapsulate();
            //setting value of the variable
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);
            //displaying value of the variables
            System.out.println("Prime's name " + obj.getName());
            System.out.println("Prime's age " + obj.getAge());
            System.out.println("Prime's rollNo " +obj.getRollNo());

        }
    }

