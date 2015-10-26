import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public abstract class cnv
  extends Binder
  implements cnu
{
  public static cnu a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      paramIBinder = null;
    }
    for (;;)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if ((localIInterface != null) && ((localIInterface instanceof cnu))) {
        paramIBinder = (cnu)localIInterface;
      } else {
        paramIBinder = new cnw(paramIBinder);
      }
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    IBinder localIBinder = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject1 = null;
    Object localObject2 = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 57: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 64: 
    case 60: 
    case 61: 
    case 7: 
    case 8: 
    case 20: 
    case 9: 
    case 52: 
    case 53: 
    case 10: 
    case 11: 
    case 59: 
    case 12: 
    case 13: 
    case 21: 
    case 26: 
    case 34: 
    case 51: 
      for (;;)
      {
        return bool1;
        paramParcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        localObject2 = paramParcel1.createTypedArrayList(ParcelableGeofence.CREATOR);
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          a((List)localObject2, (PendingIntent)localObject1, cns.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool2;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0)
        {
          localObject1 = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(paramParcel1);
          label378:
          if (paramParcel1.readInt() == 0) {
            break label431;
          }
        }
        label431:
        for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          a((GeofencingRequest)localObject1, (PendingIntent)localObject2, cns.a(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          bool1 = bool2;
          break;
          localObject1 = null;
          break label378;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          a((PendingIntent)localObject1, cns.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
          paramParcel2.writeNoException();
          bool1 = bool2;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a(paramParcel1.createStringArray(), cns.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a(cns.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        bool1 = bool2;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        long l = paramParcel1.readLong();
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(l, bool1, paramParcel1);
          paramParcel2.writeNoException();
          bool1 = bool2;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel1);
          paramParcel2.writeNoException();
          bool1 = bool2;
          break;
        }
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        paramParcel1 = a(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          bool1 = bool2;
        }
        else
        {
          paramParcel2.writeInt(0);
          bool1 = bool2;
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramParcel1.readInt() != 0)
          {
            localObject1 = GestureRequest.CREATOR;
            localObject1 = coj.a(paramParcel1);
            label757:
            if (paramParcel1.readInt() == 0) {
              break label817;
            }
          }
          label817:
          for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            paramParcel1 = a((GestureRequest)localObject1, paramParcel1);
            paramParcel2.writeNoException();
            if (paramParcel1 == null) {
              break label822;
            }
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
            bool1 = bool2;
            break;
            localObject1 = null;
            break label757;
          }
          label822:
          paramParcel2.writeInt(0);
          bool1 = bool2;
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramParcel1.readInt() != 0) {}
          for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
          {
            paramParcel1 = b(paramParcel1);
            paramParcel2.writeNoException();
            if (paramParcel1 == null) {
              break label897;
            }
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
            bool1 = bool2;
            break;
          }
          label897:
          paramParcel2.writeInt(0);
          bool1 = bool2;
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          paramParcel1 = a();
          paramParcel2.writeNoException();
          if (paramParcel1 != null)
          {
            paramParcel2.writeInt(1);
            paramParcel1.writeToParcel(paramParcel2, 1);
            bool1 = bool2;
          }
          else
          {
            paramParcel2.writeInt(0);
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject1 = localObject2;
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequest.CREATOR;
              localObject1 = cng.a(paramParcel1);
            }
            a((LocationRequest)localObject1, coo.a(paramParcel1.readStrongBinder()));
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject1 = localIBinder;
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequest.CREATOR;
              localObject1 = cng.a(paramParcel1);
            }
            a((LocationRequest)localObject1, coo.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequest.CREATOR;
              localObject1 = cng.a(paramParcel1);
              label1090:
              if (paramParcel1.readInt() == 0) {
                break label1134;
              }
            }
            label1134:
            for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
            {
              a((LocationRequest)localObject1, paramParcel1);
              paramParcel2.writeNoException();
              bool1 = bool2;
              break;
              localObject1 = null;
              break label1090;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject1 = localObject3;
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequestInternal.CREATOR;
              localObject1 = coe.a(paramParcel1);
            }
            a((LocationRequestInternal)localObject1, coo.a(paramParcel1.readStrongBinder()));
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequestInternal.CREATOR;
              localObject1 = coe.a(paramParcel1);
              label1215:
              if (paramParcel1.readInt() == 0) {
                break label1259;
              }
            }
            label1259:
            for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
            {
              a((LocationRequestInternal)localObject1, paramParcel1);
              paramParcel2.writeNoException();
              bool1 = bool2;
              break;
              localObject1 = null;
              break label1215;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            a(coo.a(paramParcel1.readStrongBinder()));
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramParcel1.readInt() != 0) {}
            for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
            {
              c(paramParcel1);
              paramParcel2.writeNoException();
              bool1 = bool2;
              break;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localObject1 = localObject4;
            if (paramParcel1.readInt() != 0)
            {
              localObject1 = LocationRequestUpdateData.CREATOR;
              localObject1 = cof.a(paramParcel1);
            }
            a((LocationRequestUpdateData)localObject1);
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            bool1 = bool3;
            if (paramParcel1.readInt() != 0) {
              bool1 = true;
            }
            a(bool1);
            paramParcel2.writeNoException();
            bool1 = bool2;
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramParcel1.readInt() != 0) {}
            for (paramParcel1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
            {
              a(paramParcel1);
              paramParcel2.writeNoException();
              bool1 = bool2;
              break;
            }
            paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            paramParcel1 = b(paramParcel1.readString());
            paramParcel2.writeNoException();
            if (paramParcel1 != null)
            {
              paramParcel2.writeInt(1);
              paramParcel1.writeToParcel(paramParcel2, 1);
              bool1 = bool2;
            }
            else
            {
              paramParcel2.writeInt(0);
              bool1 = bool2;
              continue;
              paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
              if (paramParcel1.readInt() != 0) {}
              for (localObject1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
              {
                a((Location)localObject1, paramParcel1.readInt());
                paramParcel2.writeNoException();
                bool1 = bool2;
                break;
              }
              paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
              paramParcel1 = c(paramParcel1.readString());
              paramParcel2.writeNoException();
              if (paramParcel1 != null)
              {
                paramParcel2.writeInt(1);
                paramParcel1.writeToParcel(paramParcel2, 1);
                bool1 = bool2;
              }
              else
              {
                paramParcel2.writeInt(0);
                bool1 = bool2;
                continue;
                paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                paramParcel1 = b();
                paramParcel2.writeNoException();
                paramParcel2.writeStrongBinder(paramParcel1);
                bool1 = bool2;
              }
            }
          }
        }
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    if (paramParcel1.readInt() != 0)
    {
      localObject2 = (LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(paramParcel1);
      label1682:
      localIBinder = paramParcel1.readStrongBinder();
      if (localIBinder != null) {
        break label1722;
      }
    }
    for (;;)
    {
      a((LocationSettingsRequest)localObject2, (cnx)localObject1, paramParcel1.readString());
      paramParcel2.writeNoException();
      bool1 = bool2;
      break;
      localObject2 = null;
      break label1682;
      label1722:
      localObject1 = localIBinder.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
      if ((localObject1 != null) && ((localObject1 instanceof cnx))) {
        localObject1 = (cnx)localObject1;
      } else {
        localObject1 = new cnz(localIBinder);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */