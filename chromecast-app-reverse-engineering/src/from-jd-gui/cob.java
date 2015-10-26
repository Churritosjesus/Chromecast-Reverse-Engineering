import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class cob
  extends col
{
  private void a(int paramInt, Object paramObject)
  {
    Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
  }
  
  public final void a(LocationAvailability paramLocationAvailability)
  {
    a(1, paramLocationAvailability);
  }
  
  public final void a(LocationResult paramLocationResult)
  {
    a(0, paramLocationResult);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */