import android.content.Context;
import android.os.Handler;

final class bdz
  extends bey
{
  bdz(bdu parambdu, bdn parambdn1, long paramLong, Context paramContext, bdn parambdn2)
  {
    super(parambdu, parambdn1);
  }
  
  public final void a()
  {
    bdu localbdu = this.e;
    long l = this.a;
    Context localContext = this.c;
    bea localbea = new bea(localbdu, "scanNetworks", l, this.d);
    localbdu.a.postDelayed(localbea, blf.U(localContext));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */