import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;

public final class bbg
  implements Runnable
{
  public bbg(CastScreenActivity paramCastScreenActivity) {}
  
  public final void run()
  {
    CastScreenActivity.f(this.a);
    if ((!CastScreenActivity.d(this.a).b()) && (CastScreenActivity.g(this.a)))
    {
      CastScreenActivity.h(this.a);
      if (!CastScreenActivity.i(this.a)) {
        CastScreenActivity.a(this.a, false);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */