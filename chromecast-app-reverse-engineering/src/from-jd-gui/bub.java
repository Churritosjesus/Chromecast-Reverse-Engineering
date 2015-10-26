import android.os.Handler;
import android.os.Looper;

public abstract class bub
  extends bud
{
  public boolean a;
  private Handler e = new Handler(Looper.getMainLooper());
  private long f = 1000L;
  private Runnable g = new buc(this);
  
  public bub(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramString1, paramString2, paramString3);
    a(false);
  }
  
  protected final void a(boolean paramBoolean)
  {
    if (this.a != paramBoolean)
    {
      this.a = paramBoolean;
      if (!paramBoolean) {
        break label34;
      }
      this.e.postDelayed(this.g, this.f);
    }
    for (;;)
    {
      return;
      label34:
      this.e.removeCallbacks(this.g);
    }
  }
  
  protected abstract boolean a(long paramLong);
  
  public void c()
  {
    a(false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */