interface Ibehaviour{
    public void putTV();
} 

 class enthiranPutTV implements Ibehaviour{
    @Override
    public void putTV(){
        System.out.print("damal dumeel damal dumeel 💥💥💥 \n");
    }
}

 class iPutTV implements Ibehaviour{
    @Override
    public void putTV(){
        System.out.print("the tv is turned on and hands-up 🔫🔫.\n");
    }
}


class Robot{
    String name;
    Ibehaviour behaviour;


    // const
    Robot(String name){
        this.name = name; //initially the robot's name is only determined not its behaviour
    }

    // set its behaviour
    public void setBehviour(Ibehaviour behaviour){
        this.behaviour = behaviour;
    }

    // get its behaviour
    public Ibehaviour getBehaviour(){
        return this.behaviour;
    }

    // set its name
    public void setName(String newName){
        this.name = newName;
    }

    // get its name
    public String getName(){
        return this.name;
    }

}



public class strategy{
    public static void main(String[] args){
        Robot iRobot = new Robot("i");
        Robot enthiranRobot = new Robot("enthiran");

        iRobot.setBehviour(new iPutTV());
        iRobot.getBehaviour().putTV();
        
        enthiranRobot.setBehviour(new enthiranPutTV());
        enthiranRobot.getBehaviour().putTV();
    }
}