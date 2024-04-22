public class Person 
{
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

   
    public static void main(String[] args)
    {
          Person person1 = new Person("Rohan", 30, "Male");
          person1.introduce();

        
          Person person2 = new Person("Neha” 25, "Female");
          person2.introduce();
    }
}
