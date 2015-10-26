import org.json.JSONArray;
import org.json.JSONObject;

final class agb
  implements agf
{
  agb(aga paramaga, agf paramagf) {}
  
  public final void a(agp paramagp)
  {
    Object localObject1 = paramagp.a;
    JSONArray localJSONArray;
    label27:
    int i;
    label34:
    label64:
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).optJSONObject("__debug__");
      if (localObject1 == null) {
        break label203;
      }
      localJSONArray = ((JSONObject)localObject1).optJSONArray("messages");
      if (localJSONArray == null) {
        break label225;
      }
      i = 0;
      if (i >= localJSONArray.length()) {
        break label225;
      }
      localObject3 = localJSONArray.optJSONObject(i);
      if (localObject3 == null) {
        break label208;
      }
      localObject1 = ((JSONObject)localObject3).optString("message");
      if (localObject3 == null) {
        break label213;
      }
      localObject2 = ((JSONObject)localObject3).optString("type");
      label78:
      if (localObject3 == null) {
        break label219;
      }
    }
    label203:
    label208:
    label213:
    label219:
    for (Object localObject3 = ((JSONObject)localObject3).optString("link");; localObject3 = null)
    {
      if ((localObject1 != null) && (localObject2 != null))
      {
        ags localags = ags.h;
        if (((String)localObject2).equals("warning")) {
          localags = ags.g;
        }
        localObject2 = localObject1;
        if (!aji.a((String)localObject3))
        {
          localObject1 = String.valueOf(localObject1);
          localObject2 = String.valueOf(localObject1).length() + 7 + String.valueOf(localObject3).length() + (String)localObject1 + " Link: " + (String)localObject3;
        }
        aiw.a(localags, aga.a, (String)localObject2);
      }
      i++;
      break label34;
      localObject1 = null;
      break;
      localJSONArray = null;
      break label27;
      localObject1 = null;
      break label64;
      localObject2 = null;
      break label78;
    }
    label225:
    if (this.a != null) {
      this.a.a(paramagp);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */