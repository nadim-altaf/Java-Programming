class overloading{
void over()
{
System.out.println("No Argument");
}
void over(int a)

{
System.out.println(a);
}
void over(int a , int b)
{
System.out.println(a+b);
}

double over (double a)
{
return a*a;
}
}

class load{
public static void main(String[] args){
	overloading a1 = new overloading();
a1.over();
a1.over(int 5);
a1.over(int 5,int 8);
a1.over(10.546);
}
}

