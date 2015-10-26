import android.content.Context;

final class cyd
{
  bps a;
  private bpo b;
  private Context c;
  
  cyd(Context paramContext)
  {
    this.c = paramContext;
  }
  
  void a(String paramString)
  {
    try
    {
      if (this.b == null)
      {
        this.b = bpo.a(this.c);
        bpo localbpo = this.b;
        Object localObject = new cye;
        ((cye)localObject).<init>();
        bqk.a((bpr)localObject);
        if (!localbpo.f)
        {
          bqd.b.a();
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
          ((StringBuilder)localObject).append((String)bqd.b.a()).append(" DEBUG");
          localbpo.f = true;
        }
        this.a = this.b.a(paramString);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cyd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */