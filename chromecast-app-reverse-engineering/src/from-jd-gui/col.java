import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class col
  extends Binder
  implements cok
{
  public static cok a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
      if ((localIInterface != null) && ((localIInterface instanceof cok))) {
        paramIBinder = (cok)localIInterface;
      } else {
        paramIBinder = new com(paramIBinder);
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      paramParcel2.writeString("com.google.android.gms.location.ILocationCallback");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = LocationResult.CREATOR;
        paramParcel2 = cnh.a(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
      paramParcel2 = (Parcel)localObject2;
      if (paramParcel1.readInt() != 0)
      {
        paramParcel2 = LocationAvailability.CREATOR;
        paramParcel2 = cnf.a(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\col.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */