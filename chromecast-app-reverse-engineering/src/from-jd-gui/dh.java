import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class dh
  implements agf, mo
{
  public final Toolbar a;
  public final Drawable b;
  public final CharSequence c;
  public volatile Object d;
  public final CountDownLatch e = new CountDownLatch(1);
  public long f = -1L;
  public long g = -1L;
  
  public int a(Object paramObject)
  {
    return b(paramObject);
  }
  
  public Drawable a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0) {
      this.a.c(this.c);
    }
    for (;;)
    {
      return;
      this.a.b(paramInt);
    }
  }
  
  public void a(agp paramagp) {}
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    this.a.a(paramDrawable);
    a(paramInt);
  }
  
  public void a(bxl parambxl)
  {
    a.f(parambxl, "Notifier must not be null");
    throw new NullPointerException();
  }
  
  public void a(Object paramObject, dep paramdep)
  {
    b(paramObject, paramdep);
  }
  
  public int b(Object paramObject)
  {
    throw new IllegalArgumentException(24 + "Unknown type 0");
  }
  
  public Context b()
  {
    return this.a.getContext();
  }
  
  public void b(bxl parambxl)
  {
    parambxl = this.d;
  }
  
  public void b(Object paramObject, dep paramdep)
  {
    try
    {
      paramdep.c(0);
      paramdep = new java/lang/IllegalArgumentException;
      paramObject = new java/lang/StringBuilder;
      ((StringBuilder)paramObject).<init>(24);
      paramdep.<init>("Unknown type 0");
      throw paramdep;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public boolean c()
  {
    return true;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public Set e()
  {
    return null;
  }
  
  public void f()
  {
    this.d = null;
  }
  
  public void g()
  {
    if (this.f != -1L) {
      throw new IllegalStateException();
    }
    this.f = System.nanoTime();
  }
  
  public void h()
  {
    if ((this.g != -1L) || (this.f == -1L)) {
      throw new IllegalStateException();
    }
    this.g = System.nanoTime();
    this.e.countDown();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */