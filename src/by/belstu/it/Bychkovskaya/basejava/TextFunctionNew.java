package by.belstu.it.Bychkovskaya.basejava;

public class TextFunctionNew {
    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int test;

    public String getValue(){
        extracted();
        return "Hello from First project";
        
    }
    void extracted() {
        System.out.println("Hello");
    }
}
