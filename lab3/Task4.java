import java.lang.*;
class Task4{
public static void main(String args[]){
int num1,num2,result;
char op;
num1=Integer.parseInt(args[0]);
op=args[1].charAt(0);
num2=Integer.parseInt(args[2]);

switch(op)
{
    case '+':
    result=num1+num2;
    System.out.print(result);
    break;

    case '*' :
    result=num1*num2;
    System.out.print(result);
    break;

    case '-' :
    result=num1-num2;
    System.out.print(result);
    break;

    case '/':
    result=num1/num2;
    System.out.print(result);
    break;

    default:
    break;
}
}
}
