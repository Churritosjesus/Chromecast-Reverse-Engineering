import java.util.HashMap;

public final class azg
{
  public final String a;
  public final aph b;
  public boolean c;
  public HashMap d;
  
  public azg(String paramString, boolean paramBoolean, aph paramaph)
  {
    this.a = paramString;
    this.c = paramBoolean;
    this.b = paramaph;
  }
  
  private static boolean a(bdf parambdf)
  {
    if ((bfl.a(parambdf)) && (!parambdf.w)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final String a()
  {
    return (String)this.d.get("friendly_name");
  }
  
  void a(bdu parambdu, bdf parambdf, bdj parambdj, apd paramapd, bdn parambdn)
  {
    parambdu.a(this.d, parambdf, new azi(this, paramapd, parambdn, parambdj));
  }
  
  public final void a(bdu parambdu, bdf parambdf, bdn parambdn)
  {
    apd localapd;
    if (!a(parambdf))
    {
      localapd = null;
      if (!a(parambdf)) {
        break label114;
      }
      parambdf = new azh(this, parambdu, parambdf, localapd, parambdn);
      long l = parambdu.d();
      parambdn = new bfl(parambdu.d);
      parambdu.a("saveWifi", l, parambdn, parambdu.e, new beg(parambdu, parambdf, parambdn));
    }
    for (;;)
    {
      return;
      if (this.c) {}
      for (int i = 24;; i = 46)
      {
        localapd = new apd(i);
        localapd.h = this.b;
        break;
      }
      label114:
      a(parambdu, parambdf, null, localapd, parambdn);
    }
  }
  
  public final void a(String paramString, Object paramObject)
  {
    this.d.put(paramString, paramObject);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */