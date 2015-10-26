import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class byf
  extends Binder
  implements bye
{
  public static bye a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
      if ((localIInterface != null) && ((localIInterface instanceof bye))) {
        paramIBinder = (bye)localIInterface;
      } else {
        paramIBinder = new byg(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      paramParcel2.writeString("com.google.android.gms.common.internal.ICancelToken");
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.ICancelToken");
      a();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */