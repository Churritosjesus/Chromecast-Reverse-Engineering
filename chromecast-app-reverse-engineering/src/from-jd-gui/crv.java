import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public abstract class crv
  extends Binder
  implements cru
{
  public static cru a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
      if ((localIInterface != null) && ((localIInterface instanceof cru))) {
        paramIBinder = (cru)localIInterface;
      } else {
        paramIBinder = new crw(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1;
    Object localObject1;
    label527:
    boolean bool2;
    label571:
    label602:
    label650:
    Object localObject4;
    Object localObject5;
    Object localObject3;
    long l;
    label1062:
    label1098:
    label1404:
    int i;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 2: 
    case 305: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 603: 
    case 8: 
    case 9: 
    case 201: 
    case 202: 
    case 203: 
    case 402: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 401: 
    case 404: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 403: 
    case 26: 
    case 205: 
    case 101: 
    case 102: 
    case 27: 
    case 701: 
    case 28: 
    case 29: 
    case 204: 
    case 301: 
    case 302: 
    case 303: 
      for (;;)
      {
        return bool1;
        paramParcel2.writeString("com.google.android.gms.people.internal.IPeopleService");
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label571;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((crr)localObject1, bool1, bool2, paramParcel1.readString(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
          bool1 = false;
          break label527;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label650;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((crr)localObject1, bool1, bool2, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
          bool1 = false;
          break label602;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        localObject5 = paramParcel1.readString();
        localObject3 = paramParcel1.createStringArrayList();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject1, (String)localObject2, (String)localObject4, (String)localObject5, (List)localObject3, paramInt1, bool1, paramParcel1.readLong());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        l = paramParcel1.readLong();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject1, l, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject1, (String)localObject4, (String)localObject3, (String)localObject2, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject4 = crs.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          b((crr)localObject4, (String)localObject2, (String)localObject3, (String)localObject1, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        if (paramParcel1.readInt() != 0)
        {
          paramParcel1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = a(paramParcel1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label1098;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          paramParcel1 = null;
          break label1062;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject3 = crs.a(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject3, (String)localObject4, (String)localObject1, (String)localObject2, bool1, paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject3 = crs.a(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject3, (String)localObject4, (String)localObject2, (String)localObject1, bool1, paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject3 = crs.a(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject3, (String)localObject4, (String)localObject1, (String)localObject2, paramInt1, bool1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject2 = crs.a(paramParcel1.readStrongBinder());
        localObject5 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          paramInt1 = paramParcel1.readInt();
          i = paramParcel1.readInt();
          localObject3 = paramParcel1.readString();
          if (paramParcel1.readInt() == 0) {
            break label1470;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((crr)localObject2, (String)localObject5, (String)localObject1, (String)localObject4, paramInt2, bool1, paramInt1, i, (String)localObject3, bool2);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
          bool1 = false;
          break label1404;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject4 = crs.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject5 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          paramInt1 = paramParcel1.readInt();
          i = paramParcel1.readInt();
          localObject1 = paramParcel1.readString();
          if (paramParcel1.readInt() == 0) {
            break label1599;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((crr)localObject4, (String)localObject2, (String)localObject5, (String)localObject3, paramInt2, bool1, paramInt1, i, (String)localObject1, bool2, paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
          bool1 = false;
          break label1525;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject2 = crs.a(paramParcel1.readStrongBinder());
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject2, (String)localObject1, bool1, paramParcel1.createStringArray());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          paramParcel1 = a((crr)localObject1, bool1, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label1743;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          bool1 = false;
          break label1691;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a((crr)localObject1, (String)localObject3, (String)localObject2, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a(bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        bool1 = a();
        paramParcel2.writeNoException();
        if (bool1) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        paramParcel1 = b(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject4 = crs.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
        {
          localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label2140;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject4, (String)localObject2, (String)localObject3, (Uri)localObject1, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
          localObject1 = null;
          break label2100;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject5 = crs.a(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        localObject1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject5, (String)localObject3, (String)localObject2, (String)localObject4, paramInt1, (String)localObject1, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        paramParcel1 = a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject5 = crs.a(paramParcel1.readStrongBinder());
        localObject1 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        localObject4 = paramParcel1.createStringArrayList();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject5, (String)localObject1, (String)localObject2, (String)localObject3, (List)localObject4, paramInt1, bool1, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject5 = crs.a(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        localObject4 = paramParcel1.createStringArrayList();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject5, (String)localObject3, (String)localObject1, (String)localObject2, (List)localObject4, paramInt1, bool1, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject5 = crs.a(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        localObject1 = paramParcel1.createStringArrayList();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject5, (String)localObject2, (String)localObject3, (String)localObject4, (List)localObject1, paramInt1, bool1, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject4 = crs.a(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        String str = paramParcel1.readString();
        localObject1 = paramParcel1.createStringArrayList();
        localObject5 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() != 0) {
          bzu localbzu = FavaDiagnosticsEntity.CREATOR;
        }
        for (paramParcel1 = bzu.a(paramParcel1);; paramParcel1 = null)
        {
          a((crr)localObject4, (String)localObject3, (String)localObject2, str, (List)localObject1, (List)localObject5, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        l = paramParcel1.readLong();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          paramParcel1 = a((String)localObject2, (String)localObject1, l, bool1);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label2922;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          bool1 = false;
          break label2878;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        l = paramParcel1.readLong();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label3020;
          }
          bool2 = true;
          paramParcel1 = a((String)localObject2, (String)localObject1, l, bool1, bool2);
          paramParcel2.writeNoException();
          if (paramParcel1 == null) {
            break label3026;
          }
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool1 = true;
          break;
          bool1 = false;
          break label2964;
          bool2 = false;
          break label2974;
          paramParcel2.writeInt(0);
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        c(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject2 = crs.a(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject5 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((crr)localObject2, (String)localObject3, (String)localObject5, (String)localObject1, (String)localObject4, bool1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArrayList());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        bool1 = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        localObject1 = crs.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a((crr)localObject1, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = true;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
        a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = true;
      }
    case 304: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject1 = crs.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        b((crr)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        bool1 = true;
        break;
      }
    case 501: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject2 = crs.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = AccountToken.CREATOR;
        localObject1 = cri.a(paramParcel1);
        localObject3 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() == 0) {
          break label3640;
        }
        localObject4 = ParcelableGetOptions.CREATOR;
      }
      for (paramParcel1 = crn.a(paramParcel1);; paramParcel1 = null)
      {
        a((crr)localObject2, (AccountToken)localObject1, (List)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        bool1 = true;
        break;
        localObject1 = null;
        break label3590;
      }
    case 502: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      paramParcel1 = b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
      }
    case 503: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject1 = crs.a(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        paramParcel1 = b((crr)localObject1, l, bool1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label3780;
        }
      }
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
        bool1 = false;
        break label3737;
      }
    case 504: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      paramParcel1 = b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
      }
    case 505: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      paramParcel1 = b(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
      }
    case 506: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      paramParcel1 = c(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
      }
    case 507: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject4 = crs.a(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      localObject5 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        paramInt2 = paramParcel1.readInt();
        i = paramParcel1.readInt();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() == 0) {
          break label4096;
        }
        bool2 = true;
        paramParcel1 = a((crr)localObject4, (String)localObject1, (String)localObject5, bool1, (String)localObject2, (String)localObject3, paramInt2, i, paramInt1, bool2);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label4102;
        }
      }
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
        bool1 = false;
        break label4001;
        bool2 = false;
        break label4040;
      }
    case 508: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject2 = crs.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = AvatarReference.CREATOR;
        localObject1 = css.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label4199;
        }
        localObject3 = ParcelableLoadImageOptions.CREATOR;
        paramParcel1 = cry.a(paramParcel1);
        paramParcel1 = a((crr)localObject2, (AvatarReference)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label4204;
        }
      }
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
        localObject1 = null;
        break label4140;
        paramParcel1 = null;
        break label4157;
      }
    case 509: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      paramParcel1 = a(crs.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
      }
    case 601: 
      label1470:
      label1525:
      label1599:
      label1691:
      label1743:
      label2100:
      label2140:
      label2878:
      label2922:
      label2964:
      label2974:
      label3020:
      label3026:
      label3590:
      label3640:
      label3737:
      label3780:
      label4001:
      label4040:
      label4096:
      label4102:
      label4140:
      label4157:
      label4199:
      label4204:
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      localObject2 = crs.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = AccountToken.CREATOR;
        localObject1 = cri.a(paramParcel1);
        label4299:
        if (paramParcel1.readInt() == 0) {
          break label4358;
        }
        localObject3 = ParcelableListOptions.CREATOR;
        paramParcel1 = cro.a(paramParcel1);
        label4316:
        paramParcel1 = a((crr)localObject2, (AccountToken)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break label4363;
        }
      }
      label4358:
      label4363:
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        bool1 = true;
        break;
        localObject1 = null;
        break label4299;
        paramParcel1 = null;
        break label4316;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
    Object localObject2 = crs.a(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0)
    {
      localObject1 = DataHolder.CREATOR;
      localObject1 = byb.a(paramParcel1);
      label4401:
      paramParcel1 = a((crr)localObject2, (DataHolder)localObject1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      if (paramParcel1 == null) {
        break label4454;
      }
    }
    label4454:
    for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
    {
      paramParcel2.writeStrongBinder(paramParcel1);
      bool1 = true;
      break;
      localObject1 = null;
      break label4401;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\crv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */