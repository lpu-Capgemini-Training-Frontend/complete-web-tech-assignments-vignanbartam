package day3;

class Typecasting{
public static void main(String[] args){
System.out.println("-----------Widening-------------");
byte b = 20;
int i = b;
System.out.println(i);
System.out.println(b);
long l = 20;
float f = l;
System.out.println(l);
System.out.println(f);
System.out.println("-----------Narrowing-------------");
int i1 = 200;
byte b1 = (byte) i1;
short s = (short) i1;
System.out.println(i1);
System.out.println(b1);
System.out.println(s);
}

}
