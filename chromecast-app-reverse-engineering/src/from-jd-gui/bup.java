import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.LaunchOptions;

public abstract class bup
  extends Binder
  implements buo
{
  public static buo a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
      if ((localIInterface != null) && ((localIInterface instanceof buo))) {
        paramIBinder = (buo)localIInterface;
      } else {
        paramIBinder = new buq(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    boolean bool3 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
      for (;;)
      {
        return bool1;
        paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        paramParcel2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a(paramParcel2, bool1);
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.readString());
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        b();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString());
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        c();
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        double d1 = paramParcel1.readDouble();
        double d2 = paramParcel1.readDouble();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a(d1, d2, bool1);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          d1 = paramParcel1.readDouble();
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          a(bool1, d1, bool2);
          bool1 = bool3;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        a(paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readLong());
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        b(paramParcel1.readString());
        bool1 = bool3;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        c(paramParcel1.readString());
        bool1 = bool3;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
    paramParcel2 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      a(paramParcel2, paramParcel1);
      bool1 = bool3;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */