import java.nio.ByteBuffer;

public final class dbc
  extends dew
{
  private static volatile dbc[] e;
  public String a = null;
  public String b = null;
  public Float c = null;
  public int d = Integer.MIN_VALUE;
  private String f = null;
  
  public dbc()
  {
    this.t = -1;
  }
  
  public static dbc[] b()
  {
    if (e == null) {}
    synchronized (deu.a)
    {
      if (e == null) {
        e = new dbc[0];
      }
      return e;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int j = i;
    if (this.a != null) {
      j = i + dep.b(1, this.a);
    }
    i = j;
    if (this.f != null) {
      i = j + dep.b(2, this.f);
    }
    j = i;
    if (this.b != null) {
      j = i + dep.b(3, this.b);
    }
    i = j;
    if (this.c != null)
    {
      this.c.floatValue();
      i = j + (dep.b(4) + 4);
    }
    j = i;
    if (this.d != Integer.MIN_VALUE) {
      j = i + dep.b(5, this.d);
    }
    return j;
  }
  
  public final void a(dep paramdep)
  {
    if (this.a != null) {
      paramdep.a(1, this.a);
    }
    if (this.f != null) {
      paramdep.a(2, this.f);
    }
    if (this.b != null) {
      paramdep.a(3, this.b);
    }
    if (this.c != null)
    {
      float f1 = this.c.floatValue();
      paramdep.c(4, 5);
      int i = Float.floatToIntBits(f1);
      if (paramdep.a.remaining() < 4) {
        throw new deq(paramdep.a.position(), paramdep.a.limit());
      }
      paramdep.a.putInt(i);
    }
    if (this.d != Integer.MIN_VALUE) {
      paramdep.a(5, this.d);
    }
    super.a(paramdep);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */