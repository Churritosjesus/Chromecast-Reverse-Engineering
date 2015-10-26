import android.util.Log;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

final class afh
  implements agf
{
  afh(aff paramaff, AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2) {}
  
  public final void a(agp paramagp)
  {
    paramagp = paramagp.a;
    if (paramagp == null) {}
    JSONArray localJSONArray;
    do
    {
      return;
      localJSONArray = paramagp.optJSONArray("data");
    } while (localJSONArray == null);
    this.a.set(true);
    int i = 0;
    label32:
    Object localObject;
    if (i < localJSONArray.length())
    {
      localObject = localJSONArray.optJSONObject(i);
      if (localObject != null)
      {
        paramagp = ((JSONObject)localObject).optString("permission");
        localObject = ((JSONObject)localObject).optString("status");
        if ((!aji.a(paramagp)) && (!aji.a((String)localObject)))
        {
          localObject = ((String)localObject).toLowerCase(Locale.US);
          if (!((String)localObject).equals("granted")) {
            break label114;
          }
          this.b.add(paramagp);
        }
      }
    }
    for (;;)
    {
      i++;
      break label32;
      break;
      label114:
      if (!((String)localObject).equals("declined")) {
        break label137;
      }
      this.c.add(paramagp);
    }
    label137:
    paramagp = String.valueOf(localObject);
    if (paramagp.length() != 0) {}
    for (paramagp = "Unexpected status: ".concat(paramagp);; paramagp = new String("Unexpected status: "))
    {
      Log.w("AccessTokenManager", paramagp);
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */