import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class bxr
  extends bi
  implements bwg, bwh
{
  public final GoogleApiClient e;
  boolean f;
  private ConnectionResult g;
  
  public bxr(Context paramContext, GoogleApiClient paramGoogleApiClient)
  {
    super(paramContext);
    this.e = paramGoogleApiClient;
  }
  
  private void b(ConnectionResult paramConnectionResult)
  {
    this.g = paramConnectionResult;
    if ((this.c) && (!this.d)) {
      a(paramConnectionResult);
    }
  }
  
  public final void a(int paramInt) {}
  
  public final void a(Bundle paramBundle)
  {
    this.f = false;
    b(ConnectionResult.a);
  }
  
  public final void a(ConnectionResult paramConnectionResult)
  {
    this.f = true;
    b(paramConnectionResult);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.e.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  protected final void b()
  {
    super.b();
    this.e.a(this);
    this.e.a(this);
    if (this.g != null) {
      a(this.g);
    }
    if ((!this.e.d()) && (!this.e.e()) && (!this.f)) {
      this.e.b();
    }
  }
  
  protected final void d()
  {
    this.e.c();
  }
  
  protected final void f()
  {
    this.g = null;
    this.f = false;
    this.e.b(this);
    this.e.b(this);
    this.e.c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */