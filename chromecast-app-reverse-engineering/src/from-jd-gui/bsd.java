import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class bsd
  extends bra
{
  bsd(brb parambrb)
  {
    super(parambrb);
  }
  
  protected final void a() {}
  
  public final cpg b()
  {
    r();
    DisplayMetrics localDisplayMetrics = this.d.b().a.getResources().getDisplayMetrics();
    cpg localcpg = new cpg();
    localcpg.a = bqs.a(Locale.getDefault());
    localcpg.c = localDisplayMetrics.widthPixels;
    localcpg.d = localDisplayMetrics.heightPixels;
    return localcpg;
  }
  
  public final String c()
  {
    r();
    cpg localcpg = b();
    return localcpg.c + "x" + localcpg.d;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */