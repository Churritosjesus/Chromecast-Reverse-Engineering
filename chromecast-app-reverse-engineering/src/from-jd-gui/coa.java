import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

public final class coa
{
  final coh a;
  boolean b = false;
  Map c = new HashMap();
  Map d = new HashMap();
  private final Context e;
  
  public coa(Context paramContext, coh paramcoh)
  {
    this.e = paramContext;
    this.a = paramcoh;
  }
  
  public final Location a()
  {
    this.a.a();
    try
    {
      Location localLocation = ((cnu)this.a.b()).b(this.e.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\coa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */