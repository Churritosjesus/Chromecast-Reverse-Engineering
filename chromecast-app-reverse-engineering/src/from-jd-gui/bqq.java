import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import java.util.UUID;

public final class bqq
{
  private final String a;
  private final long b;
  
  bqq(bqp parambqp, String paramString, long paramLong)
  {
    a.f(paramString);
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      a.b(bool);
      this.a = paramString;
      this.b = paramLong;
      return;
    }
  }
  
  private void b()
  {
    long l = this.c.d.c.a();
    SharedPreferences.Editor localEditor = this.c.a.edit();
    localEditor.remove(e());
    localEditor.remove(f());
    localEditor.putLong(d(), l);
    localEditor.commit();
  }
  
  private long c()
  {
    return this.c.a.getLong(d(), 0L);
  }
  
  private String d()
  {
    return this.a + ":start";
  }
  
  private String e()
  {
    return this.a + ":count";
  }
  
  private String f()
  {
    return this.a + ":value";
  }
  
  public final Pair a()
  {
    long l = c();
    Object localObject;
    if (l == 0L)
    {
      l = 0L;
      if (l >= this.b) {
        break label50;
      }
      localObject = null;
    }
    for (;;)
    {
      return (Pair)localObject;
      l = Math.abs(l - this.c.d.c.a());
      break;
      label50:
      if (l > this.b << 1)
      {
        b();
        localObject = null;
      }
      else
      {
        localObject = this.c.a.getString(f(), null);
        l = this.c.a.getLong(e(), 0L);
        b();
        if ((localObject == null) || (l <= 0L)) {
          localObject = null;
        } else {
          localObject = new Pair(localObject, Long.valueOf(l));
        }
      }
    }
  }
  
  public final void a(String paramString)
  {
    if (c() == 0L) {
      b();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    for (;;)
    {
      try
      {
        long l = this.c.a.getLong(e(), 0L);
        if (l <= 0L)
        {
          paramString = this.c.a.edit();
          paramString.putString(f(), str);
          paramString.putLong(e(), 1L);
          paramString.apply();
          return;
        }
        int i;
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + 1L))
        {
          i = 1;
          paramString = this.c.a.edit();
          if (i != 0) {
            paramString.putString(f(), str);
          }
          paramString.putLong(e(), l + 1L);
          paramString.apply();
        }
        else
        {
          i = 0;
        }
      }
      finally {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */