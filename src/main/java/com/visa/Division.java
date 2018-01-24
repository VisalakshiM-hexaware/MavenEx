package com.visa;

/**
 * Employee class to store employee personal details.
 * @author visa
 */
public class Division {
    /**
    *int a to store first value.
    */
    private int a;
    /**
    *int b to store second value.
    */
    private int b;

    /**
  *@param argA to set employee date of joining.
  */
    public final void setA(final int argA) {
        this.a = argA;
    }
    /**
  *@param argB to set employee date of joining.
  */
    public final void setB(final int argB) {
        this.b = argB;
    }
    /**
   * Gets the a value.
   * @return this a value.
   */
    public final int getA() {
        return a;
    }
    /**
   * Gets the b value.
   * @return this b value.
   */
    public final int getB() {
        return b;
    }
    /**
    * Perform multiplication.
  *@return result value.
  */
    public final int div(final int a, final int b) {
        return a/b;
    }
    
}

