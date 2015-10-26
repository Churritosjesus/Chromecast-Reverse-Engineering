import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

final class buf
  implements bst
{
  private final Status a;
  private final String b;
  
  public buf(Status paramStatus)
  {
    this(paramStatus, null, null, null, false);
  }
  
  public buf(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramStatus;
    this.b = paramString1;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final Status b()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\buf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */