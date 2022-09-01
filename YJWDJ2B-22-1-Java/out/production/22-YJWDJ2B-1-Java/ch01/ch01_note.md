- 2진수 4비트 => 16진수 1개 기호

```
0b0000 == 0x0
0b0001 == 0x1 
  ....
0b1111 == 0xF

Ex) 0b1010_1111_0111_1100 => 0xAF7C
```

```java
public class byte_test {
    public static void main(String[] args) {
        System.out.println("byte");
        System.out.printf("%d, %d, %d\n", (byte)0b0111_1111, (byte)0b1111_1111, (byte)0b1000_0000);
        System.out.printf("%d, %d, %d\n", (byte)0x7F, (byte)0xFF, (byte)0x80);
        System.out.println();
        System.out.println();
        System.out.println("short");
        System.out.printf("%d, %d, %d\n", (short)0x7FFF, (short)0xFFFF, (short)0x8000);
        System.out.println();
        System.out.println();
        System.out.println("int");
        System.out.printf("%d, %d, %d\n", 0x7FFF_FFFF, 0xFFFF_FFFF, 0x8000_0000);
        System.out.println();
        System.out.println();
        System.out.println("long");
        System.out.printf("%d, %d, %d\n", (long)0x7FFF_FFFF_FFFF_FFFFL, (long)0xFFFF_FFFF_FFFF_FFFFL, (long)0x8000_0000_0000_0000L);
    }
}
```


- byte
    - 0b0111_1111 == 0x7F = 127
    - 0b1111_1111 == 0xFF = -1
    - 0b1000_0000 == 0x80 = -128
  


- 음수 표현 = 2의 보수 = 1의 보수 + 1 
- -1 ==> 1의 1의 보수(1111_1110) + 1
- -2 ==> 0000_0010 => 1111_1101 + 1 => 1111_1110


#### printf 형식지정자.
- %.1f ==> 반올림?
- https://atomic0x90.github.io/c-language/2019/06/04/printf-format.html