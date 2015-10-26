import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.chromecast.app.SetupApplication;

final class ano
  implements bdn
{
  ano(ann paramann) {}
  
  public final void b_(int paramInt)
  {
    if (paramInt == -99)
    {
      ape.a().a(this.a.a.a(2));
      this.a.c.w();
    }
    for (;;)
    {
      return;
      ape.a().a(this.a.a.a(0));
      if (paramInt == -8)
      {
        SetupApplication.a().c(String.format("Lost hotspot connection during setup (%d)", new Object[] { Integer.valueOf(paramInt) }));
        and.a(this.a.c, null);
      }
      else
      {
        long l = SystemClock.elapsedRealtime();
        if ((!SetupApplication.a(paramInt)) || (l >= this.a.b) || (l >= and.i(this.a.c))) {
          and.a(this.a.c, this.a.c.getString(b.aB), this.a.c.getString(b.aW, new Object[] { Integer.valueOf(paramInt) }));
        } else {
          and.l(this.a.c).postDelayed(and.j(this.a.c), and.k(this.a.c));
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ano.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */