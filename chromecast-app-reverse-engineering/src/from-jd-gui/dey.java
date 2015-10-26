public final class dey
{
  public static final int[] a = new int[0];
  public static final String[] b = new String[0];
  public static final byte[] c = new byte[0];
  
  static int a(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static boolean a(deo paramdeo, int paramInt)
  {
    return paramdeo.b(paramInt);
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  public static final int b(deo paramdeo, int paramInt)
  {
    int i = 1;
    int j = paramdeo.i();
    paramdeo.b(paramInt);
    while (paramdeo.a() == paramInt)
    {
      paramdeo.b(paramInt);
      i++;
    }
    paramdeo.e(j);
    return i;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */