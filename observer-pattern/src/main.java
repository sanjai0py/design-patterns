class Animal{
    String name;
    int age;
    String color;
    
    boolean breath(){
        return true;
    }

    void sleep(int hours){
        System.out.print("i sleep for " + hours + "hours");
    }
}


class Cat extends Animal{
    private boolean isNasty = false;
    void meao(){
        System.out.print("meao meao meao");
    }
}