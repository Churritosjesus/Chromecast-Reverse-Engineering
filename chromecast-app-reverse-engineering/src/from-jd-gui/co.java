import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public abstract class co
  extends Binder
  implements cn
{
  public co()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }
  
  public static cn a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
      if ((localIInterface != null) && ((localIInterface instanceof cn))) {
        paramIBinder = (cn)localIInterface;
      } else {
        paramIBinder = new cp(paramIBinder);
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
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
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      str = paramParcel1.readString();
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(str, paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      a();
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = str;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (dq)dq.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = (Parcel)localObject2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (ci)ci.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      a(paramParcel1.createTypedArrayList(di.CREATOR));
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = (Parcel)localObject3;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = (Parcel)localObject4;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      paramParcel2 = (Parcel)localObject5;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (do)do.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool = true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */