package MyCustomPackage;

class MyCustomPackage{
    String name;
    double balance;

    public MyCustomPackage(String name, double balance){
        this.balance = balance;
        this.name = name;
    }

    public void getBalance(){
        System.out.println("Your Balance is "+balance);
    }

    public  void getAllDetails(){
        System.out.println("You Details are "+name+" "+balance);
    }
}