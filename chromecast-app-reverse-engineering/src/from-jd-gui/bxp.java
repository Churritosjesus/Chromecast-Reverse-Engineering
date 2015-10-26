import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

final class bxp
  implements Runnable
{
  private final int a;
  private final ConnectionResult b;
  
  public bxp(bxn parambxn, int paramInt, ConnectionResult paramConnectionResult)
  {
    this.a = paramInt;
    this.b = paramConnectionResult;
  }
  
  public final void run()
  {
    if ((!bxn.a(this.c)) || (bxn.b(this.c))) {}
    for (;;)
    {
      return;
      bxn.a(this.c, true);
      bxn.a(this.c, this.a);
      bxn.a(this.c, this.b);
      if (this.b.a()) {
        try
        {
          int i = this.c.y.b.f().indexOf(this.c);
          this.b.a(this.c.y, (i + 1 << 16) + 1);
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          bxn.c(this.c);
        }
      } else if (bvt.b(this.b.c)) {
        bvt.a(this.b.c, this.c.y, this.c, 2, this.c);
      } else {
        bxn.a(this.c, this.a, this.b);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */