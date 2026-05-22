public class Main
{
   public static void main(String[] args)
   {
       student s = new student();

       s.setname("Mohammed");
       s.setage(20);

       System.out.println("Name :" + s.getname());
       System.out.println("Age :" + s.getage());
   }
}

class student
{
   private String name;
   private int age;

   public String getname() {return name;}
   public int getage() {return age;}

   public void setname(String newname) {name = newname;}

   public void setage(int newage)
   {
       if(newage > 0){ age = newage;}
       else System.out.println("unvalid age");
   }
}