import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public final class bqu
  extends bra
{
  final brn a;
  final String b;
  
  public bqu(brb parambrb, brd parambrd)
  {
    super(parambrb);
    a.c(parambrd);
    this.a = parambrd.c(parambrb);
    this.b = f();
  }
  
  private String f()
  {
    Object localObject1;
    if (!byk.a) {
      localObject1 = "";
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        Object localObject2 = String.valueOf(this.d.a.getPackageManager().getPackageInfo(this.d.a.getPackageName(), 0).versionCode);
        localObject1 = localObject2;
        if (((String)localObject2).length() > 4) {
          localObject1 = ((String)localObject2).substring(0, 4);
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("4.5.0-");
        localObject1 = (String)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        e("Failed to get service version", localNameNotFoundException);
        String str = "0";
      }
    }
  }
  
  public final long a(bre parambre)
  {
    r();
    a.c(parambre);
    brb.i();
    long l = this.a.a(parambre, true);
    if (l == 0L) {
      this.a.a(parambre);
    }
    return l;
  }
  
  protected final void a()
  {
    this.a.s();
  }
  
  public final void a(bsf parambsf)
  {
    r();
    this.d.b().a(new bqy(this, parambsf));
  }
  
  public final void a(bsi parambsi)
  {
    a.c(parambsi);
    r();
    b("Hit delivery requested", parambsi);
    this.d.b().a(new bqx(this, parambsi));
  }
  
  public final void a(String paramString, Runnable paramRunnable)
  {
    a.a(paramString, "campaign param can't be empty");
    this.d.b().a(new bqw(this, paramString, paramRunnable));
  }
  
  public final void a(boolean paramBoolean)
  {
    a("Network connectivity status changed", Boolean.valueOf(paramBoolean));
    this.d.b().a(new bqv(this, paramBoolean));
  }
  
  public final void b()
  {
    r();
    Context localContext = this.d.a;
    if ((bpe.a(localContext)) && (bpf.a(localContext)))
    {
      Intent localIntent = new Intent(localContext, bpf.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localContext.startService(localIntent);
    }
    for (;;)
    {
      return;
      a(null);
    }
  }
  
  public final void c()
  {
    r();
    cox.b();
    this.a.f();
  }
  
  final void d()
  {
    brb.i();
    this.a.e();
  }
  
  final void e()
  {
    brb.i();
    this.a.d();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */