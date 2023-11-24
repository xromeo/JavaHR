package datastructures;

/*
 
 Java BitSet


Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a set bit.

Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M (the number of operations to perform), respectively.

The M subsequent lines each contain an operation in one of the following forms:

AND <set> <set>

OR <set> <set>

XOR <set> <set>

FLIP <set> <index>

SET <set> <index>

In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2 <index> is an integer denoting a bit's index in the BitSet corresponding to <set>.

For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1

B2 is the left operand, and B is the right operand. This operation should assign the result of B2 ^ B1 to B2.

Constraints

1 ≤ N ≤ 1000

1 ≤ M <=10000

Output Format

After each operation, print the respective number of set bits in BitSet B1 and BitSet B₂ as 2 space-separated integers on a new line. 
 */

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet[] bitSet = new BitSet[2];
        bitSet[0] = new BitSet(n);
        bitSet[1] = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            if (operation.equals("AND")) { 
                bitSet[sc.nextInt()-1].and(bitSet[sc.nextInt()-1]);
            } else if (operation.equals("OR")) {
                bitSet[sc.nextInt()-1].or(bitSet[sc.nextInt()-1]);
            } else if (operation.equals("XOR")) {
                bitSet[sc.nextInt()-1].xor(bitSet[sc.nextInt()-1]);
            } else if (operation.equals("FLIP")) {
                bitSet[sc.nextInt()-1].flip(sc.nextInt());
            } else if (operation.equals("SET")) {
                bitSet[sc.nextInt()-1].set(sc.nextInt());
            }
            System.out.println(
                bitSet[0].cardinality() + " " + bitSet[1].cardinality()
            );
        }
        sc.close();
    }

    public static void mainTest(String[] args) {
        // Crear un BitSet
        BitSet bitSet = new BitSet();

        // Establecer bits en posiciones específicas
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);

        // Mostrar el BitSet
        System.out.println("BitSet actual: " + bitSet.size());

        // Comprobar si un bit está establecido
        System.out.println("¿El bit en la posición 2 está establecido? " + bitSet.get(2));

        // Realizar operaciones a nivel de bits
        BitSet otroBitSet = new BitSet();
        otroBitSet.set(2);
        otroBitSet.set(3);

        // Operación AND
        bitSet.and(otroBitSet);
        System.out.println("Resultado de AND: " + bitSet);

        // Operación OR
        bitSet.or(otroBitSet);
        System.out.println("Resultado de OR: " + bitSet);
    }
}
