import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class aku
{
  private static final Set f = Collections.unmodifiableSet(new akw());
  private static volatile aku g;
  public akg a = akg.a;
  public ajy b = ajy.a;
  public akl c;
  public HashMap d;
  public akt e;
  
  aku()
  {
    ajp.b();
  }
  
  public static aku a()
  {
    if (g == null) {}
    try
    {
      if (g == null)
      {
        aku localaku = new aku;
        localaku.<init>();
        g = localaku;
      }
      return g;
    }
    finally {}
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString != null) && ((paramString.startsWith("publish")) || (paramString.startsWith("manage")) || (f.contains(paramString)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static void b()
  {
    afb.a(null);
    agt.a(null);
  }
  
  public void a(akp paramakp, Map paramMap, Exception paramException)
  {
    if (this.e == null) {}
    for (;;)
    {
      return;
      if (this.c != null) {
        break;
      }
      this.e.a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", "");
    }
    akt localakt = this.e;
    Object localObject = this.c.e;
    HashMap localHashMap = this.d;
    localObject = akt.a((String)localObject);
    if (paramakp != null) {
      ((Bundle)localObject).putString("2_result", paramakp.d);
    }
    if ((paramException != null) && (paramException.getMessage() != null)) {
      ((Bundle)localObject).putString("5_error_message", paramException.getMessage());
    }
    if (!localHashMap.isEmpty()) {}
    for (paramakp = new JSONObject(localHashMap);; paramakp = null)
    {
      paramException = paramakp;
      if (paramMap != null)
      {
        if (paramakp != null) {
          break label227;
        }
        paramakp = new JSONObject();
      }
      label227:
      for (;;)
      {
        try
        {
          paramException = paramMap.entrySet().iterator();
          if (paramException.hasNext())
          {
            paramMap = (Map.Entry)paramException.next();
            paramakp.put((String)paramMap.getKey(), paramMap.getValue());
            continue;
            if (paramException == null) {}
          }
        }
        catch (JSONException paramMap)
        {
          paramException = paramakp;
        }
        for (;;)
        {
          ((Bundle)localObject).putString("6_extras", paramException.toString());
          localakt.a.a("fb_mobile_login_complete", null, (Bundle)localObject);
          break;
          paramException = paramakp;
        }
      }
    }
  }
  
  final boolean a(int paramInt, Intent paramIntent, afo paramafo)
  {
    int i = 0;
    int j = 0;
    boolean bool = false;
    if (this.c == null) {
      return bool;
    }
    Object localObject1 = akp.c;
    Object localObject3;
    Object localObject2;
    label79:
    Object localObject4;
    if (paramIntent != null)
    {
      localObject3 = (akn)paramIntent.getParcelableExtra("com.facebook.LoginFragment:Result");
      if (localObject3 == null) {
        break label431;
      }
      localObject2 = ((akn)localObject3).a;
      if (paramInt == -1) {
        if (((akn)localObject3).a == akp.a)
        {
          paramIntent = ((akn)localObject3).b;
          localObject1 = null;
          paramInt = i;
          localObject4 = ((akn)localObject3).e;
          localObject3 = paramIntent;
          paramIntent = (Intent)localObject2;
          localObject2 = localObject1;
          localObject1 = localObject3;
          localObject3 = localObject4;
        }
      }
    }
    for (;;)
    {
      Object localObject5 = localObject3;
      localObject4 = localObject2;
      localObject3 = paramIntent;
      localObject2 = localObject5;
      paramIntent = (Intent)localObject4;
      for (;;)
      {
        label122:
        localObject4 = paramIntent;
        if (paramIntent == null)
        {
          localObject4 = paramIntent;
          if (localObject1 == null)
          {
            localObject4 = paramIntent;
            if (paramInt == 0) {
              localObject4 = new afq("Unexpected call to LoginManager.onActivityResult");
            }
          }
        }
        a((akp)localObject3, (Map)localObject2, (Exception)localObject4);
        if (localObject1 != null)
        {
          afb.a((afb)localObject1);
          agt.b();
        }
        if (paramafo != null)
        {
          if (localObject1 == null) {
            break label363;
          }
          localObject3 = this.c;
          localObject2 = ((akl)localObject3).b;
          paramIntent = new HashSet(((afb)localObject1).b);
          if (((akl)localObject3).f) {
            paramIntent.retainAll((Collection)localObject2);
          }
          localObject2 = new HashSet((Collection)localObject2);
          ((Set)localObject2).removeAll(paramIntent);
          paramIntent = new akz((afb)localObject1, paramIntent, (Set)localObject2);
          label263:
          if ((paramInt == 0) && ((paramIntent == null) || (paramIntent.b.size() != 0))) {
            break label368;
          }
          paramafo.a();
        }
        for (;;)
        {
          this.c = null;
          this.e = null;
          bool = true;
          break;
          localObject1 = new afn(((akn)localObject3).c);
          paramIntent = null;
          paramInt = i;
          break label79;
          if (paramInt != 0) {
            break label420;
          }
          paramInt = 1;
          paramIntent = null;
          localObject1 = null;
          break label79;
          if (paramInt != 0) {
            break label399;
          }
          localObject3 = akp.b;
          localObject2 = null;
          localObject1 = null;
          paramIntent = null;
          paramInt = 1;
          break label122;
          label363:
          paramIntent = null;
          break label263;
          label368:
          if (localObject4 != null) {
            paramafo.a((afq)localObject4);
          } else if (localObject1 != null) {
            paramafo.a(paramIntent);
          }
        }
        label399:
        localObject4 = null;
        paramIntent = null;
        paramInt = 0;
        localObject2 = null;
        localObject3 = localObject1;
        localObject1 = localObject4;
      }
      label420:
      paramIntent = null;
      localObject1 = null;
      paramInt = i;
      break label79;
      label431:
      localObject3 = null;
      localObject4 = null;
      localObject2 = null;
      paramInt = j;
      paramIntent = (Intent)localObject1;
      localObject1 = localObject4;
    }
  }
  
  public boolean a(ala paramala, akl paramakl)
  {
    boolean bool = false;
    Intent localIntent = new Intent();
    localIntent.setClass(afv.f(), FacebookActivity.class);
    localIntent.setAction(paramakl.a.toString());
    localIntent.putExtras(akq.a(paramakl));
    int i;
    if (afv.f().getPackageManager().resolveActivity(localIntent, 0) == null)
    {
      i = 0;
      if (i != 0) {
        break label74;
      }
    }
    for (;;)
    {
      return bool;
      i = 1;
      break;
      try
      {
        label74:
        paramala.a(localIntent, akh.b());
        bool = true;
      }
      catch (ActivityNotFoundException paramala) {}
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */