import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

public abstract class crs
  extends Binder
  implements crr
{
  public crs()
  {
    attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
  }
  
  public static crr a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof crr))) {
        paramIBinder = (crr)localIInterface;
      } else {
        paramIBinder = new crt(paramIBinder);
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
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
      for (;;)
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          label121:
          if (paramParcel1.readInt() == 0) {
            break label159;
          }
        }
        label159:
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramInt1, paramParcel2, paramParcel1);
          bool = true;
          break;
          paramParcel2 = null;
          break label121;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel2 = null)
        {
          if (paramParcel1.readInt() != 0)
          {
            localObject1 = DataHolder.CREATOR;
            localObject1 = byb.a(paramParcel1);
          }
          a(paramInt1, paramParcel2, (DataHolder)localObject1);
          bool = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          label263:
          if (paramParcel1.readInt() == 0) {
            break label301;
          }
        }
        label301:
        for (paramParcel1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramInt1, paramParcel2, paramParcel1);
          bool = true;
          break;
          paramParcel2 = null;
          break label263;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
        paramInt1 = paramParcel1.readInt();
        paramParcel2 = (Parcel)localObject2;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramInt1, paramParcel2, (DataHolder[])paramParcel1.createTypedArray(DataHolder.CREATOR));
        bool = true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0)
    {
      paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label393:
      if (paramParcel1.readInt() == 0) {
        break label454;
      }
      localObject1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);
      label414:
      if (paramParcel1.readInt() == 0) {
        break label460;
      }
    }
    label454:
    label460:
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      a(paramInt1, paramParcel2, (ParcelFileDescriptor)localObject1, paramParcel1);
      bool = true;
      break;
      paramParcel2 = null;
      break label393;
      localObject1 = null;
      break label414;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */