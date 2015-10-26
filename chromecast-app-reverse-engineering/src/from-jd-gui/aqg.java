import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class aqg
  extends apt
{
  private final boolean b;
  
  public aqg(aqd paramaqd, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final void a(int paramInt)
  {
    this.a.j = true;
  }
  
  public final void a(Bundle paramBundle)
  {
    if (this.a.j) {
      this.a.j = false;
    }
    for (;;)
    {
      return;
      paramBundle = new aqh(this);
      try
      {
        if (!this.b) {
          break label91;
        }
        this.a.h.b(this.a.c, paramBundle);
      }
      catch (Exception paramBundle)
      {
        this.a.a.a("Failed to launch application: %s", new Object[] { paramBundle.toString() });
        this.a.a(true);
      }
      continue;
      label91:
      this.a.h.a(this.a.c, paramBundle);
    }
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    this.a.a(true);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */