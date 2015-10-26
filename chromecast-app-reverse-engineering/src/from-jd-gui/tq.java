import android.content.Context;

public class tq
{
  final Context a;
  final tt b;
  final ts c = new ts(this);
  tr d;
  tp e;
  boolean f;
  tv g;
  boolean h;
  
  tq(Context paramContext, tt paramtt)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    this.a = paramContext;
    this.b = paramtt;
  }
  
  public tu a(String paramString)
  {
    return null;
  }
  
  public final void a(tp paramtp)
  {
    
    if ((this.e == paramtp) || ((this.e != null) && (this.e.equals(paramtp)))) {}
    for (;;)
    {
      return;
      this.e = paramtp;
      if (!this.f)
      {
        this.f = true;
        this.c.sendEmptyMessage(2);
      }
    }
  }
  
  public final void a(tr paramtr)
  {
    tz.f();
    this.d = paramtr;
  }
  
  public final void a(tv paramtv)
  {
    
    if (this.g != paramtv)
    {
      this.g = paramtv;
      if (!this.h)
      {
        this.h = true;
        this.c.sendEmptyMessage(1);
      }
    }
  }
  
  public void b(tp paramtp) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */