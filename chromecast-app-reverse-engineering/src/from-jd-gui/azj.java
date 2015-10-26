import android.content.Context;
import android.content.res.Resources;
import java.util.Timer;

public final class azj
{
  public Timer a;
  final bdm b;
  final bdn c;
  public final long d;
  private final blp e = new blp("SetupStateRefresher");
  
  public azj(Context paramContext, bdm parambdm)
  {
    this.b = parambdm;
    this.d = paramContext.getResources().getInteger(a.fj);
    this.c = new azk(this);
  }
  
  public final void a()
  {
    if (this.a != null)
    {
      this.a.cancel();
      this.a = null;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */