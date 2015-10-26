import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;

public abstract class cju
  extends Binder
  implements cjt
{
  public cju()
  {
    attachInterface(this, "com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
  }
  
  public static cjt a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof cjt))) {
        paramIBinder = (cjt)localIInterface;
      } else {
        paramIBinder = new cjv(paramIBinder);
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
      for (;;)
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
        a();
        paramParcel2.writeNoException();
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
        a(paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
        b();
        paramParcel2.writeNoException();
        bool = true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (CastDevice)CastDevice.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      a(paramParcel1);
      paramParcel2.writeNoException();
      bool = true;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */