import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

final class bqi
  implements bqg
{
  private IBinder a;
  
  bqi(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
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
  
  public final void a(Map paramMap, long paramLong, String paramString, List paramList)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      localParcel2.writeMap(paramMap);
      localParcel2.writeLong(paramLong);
      localParcel2.writeString(paramString);
      localParcel2.writeTypedList(paramList);
      this.a.transact(1, localParcel2, localParcel1, 0);
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
  
  public final String b()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
      this.a.transact(3, localParcel2, localParcel1, 0);
      localParcel1.readException();
      String str = localParcel1.readString();
      return str;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */