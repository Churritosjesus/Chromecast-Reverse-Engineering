import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;

public abstract class cla
  extends Binder
  implements ckz
{
  public static ckz a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      if ((localIInterface != null) && ((localIInterface instanceof ckz))) {
        paramIBinder = (ckz)localIInterface;
      } else {
        paramIBinder = new clb(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    int i = 0;
    boolean bool1 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      paramParcel2.writeString("com.google.android.gms.feedback.internal.IFeedbackService");
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ErrorReport)ErrorReport.CREATOR.createFromParcel(paramParcel1);
      }
      boolean bool2 = a((ErrorReport)localObject1);
      paramParcel2.writeNoException();
      if (bool2) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      a(paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.feedback.internal.IFeedbackService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ErrorReport)ErrorReport.CREATOR.createFromParcel(paramParcel1);
      }
      bool2 = b((ErrorReport)localObject1);
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool2) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */