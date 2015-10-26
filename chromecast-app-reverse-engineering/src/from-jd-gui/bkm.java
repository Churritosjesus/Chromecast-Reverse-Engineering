import android.util.LruCache;
import java.util.concurrent.TimeUnit;

public final class bkm
{
  static final long b = TimeUnit.DAYS.toMillis(1L);
  public final LruCache a = new LruCache(100);
  private final bkl c;
  
  public bkm()
  {
    this(bkl.a());
  }
  
  private bkm(bkl parambkl)
  {
    this.c = parambkl;
  }
  
  public final dbi a(String paramString)
  {
    synchronized (this.a)
    {
      bkn localbkn = (bkn)this.a.get(paramString);
      if (localbkn == null)
      {
        paramString = null;
        return paramString;
      }
      long l = localbkn.a;
      bkl localbkl = localbkn.c.c;
      if (l - bkl.b() <= 0L) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label85;
        }
        this.a.remove(paramString);
        paramString = null;
        break;
      }
      label85:
      paramString = (dbi)localbkn.b;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */