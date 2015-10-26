import android.os.Handler;
import android.os.SystemClock;

final class beh
  implements bff
{
  beh(bdu parambdu, String paramString, long paramLong1, bff parambff, long paramLong2, int paramInt1, bfp parambfp, long paramLong3, int paramInt2) {}
  
  public final void a()
  {
    String str = this.a;
    SystemClock.elapsedRealtime();
    long l = this.i;
    this.b.a();
  }
  
  public final void a(int paramInt)
  {
    if (this.h.a(this.a, this.c)) {}
    for (;;)
    {
      return;
      long l = SystemClock.elapsedRealtime() - this.i;
      Object localObject = this.h.h;
      int j;
      if ((((azv)localObject).i > 0L) && (SystemClock.elapsedRealtime() < ((azv)localObject).i + ((azv)localObject).h))
      {
        j = 1;
        label64:
        if ((paramInt != -1) && (paramInt != -2) && (paramInt != -6) && (paramInt != -8)) {
          break label136;
        }
      }
      label136:
      for (int k = 1;; k = 0)
      {
        if ((k != 0) && ((this.d <= this.e.h) || (j != 0))) {
          break label142;
        }
        localObject = this.a;
        this.b.a(paramInt);
        break;
        j = 0;
        break label64;
      }
      label142:
      localObject = this.a;
      paramInt = this.d;
      paramInt = this.e.h;
      this.h.a.postDelayed(new bei(this), this.f);
    }
  }
  
  public final void b()
  {
    this.b.b();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\beh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */