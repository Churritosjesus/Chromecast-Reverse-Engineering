public final class cmu
{
  public static final int[] a = new int[0];
  public static final String[] b = new String[0];
  public static final byte[][] c = new byte[0][];
  public static final byte[] d = new byte[0];
  
  static int a(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int a(cmj paramcmj, int paramInt)
  {
    int i = 1;
    int j = paramcmj.i();
    paramcmj.b(paramInt);
    while (paramcmj.a() == paramInt)
    {
      paramcmj.b(paramInt);
      i++;
    }
    paramcmj.e(j);
    return i;
  }
  
  public static int b(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */