import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.Surface;

public abstract class cjx
  extends Binder
  implements cjw
{
  public static cjw a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      if ((localIInterface != null) && ((localIInterface instanceof cjw))) {
        paramIBinder = (cjw)localIInterface;
      } else {
        paramIBinder = new cjy(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    cjt localcjt1 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      paramParcel2.writeString("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      cjt localcjt2 = cju.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      Object localObject = paramParcel1.readString();
      paramParcel2 = localcjt1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (Surface)Surface.CREATOR.createFromParcel(paramParcel1);
      }
      a(localcjt2, bool1, (String)localObject, paramParcel2, paramParcel1.readInt());
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      a();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      b();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      localcjt1 = cju.a(paramParcel1.readStrongBinder());
      localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        paramParcel2 = null;
        label253:
        localObject = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label338;
        }
      }
      label338:
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(localcjt1, paramParcel2, (String)localObject, paramParcel1);
        bool1 = bool2;
        break;
        paramParcel2 = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringSessionCallbacks");
        if ((paramParcel2 != null) && ((paramParcel2 instanceof cjz)))
        {
          paramParcel2 = (cjz)paramParcel2;
          break label253;
        }
        paramParcel2 = new ckb((IBinder)localObject);
        break label253;
      }
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      a(cju.a(paramParcel1.readStrongBinder()));
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      b(cju.a(paramParcel1.readStrongBinder()));
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      bool1 = bool3;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      a(bool1, paramParcel1.readString());
      bool1 = bool2;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */