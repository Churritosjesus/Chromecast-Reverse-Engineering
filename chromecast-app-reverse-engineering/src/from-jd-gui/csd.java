import android.os.Bundle;

final class csd
  extends crp
{
  private final bwq a;
  
  public csd(bwq parambwq)
  {
    this.a = parambwq;
  }
  
  public final void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (a.b(3))
    {
      new StringBuilder("Bundle callback: status=").append(paramInt).append("\nresolution=").append(paramBundle1).append("\nbundle=").append(paramBundle2).toString();
      a.b(3);
    }
    paramBundle1 = csa.a(paramInt, null, paramBundle1);
    this.a.a(new cse(paramBundle1));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */