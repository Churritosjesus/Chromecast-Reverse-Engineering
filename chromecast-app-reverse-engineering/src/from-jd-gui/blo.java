import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.List;

final class blo
  extends AsyncTask
{
  private final Context a;
  private final bln b;
  
  public blo(Context paramContext, bln parambln)
  {
    this.a = paramContext;
    this.b = parambln;
  }
  
  private String a(Location... paramVarArgs)
  {
    Geocoder localGeocoder = new Geocoder(this.a);
    paramVarArgs = paramVarArgs[0];
    try
    {
      paramVarArgs = localGeocoder.getFromLocation(paramVarArgs.getLatitude(), paramVarArgs.getLongitude(), 1);
      if ((paramVarArgs == null) || (paramVarArgs.isEmpty())) {
        break label73;
      }
      paramVarArgs = ((Address)paramVarArgs.get(0)).getCountryCode();
    }
    catch (IOException paramVarArgs)
    {
      for (;;)
      {
        blj.f().a(paramVarArgs, "Failed to lookup address through geocoder", new Object[0]);
        paramVarArgs = null;
      }
    }
    catch (IllegalArgumentException paramVarArgs)
    {
      for (;;)
      {
        blj.f().a(paramVarArgs, "Could not look up address - bad lat/long", new Object[0]);
      }
    }
    return paramVarArgs;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\blo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */