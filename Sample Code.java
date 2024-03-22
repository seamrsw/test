
public class Test {

    public Test() {
    }
    
    Machine a;
    public Test(Machine a)
    { 
        this.a=a;
    }
    public void moveMachine()
    {
        System.out.println(this.a.move()); // all switch case statements removed 
    }
    
}