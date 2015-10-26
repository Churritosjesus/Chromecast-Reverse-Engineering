import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.ErrorReport;

final class clb
  implements ckz
{
  private IBinder a;
  
  clb(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
      localParcel2.writeInt(paramInt1);
      localParcel2.writeInt(paramInt2);
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
  
  public final boolean a(ErrorReport paramErrorReport)
  {
    boolean bool = true;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (paramErrorReport != null)
        {
          localParcel2.writeInt(1);
          paramErrorReport.writeToParcel(localParcel2, 0);
          this.a.transact(1, localParcel2, localParcel1, 0);
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i != 0) {
            return bool;
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        bool = false;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  public final boolean b(ErrorReport paramErrorReport)
  {
    boolean bool = true;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.gms.feedback.internal.IFeedbackService");
        if (paramErrorReport != null)
        {
          localParcel2.writeInt(1);
          paramErrorReport.writeToParcel(localParcel2, 0);
          this.a.transact(3, localParcel2, localParcel1, 0);
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i != 0) {
            return bool;
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        bool = false;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\clb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */