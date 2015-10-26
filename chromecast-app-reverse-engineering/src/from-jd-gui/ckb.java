import android.os.IBinder;
import android.os.Parcel;

final class ckb
  implements cjz
{
  private IBinder a;
  
  ckb(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
      localParcel.writeInt(paramInt);
      this.a.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ckb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */