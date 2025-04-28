// Parent Class
class parent {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    
    public static int sub(int a, int b)
    {
        return a-b;
    }
}

// Child Class inheriting Parent Class
class child extends parent {
    public static int mul(int a, int b)
    {
        return a*b;
    }
}

// Main Class
class Simple_Inheritence {
    public static void main(String[] args) {
        System.out.println(child.sum(3,5));
        System.out.println(child.sub(3,5));
    }
}
