import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.KeyEvent;

public abstract class cr
  extends Binder
  implements cq
{
  public static cq a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      if ((localIInterface != null) && ((localIInterface instanceof cq))) {
        paramIBinder = (cq)localIInterface;
      } else {
        paramIBinder = new cs(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
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
      paramParcel2.writeString("android.support.v4.media.session.IMediaSession");
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      String str = paramParcel1.readString();
      Object localObject;
      if (paramParcel1.readInt() != 0)
      {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        label328:
        if (paramParcel1.readInt() == 0) {
          break label370;
        }
      }
      label370:
      for (paramParcel1 = (dk)dk.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(str, (Bundle)localObject, paramParcel1);
        paramParcel2.writeNoException();
        break;
        localObject = null;
        break label328;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
        label401:
        bool2 = a(paramParcel1);
        paramParcel2.writeNoException();
        if (!bool2) {
          break label432;
        }
      }
      label432:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        break;
        paramParcel1 = null;
        break label401;
      }
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      a(co.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      b(co.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      boolean bool2 = a();
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool2) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
      paramParcel1 = d();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        long l = e();
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        paramParcel1 = f();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          a(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          g();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          localObject = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {}
          for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            a((String)localObject, paramParcel1);
            paramParcel2.writeNoException();
            break;
          }
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          localObject = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {}
          for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            b((String)localObject, paramParcel1);
            paramParcel2.writeNoException();
            break;
          }
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          a(paramParcel1.readLong());
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          h();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          i();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          j();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          k();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          l();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          m();
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          b(paramParcel1.readLong());
          paramParcel2.writeNoException();
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          if (paramParcel1.readInt() != 0) {}
          for (paramParcel1 = (cl)cl.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            a(paramParcel1);
            paramParcel2.writeNoException();
            break;
          }
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          localObject = paramParcel1.readString();
          if (paramParcel1.readInt() != 0) {}
          for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            c((String)localObject, paramParcel1);
            paramParcel2.writeNoException();
            break;
          }
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          paramParcel1 = n();
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
            paramParcel1 = o();
            paramParcel2.writeNoException();
            if (paramParcel1 != null)
            {
              paramParcel2.writeInt(1);
              paramParcel1.writeToParcel(paramParcel2, 1);
            }
            else
            {
              paramParcel2.writeInt(0);
              continue;
              paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
              paramParcel1 = p();
              paramParcel2.writeNoException();
              paramParcel2.writeTypedList(paramParcel1);
              continue;
              paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
              paramParcel1 = q();
              paramParcel2.writeNoException();
              if (paramParcel1 != null)
              {
                paramParcel2.writeInt(1);
                TextUtils.writeToParcel(paramParcel1, paramParcel2, 1);
              }
              else
              {
                paramParcel2.writeInt(0);
                continue;
                paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                paramParcel1 = r();
                paramParcel2.writeNoException();
                if (paramParcel1 != null)
                {
                  paramParcel2.writeInt(1);
                  paramParcel1.writeToParcel(paramParcel2, 1);
                }
                else
                {
                  paramParcel2.writeInt(0);
                  continue;
                  paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                  paramInt1 = s();
                  paramParcel2.writeNoException();
                  paramParcel2.writeInt(paramInt1);
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */