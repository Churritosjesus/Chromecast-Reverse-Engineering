import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;

final class atn
  extends AsyncTask
{
  atn(atf paramatf) {}
  
  private Void a()
  {
    atf localatf = this.a;
    for (;;)
    {
      atb localatb;
      synchronized (localatf.k)
      {
        if (localatf.k.isEmpty()) {
          return null;
        }
        localatb = (atb)localatf.k.get(0);
        String str1 = localatf.b.getString("current_account_name", null);
        ??? = str1;
        if (TextUtils.isEmpty(str1)) {
          ??? = bls.b(localatf.a);
        }
        if (TextUtils.isEmpty((CharSequence)???))
        {
          localatb.b(new adf("no account"));
          synchronized (localatf.k)
          {
            localatf.k.remove(localatb);
          }
        }
      }
      try
      {
        SystemClock.elapsedRealtime();
        str2 = localatf.a(localatf.a, (String)???, localatb.g());
        if (str2 != null)
        {
          SystemClock.elapsedRealtime();
          localatb.l = str2;
          ??? = new ato;
          ((ato)???).<init>(localatf, str2);
          localatb.m = ((adz)???);
          localatf.l.a(localatb);
        }
      }
      catch (bsm localbsm)
      {
        String str2 = String.valueOf(localbsm);
        new StringBuilder(String.valueOf(str2).length() + 28).append("Could not get token (auth): ").append(str2);
        localatb.b(new adf("no token", localbsm));
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */