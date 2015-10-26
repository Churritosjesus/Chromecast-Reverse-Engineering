final class cyg
  extends Number
  implements Comparable
{
  boolean a;
  private double b;
  private long c;
  
  private cyg(double paramDouble)
  {
    this.b = paramDouble;
    this.a = false;
  }
  
  private cyg(long paramLong)
  {
    this.c = paramLong;
    this.a = true;
  }
  
  public static cyg a(long paramLong)
  {
    return new cyg(paramLong);
  }
  
  public static cyg a(Double paramDouble)
  {
    return new cyg(paramDouble.doubleValue());
  }
  
  public static cyg a(String paramString)
  {
    try
    {
      cyg localcyg1 = new cyg;
      localcyg1.<init>(Long.parseLong(paramString));
      paramString = localcyg1;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        cyg localcyg2 = new cyg(Double.parseDouble(paramString));
        paramString = localcyg2;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        throw new NumberFormatException(paramString + " is not a valid TypedNumber");
      }
    }
    return paramString;
  }
  
  public final int a(cyg paramcyg)
  {
    if ((this.a) && (paramcyg.a)) {}
    for (int i = new Long(this.c).compareTo(Long.valueOf(paramcyg.c));; i = Double.compare(doubleValue(), paramcyg.doubleValue())) {
      return i;
    }
  }
  
  public final byte byteValue()
  {
    return (byte)(int)longValue();
  }
  
  public final double doubleValue()
  {
    if (this.a) {}
    for (double d = this.c;; d = this.b) {
      return d;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (((paramObject instanceof cyg)) && (a((cyg)paramObject) == 0)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final float floatValue()
  {
    return (float)doubleValue();
  }
  
  public final int hashCode()
  {
    return new Long(longValue()).hashCode();
  }
  
  public final int intValue()
  {
    return (int)longValue();
  }
  
  public final long longValue()
  {
    if (this.a) {}
    for (long l = this.c;; l = this.b) {
      return l;
    }
  }
  
  public final short shortValue()
  {
    return (short)(int)longValue();
  }
  
  public final String toString()
  {
    if (this.a) {}
    for (String str = Long.toString(this.c);; str = Double.toString(this.b)) {
      return str;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */