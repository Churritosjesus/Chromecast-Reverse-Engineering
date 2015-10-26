import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;

final class bts
  implements buw
{
  GoogleApiClient a;
  private long c = 0L;
  
  public bts(btl parambtl) {}
  
  public final long a()
  {
    long l = this.c + 1L;
    this.c = l;
    return l;
  }
  
  public final void a(String paramString1, String paramString2, long paramLong)
  {
    if (this.a == null) {
      throw new IOException("No GoogleApiClient available");
    }
    bsr.b.a(this.a, paramString1, paramString2).a(new btt(this, paramLong));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */