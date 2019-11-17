import net.sf.saxon.expr.accum.Accumulator;

/** Functions to increment and sum the elements of a WeirdList. */
class WeirdListClient {

    /** Return the result of adding N to each element of L. */
    static WeirdList add(WeirdList L, int n) {
        return L.map(x -> x + n);
        // TODO: REPLACE THIS LINE
    }

    /** Return the sum of all the elements in L. */
    static int sum(WeirdList L) {
        sumWeirdList sumL = new sumWeirdList(0);
        L.map(sumL);
        return sumL.sumVal();
        // TODO: REPLACE THIS LINE
    }

    /* IMPORTANT: YOU ARE NOT ALLOWED TO USE RECURSION IN ADD AND SUM
     *
     * As with WeirdList, you'll need to add an additional class or
     * perhaps more for WeirdListClient to work. Again, you may put
     * those classes either inside WeirdListClient as private static
     * classes, or in their own separate files.

     * You are still forbidden to use any of the following:
     *       if, switch, while, for, do, try, or the ?: operator.
     *
     * HINT: Try checking out the IntUnaryFunction interface.
     *       Can we use it somehow?
     */
}

class sumWeirdList implements IntUnaryFunction {
    private int sum = 0;

    public sumWeirdList(int n) {
        this.sum = n;
    }

    @Override
    public int apply(int x) {
        this.sum += x;
        return x;
    }

    public int sumVal() {
        return this.sum;
    }
}