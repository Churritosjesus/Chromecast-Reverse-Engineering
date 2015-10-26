import android.os.IBinder;
import android.os.Parcel;

final class byg
  implements bye
{
  private IBinder a;
  
  byg(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.common.internal.ICancelToken");
      this.a.transact(2, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */