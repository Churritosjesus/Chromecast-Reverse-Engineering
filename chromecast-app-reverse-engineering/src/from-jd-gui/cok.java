import android.os.IInterface;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract interface cok
  extends IInterface
{
  public abstract void a(LocationAvailability paramLocationAvailability);
  
  public abstract void a(LocationResult paramLocationResult);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */