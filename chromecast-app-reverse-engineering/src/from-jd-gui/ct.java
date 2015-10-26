import android.content.Context;
import android.os.Build.VERSION;

public final class ct
{
  public final cy a;
  private final dm b;
  
  public ct(Context paramContext, dm paramdm)
  {
    if (paramdm == null) {
      throw new IllegalArgumentException("sessionToken must not be null");
    }
    this.b = paramdm;
    if (Build.VERSION.SDK_INT >= 21) {}
    for (this.a = new cz(paramContext, paramdm);; this.a = new da(this.b)) {
      return;
    }
  }
  
  public final dc a()
  {
    return this.a.a();
  }
  
  public final void a(cu paramcu)
  {
    if (paramcu == null) {
      throw new IllegalArgumentException("callback cannot be null");
    }
    this.a.a(paramcu);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */