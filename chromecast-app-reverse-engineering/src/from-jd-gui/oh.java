import android.app.Dialog;
import android.os.Bundle;

public final class oh
  extends i
{
  private tx Z;
  
  public oh()
  {
    b(true);
  }
  
  private void p()
  {
    if (this.Z == null)
    {
      Bundle localBundle = this.m;
      if (localBundle != null) {
        this.Z = tx.a(localBundle.getBundle("selector"));
      }
      if (this.Z == null) {
        this.Z = tx.c;
      }
    }
  }
  
  public final void a(tx paramtx)
  {
    if (paramtx == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    p();
    if (!this.Z.equals(paramtx))
    {
      this.Z = paramtx;
      Bundle localBundle = this.m;
      Object localObject = localBundle;
      if (localBundle == null) {
        localObject = new Bundle();
      }
      ((Bundle)localObject).putBundle("selector", paramtx.a);
      f((Bundle)localObject);
      localObject = (od)this.d;
      if (localObject != null) {
        ((od)localObject).a(paramtx);
      }
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    paramBundle = new od(this.y);
    p();
    paramBundle.a(this.Z);
    return paramBundle;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */