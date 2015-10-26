import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class agz
  extends FilterOutputStream
  implements ahb
{
  private final Map a;
  private final agm b;
  private final long c;
  private long d;
  private long e;
  private long f;
  private ahc g;
  
  agz(OutputStream paramOutputStream, agm paramagm, Map paramMap, long paramLong)
  {
    super(paramOutputStream);
    this.b = paramagm;
    this.a = paramMap;
    this.f = paramLong;
    this.c = afv.g();
  }
  
  private void a()
  {
    if (this.d > this.e)
    {
      Iterator localIterator = this.b.d.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (agn)localIterator.next();
        if ((localObject instanceof ago))
        {
          Handler localHandler = this.b.a;
          localObject = (ago)localObject;
          if (localHandler != null) {
            localHandler.post(new aha(this, (ago)localObject));
          }
        }
      }
      this.e = this.d;
    }
  }
  
  private void a(long paramLong)
  {
    if (this.g != null)
    {
      ahc localahc = this.g;
      localahc.b += paramLong;
      if ((localahc.b >= localahc.c + localahc.a) || (localahc.b >= localahc.d)) {
        localahc.a();
      }
    }
    this.d += paramLong;
    if ((this.d >= this.e + this.c) || (this.d >= this.f)) {
      a();
    }
  }
  
  public final void a(aga paramaga)
  {
    if (paramaga != null) {}
    for (paramaga = (ahc)this.a.get(paramaga);; paramaga = null)
    {
      this.g = paramaga;
      return;
    }
  }
  
  public final void close()
  {
    super.close();
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((ahc)localIterator.next()).a();
    }
    a();
  }
  
  public final void write(int paramInt)
  {
    this.out.write(paramInt);
    a(1L);
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    this.out.write(paramArrayOfByte);
    a(paramArrayOfByte.length);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    a(paramInt2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */