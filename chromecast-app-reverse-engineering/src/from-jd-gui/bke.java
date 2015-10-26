import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class bke
{
  public boolean a = false;
  public boolean b = false;
  public boolean c = false;
  public final ArrayList d = new ArrayList();
  dal[] e;
  public HashSet f;
  private final long g;
  private apj h;
  
  public bke()
  {
    String[] arrayOfString = TextUtils.split(PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).getString("IGNORED_ANNOUNCEMENT_CARDS", ""), ",");
    this.f = new HashSet();
    this.f.addAll(Arrays.asList(arrayOfString));
    this.h = new apj(SetupApplication.a());
    this.g = c();
  }
  
  private static long c()
  {
    long l1 = 0L;
    String[] arrayOfString = TextUtils.split(SetupApplication.a().e(), "\\.");
    if (arrayOfString.length < 2) {}
    for (;;)
    {
      return l1;
      try
      {
        long l2 = Long.valueOf(arrayOfString[0]).longValue();
        long l3 = Long.valueOf(arrayOfString[1]).longValue();
        l1 = l3 + l2 * 1000L;
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public void a()
  {
    if ((this.e != null) && (!this.d.isEmpty()))
    {
      dal localdal = b();
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext()) {
        ((bkf)localIterator.next()).a(localdal);
      }
    }
  }
  
  public final dal b()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (this.e == null) {}
    int i;
    do
    {
      return (dal)localObject2;
      i = 0;
      localObject2 = localObject1;
    } while (i >= this.e.length);
    localObject2 = this.e[i];
    Object localObject3 = ((dal)localObject2).c;
    int k = localObject3.length;
    int j = 0;
    label48:
    label65:
    boolean bool;
    if (j < k) {
      if (localObject3[j] == 0)
      {
        j = 1;
        if ((j == 0) || ((((dal)localObject2).l != null) && (this.g < ((dal)localObject2).l.longValue())) || ((!this.b) && (((dal)localObject2).b == 3)) || ((!this.a) && (((dal)localObject2).b == 2)) || ((!this.c) && (((dal)localObject2).b == 1))) {
          break label302;
        }
        localObject3 = this.h;
        if (((dal)localObject2).a.longValue() != 5L) {
          break label252;
        }
        bool = ((apj)localObject3).a;
        label162:
        if ((bool) || (this.f.contains(String.valueOf(((dal)localObject2).a)))) {
          break label302;
        }
      }
    }
    label252:
    label302:
    for (j = 1;; j = 0)
    {
      localObject2 = localObject1;
      if (j != 0) {
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (this.e[i].d.longValue() >= ((dal)localObject1).d.longValue()) {}
        }
        else
        {
          localObject2 = this.e[i];
        }
      }
      i++;
      localObject1 = localObject2;
      break;
      j++;
      break label48;
      j = 0;
      break label65;
      if (((dal)localObject2).a.longValue() == 1L)
      {
        bool = ((apj)localObject3).b;
        break label162;
      }
      if (((dal)localObject2).a.longValue() == 3L)
      {
        bool = ((apj)localObject3).c;
        break label162;
      }
      bool = false;
      break label162;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */