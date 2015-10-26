import android.os.Bundle;
import android.os.ParcelFileDescriptor;

final class csg
  extends crp
{
  private final bwq a;
  
  public csg(bwq parambwq)
  {
    this.a = parambwq;
  }
  
  public final void a(int paramInt, Bundle paramBundle1, ParcelFileDescriptor paramParcelFileDescriptor, Bundle paramBundle2)
  {
    int j = 0;
    if (a.b(3))
    {
      new StringBuilder("Avatar callback: status=").append(paramInt).append(" resolution=").append(paramBundle1).append(" pfd=").append(paramParcelFileDescriptor).toString();
      a.b(3);
    }
    paramBundle1 = csa.a(paramInt, null, paramBundle1);
    boolean bool;
    int i;
    if (paramBundle2 != null)
    {
      bool = paramBundle2.getBoolean("rewindable");
      i = paramBundle2.getInt("width");
    }
    for (paramInt = paramBundle2.getInt("height");; paramInt = j)
    {
      this.a.a(new csb(paramBundle1, paramParcelFileDescriptor, bool, i, paramInt));
      return;
      i = 0;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */