import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public abstract interface crr
  extends IInterface
{
  public abstract void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor);
  
  public abstract void a(int paramInt, Bundle paramBundle1, ParcelFileDescriptor paramParcelFileDescriptor, Bundle paramBundle2);
  
  public abstract void a(int paramInt, Bundle paramBundle, DataHolder paramDataHolder);
  
  public abstract void a(int paramInt, Bundle paramBundle, DataHolder[] paramArrayOfDataHolder);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */