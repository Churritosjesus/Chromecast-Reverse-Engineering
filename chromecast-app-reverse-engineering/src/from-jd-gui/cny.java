import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class cny
  extends Binder
  implements cnx
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
    if (paramParcel1.readInt() != 0) {
      cnk localcnk = LocationSettingsResult.CREATOR;
    }
    for (paramParcel1 = cnk.a(paramParcel1);; paramParcel1 = null)
    {
      a(paramParcel1);
      paramParcel2.writeNoException();
      bool = true;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */