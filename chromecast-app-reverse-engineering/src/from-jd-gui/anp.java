import android.os.SystemClock;

final class anp
  implements baa
{
  anp(and paramand, apd paramapd, String paramString, long paramLong) {}
  
  public final void a()
  {
    if (this.d.u) {
      ape.a().a(this.a.a(2));
    }
    for (;;)
    {
      return;
      ape.a().a(this.a.a(1));
      this.d.n = and.n(this.d);
      this.d.k = this.b;
      SystemClock.elapsedRealtime();
      long l = this.c;
      if (this.b != null)
      {
        and.o(this.d).f = and.n(this.d).a;
        and.o(this.d).d = this.b;
        and.p(this.d);
      }
      else
      {
        and.b(this.d, null);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    ape.a().a(this.a.a(0));
    String str = this.d.getString(b.eb, new Object[] { Long.valueOf(SystemClock.elapsedRealtime() - this.c) });
    if ((and.q(this.d)) && (!and.c(this.d))) {
      and.b(this.d, this.d.getString(b.dk, new Object[] { and.r(this.d).a }), str);
    }
    for (;;)
    {
      return;
      and.a(this.d, this.d.getString(b.em, new Object[] { and.r(this.d).a }), str);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\anp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */