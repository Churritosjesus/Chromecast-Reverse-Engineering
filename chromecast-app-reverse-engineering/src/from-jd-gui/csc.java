import android.os.Bundle;
import android.util.Log;

final class csc
  extends crp
{
  public final void a(int paramInt, Bundle paramBundle1, Bundle paramBundle2)
  {
    if (a.b(3))
    {
      new StringBuilder("Bundle callback: status=").append(paramInt).append("\nresolution=").append(paramBundle1).append("\nbundle=").append(paramBundle2).toString();
      a.b(3);
    }
    if (paramInt != 0)
    {
      if (a.b(5)) {
        Log.w("PeopleClient", "Non-success data changed callback received.");
      }
      return;
    }
    new bxl(paramBundle2.getString("account"), paramBundle2.getString("pagegaiaid"), paramBundle2.getInt("scope"));
    throw new NullPointerException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\csc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */