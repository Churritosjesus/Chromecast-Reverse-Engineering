import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;

public abstract class csz
  extends Binder
  implements csy
{
  public csz()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
  }
  
  public IBinder asBinder()
  {
    return this;
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
      paramParcel2.writeString("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      a(paramParcel1.readString(), paramParcel1.createTypedArrayList(Scope.CREATOR), cte.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
      a(paramParcel1.readString(), paramParcel1.readString(), cte.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */