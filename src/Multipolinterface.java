interface  M1
{
    int X=50;

}
interface M2
{
    int Y=20;
}
interface M3
{
    int Z=10;
}
class  A11 implements M1,M2,M3
{
    public void add()
    {
        int sum=X+Y+Z;
        System.out.println(" Summation :" + sum);
    }
}
public class Multipolinterface
{
    public static void main(String[] args) {
        A11 ob=new A11();
        ob.add();
    }
}
