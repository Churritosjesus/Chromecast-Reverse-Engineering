import android.os.Handler;
import android.os.SystemClock;

final class ans
  implements Runnable
{
  ans(and paramand, apd paramapd, ayq paramayq, long paramLong, bdf parambdf) {}
  
  public final void run()
  {
    if (this.e.u) {
      ape.a().a(this.a.a(2));
    }
    for (;;)
    {
      return;
      this.b.c();
      if (SystemClock.elapsedRealtime() < this.c)
      {
        and.l(this.e).postDelayed(this, and.s(this.e));
        and.a(this.e, this.b);
      }
      else
      {
        ape.a().a(this.a.a(0));
        if (this.d != null) {}
        for (String str = this.e.getString(b.dE);; str = this.e.getString(b.dD))
        {
          if (!and.c(this.e)) {
            break label176;
          }
          and.a(this.e, this.e.getString(b.dx, new Object[] { this.e.D() }), b.dy, b.dz, str, false);
          break;
        }
        label176:
        and.b(this.e, this.e.getString(b.aA, new Object[] { this.e.D() }), str);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */