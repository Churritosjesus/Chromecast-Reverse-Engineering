import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

final class bll
  implements bwg
{
  bll(GoogleApiClient paramGoogleApiClient, bln parambln, m paramm) {}
  
  public final void a(int paramInt)
  {
    blj.f();
  }
  
  public final void a(Bundle paramBundle)
  {
    blj.f();
    try
    {
      paramBundle = cni.b.a(this.a);
      this.a.c();
      if (paramBundle == null)
      {
        blj.f();
        this.b.a(null);
        return;
      }
    }
    catch (SecurityException paramBundle)
    {
      for (;;)
      {
        blj.f();
        paramBundle = null;
        continue;
        new blo(this.c, this.b).execute(new Location[] { paramBundle });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */