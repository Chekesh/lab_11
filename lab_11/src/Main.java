interface Tovar {
    void name();
    void price();
    void rating();
}
class TV implements Tovar{
    String name;
    int price;
    double rating;
    TV(String name, int price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    public void name(){
        System.out.println(name);
    }
    public void price(){System.out.println(price);}
    public void rating(){
        System.out.println(rating);
    }
}

class Telephone implements Tovar{
    String name;
    int price;
    double rating;
    Telephone(String name, int price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    public void name(){
        System.out.println(name);
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}

class Laptop implements Tovar{
    String name;
    int price;
    double rating;
    Laptop(String name, int price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    public void name(){
        System.out.println(name);
    }
    public void price(){
        System.out.println(price);
    }
    public void rating(){
        System.out.println(rating);
    }
}

interface User{
    void login();
    void password();
}

class Chekesh implements User{
    String login;
    String password;
    Chekesh(String login, String password){
        this.login=login;
        this.password=password;
    }
    public void login(){
        System.out.println(login);
    }
    public void password(){
        System.out.println(password);
    }
}

class Chebupelka implements User{
    String login;
    String password;
    Chebupelka(String login, String password){
        this.login=login;
        this.password=password;
    }
    public void login(){
        System.out.println(login);
    }
    public void password(){
        System.out.println(password);
    }
}

class Marklum implements User{
    String login;
    String password;
    Marklum(String login, String password){
        this.login=login;
        this.password=password;
    }
    public void login(){
        System.out.println(login);
    }
    public void password(){
        System.out.println(password);
    }
}

class Shop implements Tovar,User{
    String name;
    int price;
    double rating;
    String login;
    String password;
    Shop(String name, int price, double rating, String login, String password){
        this.name=name;
        this.price=price;
        this.rating=rating;
        this.login=login;
        this.password=password;
    }
    public void name(){
        System.out.println(name);
    }
    public void price(){System.out.println(price);}
    public void rating(){
        System.out.println(rating);
    }
    public void login(){
        System.out.println(login);
    }
    public void password(){
        System.out.println(password);
    }
    public void masseg(){
        System.out.println(this.login+" купил "+this.name);
    }

}

public class Main {
    public static void main(String[] args) {
        TV smart89 = new TV("smart89", 70000, 4.4);
        Telephone iphon= new Telephone("iphone 8", 50000, 4.5);
        Laptop msi = new Laptop("msi", 100000, 4.9);
        Chekesh chekesh = new Chekesh("chekesh", "1234");
        Chebupelka chebupelka = new Chebupelka("chebupelka", "0987");
        Marklum marklum = new Marklum("marklum", "1111");
        Shop eldorado = new Shop("smart89", 70000, 4.4,"chekesh", "1234");
        eldorado.masseg();
    }
}