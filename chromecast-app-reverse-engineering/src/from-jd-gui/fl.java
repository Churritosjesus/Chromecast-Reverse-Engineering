import android.view.KeyEvent;

class fl
{
  static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int j = 1;
    int i;
    if ((paramInt2 & paramInt3) != 0)
    {
      i = 1;
      paramInt5 = paramInt4 | paramInt5;
      if ((paramInt2 & paramInt5) == 0) {
        break label53;
      }
      paramInt4 = j;
    }
    for (;;)
    {
      if (i != 0)
      {
        if (paramInt4 != 0)
        {
          throw new IllegalArgumentException("bad arguments");
          i = 0;
          break;
          label53:
          paramInt4 = 0;
          continue;
        }
        paramInt2 = paramInt1 & (paramInt5 ^ 0xFFFFFFFF);
      }
    }
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramInt1;
      if (paramInt4 != 0) {
        paramInt2 = paramInt1 & (paramInt3 ^ 0xFFFFFFFF);
      }
    }
  }
  
  public int a(int paramInt)
  {
    if ((paramInt & 0xC0) != 0) {
      paramInt |= 0x1;
    }
    for (;;)
    {
      int i = paramInt;
      if ((paramInt & 0x30) != 0) {
        i = paramInt | 0x2;
      }
      return i & 0xF7;
    }
  }
  
  public void a(KeyEvent paramKeyEvent) {}
  
  public boolean a(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    if (a(a(a(paramInt1) & 0xF7, paramInt2, 1, 64, 128), paramInt2, 2, 16, 32) == paramInt2) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public boolean b(int paramInt)
  {
    if ((a(paramInt) & 0xF7) == 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */