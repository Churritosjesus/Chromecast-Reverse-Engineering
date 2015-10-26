import android.util.SparseIntArray;

public abstract class xt
{
  final SparseIntArray a = new SparseIntArray();
  private boolean b = false;
  
  public int a(int paramInt1, int paramInt2)
  {
    int k = 0;
    if (1 == paramInt2) {
      paramInt1 = k;
    }
    for (;;)
    {
      return paramInt1;
      int j = 0;
      int i = 0;
      if (j < paramInt1)
      {
        int m = i + 1;
        if (m == paramInt2) {
          i = 0;
        }
        for (;;)
        {
          j++;
          break;
          i = m;
          if (m > paramInt2) {
            i = 1;
          }
        }
      }
      paramInt1 = k;
      if (i + 1 <= paramInt2) {
        paramInt1 = i;
      }
    }
  }
  
  public final int b(int paramInt1, int paramInt2)
  {
    int m = 0;
    int j = 0;
    int i = 0;
    if (m < paramInt1)
    {
      int n = i + 1;
      int k;
      if (n == paramInt2)
      {
        k = j + 1;
        i = 0;
      }
      for (;;)
      {
        m++;
        j = k;
        break;
        k = j;
        i = n;
        if (n > paramInt2)
        {
          i = 1;
          k = j + 1;
        }
      }
    }
    paramInt1 = j;
    if (i + 1 > paramInt2) {
      paramInt1 = j + 1;
    }
    return paramInt1;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\xt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */