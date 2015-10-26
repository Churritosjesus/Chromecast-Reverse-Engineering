import android.os.Build.VERSION;

public final class jx
{
  private static final ka a;
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {
      a = new kb();
    }
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 15) {
        a = new jz();
      } else if (Build.VERSION.SDK_INT >= 14) {
        a = new jy();
      } else {
        a = new ka();
      }
    }
  }
  
  public jx(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public static jx a()
  {
    return new jx(a.a());
  }
  
  public final void a(int paramInt)
  {
    a.b(this.b, paramInt);
  }
  
  public final void a(boolean paramBoolean)
  {
    a.a(this.b, paramBoolean);
  }
  
  public final void b(int paramInt)
  {
    a.a(this.b, paramInt);
  }
  
  public final void c(int paramInt)
  {
    a.c(this.b, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        paramObject = (jx)paramObject;
        if (this.b == null)
        {
          if (((jx)paramObject).b != null) {
            bool = false;
          }
        }
        else if (!this.b.equals(((jx)paramObject).b)) {
          bool = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    if (this.b == null) {}
    for (int i = 0;; i = this.b.hashCode()) {
      return i;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */