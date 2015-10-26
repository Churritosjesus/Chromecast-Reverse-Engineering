import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;

public abstract class ckq
  extends Binder
  implements ckp
{
  public static ckp a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      if ((localIInterface != null) && ((localIInterface instanceof ckp))) {
        paramIBinder = (ckp)localIInterface;
      } else {
        paramIBinder = new ckr(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = null;
    boolean bool;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null) {
      paramParcel2 = null;
    }
    for (;;)
    {
      if (paramParcel1.readInt() != 0)
      {
        localObject = LogEventParcelable.CREATOR;
        localObject = bvn.a(paramParcel1);
      }
      a(paramParcel2, (LogEventParcelable)localObject);
      bool = true;
      break;
      paramParcel2 = localIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
      if ((paramParcel2 != null) && ((paramParcel2 instanceof ckm))) {
        paramParcel2 = (ckm)paramParcel2;
      } else {
        paramParcel2 = new cko(localIBinder);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ckq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */