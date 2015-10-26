import android.app.PendingIntent;
import android.os.IInterface;

public abstract interface cnr
  extends IInterface
{
  public abstract void a(int paramInt, PendingIntent paramPendingIntent);
  
  public abstract void a(int paramInt, String[] paramArrayOfString);
  
  public abstract void b(int paramInt, String[] paramArrayOfString);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cnr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */