import android.content.Context;

final class cud
  implements cuf
{
  private static cud a;
  private static final Object b = new Object();
  private cwq c;
  private cvl d;
  
  private cud(Context paramContext)
  {
    this(cvm.a(paramContext), new cxs());
  }
  
  private cud(cvl paramcvl, cwq paramcwq)
  {
    this.d = paramcvl;
    this.c = paramcwq;
  }
  
  public static cuf a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
      {
        cud localcud = new cud;
        localcud.<init>(paramContext);
        a = localcud;
      }
      paramContext = a;
      return paramContext;
    }
  }
  
  public final boolean a(String paramString)
  {
    if (!this.c.a()) {
      cuh.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      this.d.a(paramString);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */