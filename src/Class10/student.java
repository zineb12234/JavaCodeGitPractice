package Class10;

public class student {
        String name;
        int age;

        String id;
// method/functions/behaviours
        void study(){
            System.out.println("studying 16 hours a day.......");
        }
        public static void main (String[]args){
         student ehab=new student();
            ehab.name="Ehab";
            ehab.age=23;
            ehab.id="abc123";
            ehab.study();
            student habib=new student();
            habib.name="Habib";
            habib.age=20;
            habib.id="abc123";
            habib.study();

        }
    }

