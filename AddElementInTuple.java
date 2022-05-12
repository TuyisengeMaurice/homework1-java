

import org.javatuples.Pair;
import org.javatuples.Triplet;
public class AddElementInTuple
{
    public static void main(String args[])
    {
        Pair<String, Integer> pair = Pair.with("Jack", 46);
        Triplet<String, Integer, String> triplet = pair.add("Finance Professional");
        System.out.println(pair);
        System.out.println(triplet);
    }
}