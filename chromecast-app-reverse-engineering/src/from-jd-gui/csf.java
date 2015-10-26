import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

final class csf
  extends crp
{
  private final bwq a;
  
  public csf(bwq parambwq)
  {
    this.a = parambwq;
  }
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder)
  {
    Object localObject = null;
    if (a.b(3))
    {
      new StringBuilder("Owner callback: status=").append(paramInt).append("\nresolution=").append(paramBundle).append("\nholder=").append(paramDataHolder).toString();
      a.b(3);
    }
    Status localStatus = csa.a(paramInt, null, paramBundle);
    if (paramDataHolder == null) {}
    for (paramBundle = (Bundle)localObject;; paramBundle = new csr(paramDataHolder))
    {
      this.a.a(new csh(localStatus, paramBundle));
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */