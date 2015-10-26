import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class cka
  extends Binder
  implements cjz
{
  public cka()
  {
    attachInterface(this, "com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
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
      paramParcel2.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
      a(paramParcel1.readInt());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */