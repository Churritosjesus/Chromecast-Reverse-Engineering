import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

public abstract interface cnu
  extends IInterface
{
  public abstract Location a();
  
  public abstract Status a(GestureRequest paramGestureRequest, PendingIntent paramPendingIntent);
  
  public abstract ActivityRecognitionResult a(String paramString);
  
  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent);
  
  public abstract void a(PendingIntent paramPendingIntent, cnr paramcnr, String paramString);
  
  public abstract void a(Location paramLocation);
  
  public abstract void a(Location paramLocation, int paramInt);
  
  public abstract void a(cnr paramcnr, String paramString);
  
  public abstract void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, cnr paramcnr);
  
  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequest paramLocationRequest, con paramcon);
  
  public abstract void a(LocationRequest paramLocationRequest, con paramcon, String paramString);
  
  public abstract void a(LocationSettingsRequest paramLocationSettingsRequest, cnx paramcnx, String paramString);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, PendingIntent paramPendingIntent);
  
  public abstract void a(LocationRequestInternal paramLocationRequestInternal, con paramcon);
  
  public abstract void a(LocationRequestUpdateData paramLocationRequestUpdateData);
  
  public abstract void a(con paramcon);
  
  public abstract void a(List paramList, PendingIntent paramPendingIntent, cnr paramcnr, String paramString);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract void a(String[] paramArrayOfString, cnr paramcnr, String paramString);
  
  public abstract Location b(String paramString);
  
  public abstract IBinder b();
  
  public abstract Status b(PendingIntent paramPendingIntent);
  
  public abstract LocationAvailability c(String paramString);
  
  public abstract void c(PendingIntent paramPendingIntent);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */