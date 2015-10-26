import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

final class agy
  extends OutputStream
  implements ahb
{
  final Map a = new HashMap();
  int b;
  private final Handler c;
  private aga d;
  private ahc e;
  
  agy(Handler paramHandler)
  {
    this.c = paramHandler;
  }
  
  final void a(long paramLong)
  {
    if (this.e == null)
    {
      this.e = new ahc(this.c, this.d);
      this.a.put(this.d, this.e);
    }
    ahc localahc = this.e;
    localahc.d += paramLong;
    this.b = ((int)(this.b + paramLong));
  }
  
  public final void a(aga paramaga)
  {
    this.d = paramaga;
    if (paramaga != null) {}
    for (paramaga = (ahc)this.a.get(paramaga);; paramaga = null)
    {
      this.e = paramaga;
      return;
    }
  }
  
  public final void write(int paramInt)
  {
    a(1L);
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte.length);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramInt2);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */