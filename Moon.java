class HybridInheritance {
}
class Earth extends HybridInheritance {
}
class Mars extends HybridInheritance {
}
public class Moon extends Earth {
    public static void main(String args[])
    {
        HybridInheritance s = new HybridInheritance();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof HybridInheritance);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof HybridInheritance);
    }
}