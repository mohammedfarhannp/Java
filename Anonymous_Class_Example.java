// Anonymous Class testing

// Interface or Abstract class
abstract class AnonClass {
    abstract void root();
}

// Main class
class Anonymous_Class_Example {
    // Main method of main class (Entry Point)
    public static void main(String[] args) {
        /*
            Anonymous Class Syntax below
            
            Type Var_Name = new Type() {
                ... Code ...
            }
        */
        AnonClass Object_1 = new AnonClass() {
            @Override
            public void root()
            {
                System.out.println("Anonymous Class Works!");
            }
        };
        
        // Anonymous class object method is called!
        Object_1.root();
    }
}
