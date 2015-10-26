import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;

final class cki
  extends ckh
{
  private final LogEventParcelable a;
  
  cki(ckc paramckc, LogEventParcelable paramLogEventParcelable, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    this.a = paramLogEventParcelable;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof cki)) {}
    for (boolean bool = false;; bool = this.a.equals(((cki)paramObject).a))
    {
      return bool;
      paramObject = (cki)paramObject;
    }
  }
  
  public final String toString()
  {
    return "MethodImpl(" + this.a + ")";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */