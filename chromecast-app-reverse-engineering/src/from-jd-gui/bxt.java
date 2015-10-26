import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class bxt
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;
  
  public bxt(bxq parambxq, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }
  
  public final void run()
  {
    if (this.b.a()) {}
    for (;;)
    {
      try
      {
        int i = this.c.y.b.f().indexOf(this.c);
        this.b.a(this.c.y, (i + 1 << 16) + 1);
        return;
      }
      catch (IntentSender.SendIntentException localSendIntentException)
      {
        bxq.a(this.c);
        continue;
      }
      if (bvt.b(this.b.c)) {
        bvt.a(this.b.c, this.c.y, this.c, 2, this.c);
      } else {
        bxq.a(this.c, this.a, this.b);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */