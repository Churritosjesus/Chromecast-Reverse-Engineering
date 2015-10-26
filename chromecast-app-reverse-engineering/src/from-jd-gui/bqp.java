import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

public final class bqp
  extends bra
{
  SharedPreferences a;
  final bqq b = new bqq(this, "monitoring", ((Long)bqd.D.a()).longValue());
  private long c;
  private long e = -1L;
  
  protected bqp(brb parambrb)
  {
    super(parambrb);
  }
  
  protected final void a()
  {
    this.a = this.d.a.getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
  }
  
  public final void a(String paramString)
  {
    brb.i();
    r();
    SharedPreferences.Editor localEditor = this.a.edit();
    if (TextUtils.isEmpty(paramString)) {
      localEditor.remove("installation_campaign");
    }
    for (;;)
    {
      if (!localEditor.commit()) {
        e("Failed to commit campaign data");
      }
      return;
      localEditor.putString("installation_campaign", paramString);
    }
  }
  
  public final long b()
  {
    brb.i();
    r();
    long l;
    if (this.c == 0L)
    {
      l = this.a.getLong("first_run", 0L);
      if (l == 0L) {
        break label45;
      }
    }
    for (this.c = l;; this.c = l)
    {
      return this.c;
      label45:
      l = this.d.c.a();
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putLong("first_run", l);
      if (!localEditor.commit()) {
        e("Failed to commit first run time");
      }
    }
  }
  
  public final bqr c()
  {
    return new bqr(this.d.c, b());
  }
  
  public final long d()
  {
    brb.i();
    r();
    if (this.e == -1L) {
      this.e = this.a.getLong("last_dispatch", 0L);
    }
    return this.e;
  }
  
  public final void e()
  {
    brb.i();
    r();
    long l = this.d.c.a();
    SharedPreferences.Editor localEditor = this.a.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.e = l;
  }
  
  public final String f()
  {
    Object localObject = null;
    brb.i();
    r();
    String str = this.a.getString("installation_campaign", null);
    if (TextUtils.isEmpty(str)) {}
    for (;;)
    {
      return (String)localObject;
      localObject = str;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */