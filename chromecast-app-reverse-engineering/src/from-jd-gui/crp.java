import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public class crp
  extends crs
{
  public void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2) {}
  
  public final void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    throw new RuntimeException("Shouldn't be called");
  }
  
  public void a(int paramInt, Bundle paramBundle1, ParcelFileDescriptor paramParcelFileDescriptor, Bundle paramBundle2) {}
  
  public void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder) {}
  
  public final void a(int paramInt, Bundle paramBundle, DataHolder[] paramArrayOfDataHolder) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */