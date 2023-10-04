interface CubeFunction{
int cube(int num);
}
public class setad
{
public static void main(String[] args)
{
CubeFunction cubeFunction=num -> num*num*num;
int number=5;

int cubeResult=cubeFunction.cube(number);
System.out.println("Cube of"+number+"is:"+cubeResult);


}
}

