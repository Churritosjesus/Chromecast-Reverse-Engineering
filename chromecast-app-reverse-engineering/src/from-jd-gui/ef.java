public final class ef
{
  static final int[] a = new int[0];
  static final Object[] b = new Object[0];
  
  public static int a(int paramInt)
  {
    int j = paramInt << 2;
    for (int i = 4;; i++)
    {
      paramInt = j;
      if (i < 32)
      {
        if (j <= (1 << i) - 12) {
          paramInt = (1 << i) - 12;
        }
      }
      else {
        return paramInt / 4;
      }
    }
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 - 1;
    paramInt1 = i;
    i = j;
    while (paramInt1 <= i)
    {
      j = paramInt1 + i >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2)
      {
        paramInt1 = j + 1;
      }
      else
      {
        i = j;
        if (k <= paramInt2) {
          return i;
        }
        i = j - 1;
      }
    }
    i = paramInt1 ^ 0xFFFFFFFF;
    return i;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */