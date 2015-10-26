import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class byl
{
  public final Account a;
  public final Set b;
  final Set c;
  public final Map d;
  public final String e;
  public final String f;
  public final clt g;
  public Integer h;
  
  public byl(Account paramAccount, Collection paramCollection, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, clt paramclt)
  {
    this.a = paramAccount;
    if (paramCollection == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(new HashSet(paramCollection)))
    {
      this.b = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      this.d = paramAccount;
      this.e = paramString1;
      this.f = paramString2;
      this.g = paramclt;
      paramAccount = new HashSet(this.b);
      paramCollection = this.d.values().iterator();
      while (paramCollection.hasNext())
      {
        paramCollection.next();
        paramAccount.addAll(null);
      }
    }
    this.c = Collections.unmodifiableSet(paramAccount);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */