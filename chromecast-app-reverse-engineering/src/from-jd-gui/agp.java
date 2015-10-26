import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class agp
{
  public final JSONObject a;
  public final afs b;
  private final HttpURLConnection c;
  
  private agp(aga paramaga, HttpURLConnection paramHttpURLConnection, afs paramafs)
  {
    this(paramaga, paramHttpURLConnection, null, null, null, paramafs);
  }
  
  private agp(aga paramaga, HttpURLConnection paramHttpURLConnection, String paramString, JSONArray paramJSONArray)
  {
    this(paramaga, paramHttpURLConnection, paramString, null, paramJSONArray, null);
  }
  
  private agp(aga paramaga, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject)
  {
    this(paramaga, paramHttpURLConnection, paramString, paramJSONObject, null, null);
  }
  
  private agp(aga paramaga, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject, JSONArray paramJSONArray, afs paramafs)
  {
    this.c = paramHttpURLConnection;
    this.a = paramJSONObject;
    this.b = paramafs;
  }
  
  static List a(HttpURLConnection paramHttpURLConnection, agm paramagm)
  {
    Object localObject5 = null;
    String str = null;
    Object localObject6 = null;
    Object localObject7 = null;
    InputStream localInputStream1 = null;
    localInputStream2 = localInputStream1;
    localObject3 = localObject5;
    localObject4 = str;
    Object localObject2 = localObject6;
    localObject1 = localObject7;
    for (;;)
    {
      try
      {
        if (paramHttpURLConnection.getResponseCode() < 400) {
          continue;
        }
        localInputStream2 = localInputStream1;
        localObject3 = localObject5;
        localObject4 = str;
        localObject2 = localObject6;
        localObject1 = localObject7;
        localInputStream1 = paramHttpURLConnection.getErrorStream();
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        str = aji.a(localInputStream1);
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        aiw.a(ags.c, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] { Integer.valueOf(str.length()), str });
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        localObject5 = new org/json/JSONTokener;
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        ((JSONTokener)localObject5).<init>(str);
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        localObject5 = a(paramHttpURLConnection, paramagm, ((JSONTokener)localObject5).nextValue());
        localInputStream2 = localInputStream1;
        localObject3 = localInputStream1;
        localObject4 = localInputStream1;
        localObject2 = localInputStream1;
        localObject1 = localInputStream1;
        aiw.a(ags.a, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] { paramagm.c, Integer.valueOf(str.length()), localObject5 });
        aji.a(localInputStream1);
        paramHttpURLConnection = (HttpURLConnection)localObject5;
      }
      catch (afq localafq1)
      {
        localObject1 = localInputStream2;
        aiw.a(ags.a, "Response", "Response <Error>: %s", new Object[] { localafq1 });
        localObject1 = localInputStream2;
        paramHttpURLConnection = a(paramagm, paramHttpURLConnection, localafq1);
        aji.a(localInputStream2);
        continue;
      }
      catch (JSONException localJSONException)
      {
        localObject1 = localObject3;
        aiw.a(ags.a, "Response", "Response <Error>: %s", new Object[] { localJSONException });
        localObject1 = localObject3;
        localafq2 = new afq;
        localObject1 = localObject3;
        localafq2.<init>(localJSONException);
        localObject1 = localObject3;
        paramHttpURLConnection = a(paramagm, paramHttpURLConnection, localafq2);
        aji.a((Closeable)localObject3);
        continue;
      }
      catch (IOException localIOException)
      {
        localObject1 = localObject4;
        aiw.a(ags.a, "Response", "Response <Error>: %s", new Object[] { localIOException });
        localObject1 = localObject4;
        afq localafq2 = new afq;
        localObject1 = localObject4;
        localafq2.<init>(localIOException);
        localObject1 = localObject4;
        paramHttpURLConnection = a(paramagm, paramHttpURLConnection, localafq2);
        aji.a((Closeable)localObject4);
        continue;
      }
      catch (SecurityException localSecurityException)
      {
        localObject1 = localIOException;
        aiw.a(ags.a, "Response", "Response <Error>: %s", new Object[] { localSecurityException });
        localObject1 = localIOException;
        localObject3 = new afq;
        localObject1 = localIOException;
        ((afq)localObject3).<init>(localSecurityException);
        localObject1 = localIOException;
        paramHttpURLConnection = a(paramagm, paramHttpURLConnection, (afq)localObject3);
        aji.a(localIOException);
        continue;
      }
      finally
      {
        aji.a((Closeable)localObject1);
      }
      return paramHttpURLConnection;
      localInputStream2 = localInputStream1;
      localObject3 = localObject5;
      localObject4 = str;
      localObject2 = localObject6;
      localObject1 = localObject7;
      localInputStream1 = paramHttpURLConnection.getInputStream();
    }
  }
  
  private static List a(HttpURLConnection paramHttpURLConnection, List paramList, Object paramObject)
  {
    int j = paramList.size();
    ArrayList localArrayList = new ArrayList(j);
    aga localaga;
    if (j == 1) {
      localaga = (aga)paramList.get(0);
    }
    Object localObject2;
    for (;;)
    {
      try
      {
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>();
        ((JSONObject)localObject3).put("body", paramObject);
        if (paramHttpURLConnection == null) {
          continue;
        }
        i = paramHttpURLConnection.getResponseCode();
        ((JSONObject)localObject3).put("code", i);
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localJSONArray.put(localObject3);
      }
      catch (JSONException localJSONException1)
      {
        JSONArray localJSONArray;
        localArrayList.add(new agp(localaga, paramHttpURLConnection, new afs(paramHttpURLConnection, localJSONException1)));
        Object localObject1 = paramObject;
        continue;
      }
      catch (IOException localIOException)
      {
        localArrayList.add(new agp(localaga, paramHttpURLConnection, new afs(paramHttpURLConnection, localIOException)));
      }
      if (((localJSONArray instanceof JSONArray)) && (((JSONArray)localJSONArray).length() == j)) {
        break;
      }
      throw new afq("Unexpected number of results");
      i = 200;
      continue;
      localObject2 = paramObject;
    }
    Object localObject3 = (JSONArray)localObject2;
    int i = 0;
    if (i < ((JSONArray)localObject3).length())
    {
      localaga = (aga)paramList.get(i);
      for (;;)
      {
        try
        {
          localObject2 = ((JSONArray)localObject3).get(i);
          if (!(localObject2 instanceof JSONObject)) {
            break label527;
          }
          localObject2 = (JSONObject)localObject2;
          localObject4 = afs.a((JSONObject)localObject2, paramObject, paramHttpURLConnection);
          if (localObject4 == null) {
            continue;
          }
          if ((((afs)localObject4).b == 190) && (aji.a(localaga.b))) {
            afb.a(null);
          }
          localObject2 = new agp;
          ((agp)localObject2).<init>(localaga, paramHttpURLConnection, (afs)localObject4);
          localArrayList.add(localObject2);
          i++;
        }
        catch (JSONException localJSONException2)
        {
          localArrayList.add(new agp(localaga, paramHttpURLConnection, new afs(paramHttpURLConnection, localJSONException2)));
          continue;
          Object localObject4 = new afq;
          str1 = String.valueOf(localJSONException2.getClass().getSimpleName());
          if (str1.length() == 0) {
            continue;
          }
          str1 = "Got unexpected object type in response, class: ".concat(str1);
          ((afq)localObject4).<init>(str1);
          throw ((Throwable)localObject4);
        }
        catch (afq localafq)
        {
          localArrayList.add(new agp(localaga, paramHttpURLConnection, new afs(paramHttpURLConnection, localafq)));
          continue;
          str2 = new String("Got unexpected object type in response, class: ");
          continue;
        }
        break;
        localObject2 = aji.a((JSONObject)localObject2, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((localObject2 instanceof JSONObject))
        {
          localObject2 = new agp(localaga, paramHttpURLConnection, localObject2.toString(), (JSONObject)localObject2);
        }
        else
        {
          if (!(localObject2 instanceof JSONArray)) {
            continue;
          }
          localObject2 = new agp(localaga, paramHttpURLConnection, localObject2.toString(), (JSONArray)localObject2);
        }
      }
      localObject2 = JSONObject.NULL;
    }
    label527:
    for (;;)
    {
      if (localObject2 == JSONObject.NULL)
      {
        localObject2 = new agp(localaga, paramHttpURLConnection, localObject2.toString(), null);
        break;
      }
      String str1;
      String str2;
      return localArrayList;
    }
  }
  
  static List a(List paramList, HttpURLConnection paramHttpURLConnection, afq paramafq)
  {
    int j = paramList.size();
    ArrayList localArrayList = new ArrayList(j);
    for (int i = 0; i < j; i++) {
      localArrayList.add(new agp((aga)paramList.get(i), paramHttpURLConnection, new afs(paramHttpURLConnection, paramafq)));
    }
    return localArrayList;
  }
  
  public final String toString()
  {
    for (;;)
    {
      try
      {
        localObject = Locale.US;
        if (this.c == null) {
          continue;
        }
        i = this.c.getResponseCode();
        localObject = String.format((Locale)localObject, "%d", new Object[] { Integer.valueOf(i) });
      }
      catch (IOException localIOException)
      {
        Object localObject;
        int i;
        String str = "unknown";
        continue;
      }
      return "{Response: " + " responseCode: " + (String)localObject + ", graphObject: " + this.a + ", error: " + this.b + "}";
      i = 200;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */