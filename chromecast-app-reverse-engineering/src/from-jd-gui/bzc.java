import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class bzc
{
  final bzd a;
  final Set b;
  int c;
  boolean d;
  IBinder e;
  final bzb f;
  ComponentName g;
  
  public bzc(bza parambza, bzb parambzb)
  {
    this.f = parambzb;
    this.a = new bzd(this);
    this.b = new HashSet();
    this.c = 2;
  }
  
  public final void a(ServiceConnection paramServiceConnection, String paramString)
  {
    bza.c(this.h).a(bza.b(this.h), paramServiceConnection, paramString, this.f.a(), "CONNECT");
    this.b.add(paramServiceConnection);
  }
  
  public final void a(String paramString)
  {
    this.d = bza.c(this.h).a(bza.b(this.h), paramString, this.f.a(), this.a, 129);
    if (this.d) {
      this.c = 3;
    }
    for (;;)
    {
      return;
      bza.c(this.h).a(bza.b(this.h), this.a);
    }
  }
  
  public final boolean a()
  {
    return this.b.isEmpty();
  }
  
  public final boolean a(ServiceConnection paramServiceConnection)
  {
    return this.b.contains(paramServiceConnection);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */