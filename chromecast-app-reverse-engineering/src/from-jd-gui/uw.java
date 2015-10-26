import android.os.Bundle;

final class uw
  extends tu
{
  private final String a;
  private boolean b;
  private int c = -1;
  private int d;
  private ut e;
  private int f;
  
  public uw(us paramus, String paramString)
  {
    this.a = paramString;
  }
  
  public final void a()
  {
    us.a(this.g, this);
  }
  
  public final void a(int paramInt)
  {
    this.b = false;
    if (this.e != null)
    {
      ut localut = this.e;
      int i = this.f;
      Bundle localBundle = new Bundle();
      localBundle.putInt("unselectReason", paramInt);
      paramInt = localut.c;
      localut.c = (paramInt + 1);
      localut.a(6, paramInt, i, null, localBundle);
    }
  }
  
  public final void a(ut paramut)
  {
    this.e = paramut;
    String str = this.a;
    int i = paramut.d;
    paramut.d = (i + 1);
    Bundle localBundle = new Bundle();
    localBundle.putString("routeId", str);
    int j = paramut.c;
    paramut.c = (j + 1);
    paramut.a(3, j, i, null, localBundle);
    this.f = i;
    if (this.b)
    {
      paramut.a(this.f);
      if (this.c >= 0)
      {
        paramut.a(this.f, this.c);
        this.c = -1;
      }
      if (this.d != 0)
      {
        paramut.b(this.f, this.d);
        this.d = 0;
      }
    }
  }
  
  public final void b()
  {
    this.b = true;
    if (this.e != null) {
      this.e.a(this.f);
    }
  }
  
  public final void b(int paramInt)
  {
    if (this.e != null) {
      this.e.a(this.f, paramInt);
    }
    for (;;)
    {
      return;
      this.c = paramInt;
      this.d = 0;
    }
  }
  
  public final void c()
  {
    a(0);
  }
  
  public final void c(int paramInt)
  {
    if (this.e != null) {
      this.e.b(this.f, paramInt);
    }
    for (;;)
    {
      return;
      this.d += paramInt;
    }
  }
  
  public final void d()
  {
    if (this.e != null)
    {
      ut localut = this.e;
      int i = this.f;
      int j = localut.c;
      localut.c = (j + 1);
      localut.a(4, j, i, null, null);
      this.e = null;
      this.f = 0;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */