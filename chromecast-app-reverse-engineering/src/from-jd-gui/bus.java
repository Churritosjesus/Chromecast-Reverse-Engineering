import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

public abstract class bus
  extends Binder
  implements bur
{
  public bus()
  {
    attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str2 = null;
    Object localObject = null;
    String str1 = null;
    boolean bool2 = true;
    boolean bool1;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      paramParcel2.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = str1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(paramParcel1);
      }
      str2 = paramParcel1.readString();
      str1 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (bool1 = true;; bool1 = false)
      {
        a(paramParcel2, str2, str1, bool1);
        bool1 = bool2;
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      b(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      paramParcel1.readDouble();
      paramParcel1.readInt();
      b();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.readString());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      a(paramParcel1.readString(), paramParcel1.createByteArray());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      d(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      c(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      e(paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      a(paramParcel1.readLong(), paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel1.readString();
      a(paramParcel1.readLong());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = str2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
      paramParcel2 = (Parcel)localObject;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      bool1 = bool2;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */