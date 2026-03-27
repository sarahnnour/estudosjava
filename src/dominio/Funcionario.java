package dominio;

public class Funcionario {

    private String name;
    private int age;
    private double[] salary;
    private double media = 0;


    public void imprimir(){

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: ");

        for(double salary: salary){
            System.out.print(salary+" ");
        }
    }

    private void media(){

        for(double salary: salary){
            media+=salary;
        }

        media = media/3;
        System.out.println("Media"+media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMedia() {
        return media;
    }


    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
