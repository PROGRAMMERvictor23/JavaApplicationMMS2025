public class Operatorspart2{
	 public static void main(String[] args) {
		 int num1 = 70;
		 int num2 = 50;
		 int num3 = 120;
		 // Logical Operators(&&,||,!)
		 boolean andResult = (num1 > num2) && (num1 != num3);
		 System.out.printf("The AND result is %b%n",andResult);
		 
		 boolean orResult = (num1 > num2) || (num1 == num3);
		 System.out.printf("The OR result is %b%n",orResult);
		 
		 boolean notResult = !((num1 > num2) || (num1 == num3));
		 System.out.printf("The NOT result is %b%n",notResult);
		 
		 // Unary Operators(++,--)
		 int x = 5;
		 ++x;
		 
		 System.out.println(The value of x is " + x);
		