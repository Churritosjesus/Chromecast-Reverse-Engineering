import android.text.TextUtils;

public class bud
{
  public final buu b;
  public final String c;
  public buw d;
  
  protected bud(String paramString1, String paramString2, String paramString3)
  {
    a.d(paramString1);
    this.c = paramString1;
    this.b = new buu(paramString2);
    if (!TextUtils.isEmpty(paramString3))
    {
      paramString2 = this.b;
      if (!TextUtils.isEmpty(paramString3)) {
        break label52;
      }
    }
    label52:
    for (paramString1 = null;; paramString1 = String.format("[%s] ", new Object[] { paramString3 }))
    {
      paramString2.a = paramString1;
      return;
    }
  }
  
  public void a(String paramString) {}
  
  protected final void a(String paramString1, long paramLong, String paramString2)
  {
    this.b.a("Sending text message: %s to: %s", new Object[] { paramString1, null });
    this.d.a(this.c, paramString1, paramLong);
  }
  
  public void c() {}
  
  protected final long d()
  {
    return this.d.a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */