import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

final class csb
  implements cpu
{
  private final Status a;
  private final ParcelFileDescriptor b;
  private final int c;
  private final int d;
  
  public csb(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramStatus;
    this.b = paramParcelFileDescriptor;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public final void a()
  {
    ParcelFileDescriptor localParcelFileDescriptor;
    if (this.b != null)
    {
      localParcelFileDescriptor = this.b;
      if (localParcelFileDescriptor == null) {}
    }
    try
    {
      localParcelFileDescriptor.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final Status b()
  {
    return this.a;
  }
  
  public final ParcelFileDescriptor c()
  {
    return this.b;
  }
  
  public final int d()
  {
    return this.c;
  }
  
  public final int e()
  {
    return this.d;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */