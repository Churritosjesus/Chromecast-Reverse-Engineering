import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class agr
{
  private static final String a = agr.class.getSimpleName();
  private String b;
  private SharedPreferences c;
  
  public agr(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private agr(Context paramContext, String paramString)
  {
    ajp.a(paramContext, "context");
    if (aji.a(null)) {
      paramString = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    }
    this.b = paramString;
    paramString = paramContext.getApplicationContext();
    if (paramString != null) {
      paramContext = paramString;
    }
    this.c = paramContext.getSharedPreferences(this.b, 0);
  }
  
  static Date a(Bundle paramBundle, String paramString)
  {
    Object localObject = null;
    if (paramBundle == null) {
      paramBundle = (Bundle)localObject;
    }
    for (;;)
    {
      return paramBundle;
      long l = paramBundle.getLong(paramString, Long.MIN_VALUE);
      paramBundle = (Bundle)localObject;
      if (l != Long.MIN_VALUE) {
        paramBundle = new Date(l);
      }
    }
  }
  
  private void a(String paramString, Bundle paramBundle)
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i = 0;
    Object localObject2 = new JSONObject(this.c.getString(paramString, "{}"));
    Object localObject1 = ((JSONObject)localObject2).getString("valueType");
    if (((String)localObject1).equals("bool")) {
      paramBundle.putBoolean(paramString, ((JSONObject)localObject2).getBoolean("value"));
    }
    for (;;)
    {
      return;
      if (((String)localObject1).equals("bool[]"))
      {
        localObject1 = ((JSONObject)localObject2).getJSONArray("value");
        localObject2 = new boolean[((JSONArray)localObject1).length()];
        while (i < localObject2.length)
        {
          localObject2[i] = ((JSONArray)localObject1).getBoolean(i);
          i++;
        }
        paramBundle.putBooleanArray(paramString, (boolean[])localObject2);
      }
      else if (((String)localObject1).equals("byte"))
      {
        paramBundle.putByte(paramString, (byte)((JSONObject)localObject2).getInt("value"));
      }
      else if (((String)localObject1).equals("byte[]"))
      {
        localObject2 = ((JSONObject)localObject2).getJSONArray("value");
        localObject1 = new byte[((JSONArray)localObject2).length()];
        for (i = j; i < localObject1.length; i++) {
          localObject1[i] = ((byte)((JSONArray)localObject2).getInt(i));
        }
        paramBundle.putByteArray(paramString, (byte[])localObject1);
      }
      else if (((String)localObject1).equals("short"))
      {
        paramBundle.putShort(paramString, (short)((JSONObject)localObject2).getInt("value"));
      }
      else if (((String)localObject1).equals("short[]"))
      {
        localObject2 = ((JSONObject)localObject2).getJSONArray("value");
        localObject1 = new short[((JSONArray)localObject2).length()];
        for (i = k; i < localObject1.length; i++) {
          localObject1[i] = ((short)((JSONArray)localObject2).getInt(i));
        }
        paramBundle.putShortArray(paramString, (short[])localObject1);
      }
      else if (((String)localObject1).equals("int"))
      {
        paramBundle.putInt(paramString, ((JSONObject)localObject2).getInt("value"));
      }
      else if (((String)localObject1).equals("int[]"))
      {
        localObject1 = ((JSONObject)localObject2).getJSONArray("value");
        localObject2 = new int[((JSONArray)localObject1).length()];
        for (i = m; i < localObject2.length; i++) {
          localObject2[i] = ((JSONArray)localObject1).getInt(i);
        }
        paramBundle.putIntArray(paramString, (int[])localObject2);
      }
      else if (((String)localObject1).equals("long"))
      {
        paramBundle.putLong(paramString, ((JSONObject)localObject2).getLong("value"));
      }
      else if (((String)localObject1).equals("long[]"))
      {
        localObject1 = ((JSONObject)localObject2).getJSONArray("value");
        localObject2 = new long[((JSONArray)localObject1).length()];
        for (i = n; i < localObject2.length; i++) {
          localObject2[i] = ((JSONArray)localObject1).getLong(i);
        }
        paramBundle.putLongArray(paramString, (long[])localObject2);
      }
      else if (((String)localObject1).equals("float"))
      {
        paramBundle.putFloat(paramString, (float)((JSONObject)localObject2).getDouble("value"));
      }
      else if (((String)localObject1).equals("float[]"))
      {
        localObject1 = ((JSONObject)localObject2).getJSONArray("value");
        localObject2 = new float[((JSONArray)localObject1).length()];
        for (i = i1; i < localObject2.length; i++) {
          localObject2[i] = ((float)((JSONArray)localObject1).getDouble(i));
        }
        paramBundle.putFloatArray(paramString, (float[])localObject2);
      }
      else if (((String)localObject1).equals("double"))
      {
        paramBundle.putDouble(paramString, ((JSONObject)localObject2).getDouble("value"));
      }
      else if (((String)localObject1).equals("double[]"))
      {
        localObject2 = ((JSONObject)localObject2).getJSONArray("value");
        localObject1 = new double[((JSONArray)localObject2).length()];
        for (i = i2; i < localObject1.length; i++) {
          localObject1[i] = ((JSONArray)localObject2).getDouble(i);
        }
        paramBundle.putDoubleArray(paramString, (double[])localObject1);
      }
      else if (((String)localObject1).equals("char"))
      {
        localObject1 = ((JSONObject)localObject2).getString("value");
        if ((localObject1 != null) && (((String)localObject1).length() == 1)) {
          paramBundle.putChar(paramString, ((String)localObject1).charAt(0));
        }
      }
      else
      {
        Object localObject3;
        if (((String)localObject1).equals("char[]"))
        {
          localObject2 = ((JSONObject)localObject2).getJSONArray("value");
          localObject3 = new char[((JSONArray)localObject2).length()];
          for (i = 0; i < localObject3.length; i++)
          {
            localObject1 = ((JSONArray)localObject2).getString(i);
            if ((localObject1 != null) && (((String)localObject1).length() == 1)) {
              localObject3[i] = ((String)localObject1).charAt(0);
            }
          }
          paramBundle.putCharArray(paramString, (char[])localObject3);
        }
        else if (((String)localObject1).equals("string"))
        {
          paramBundle.putString(paramString, ((JSONObject)localObject2).getString("value"));
        }
        else if (((String)localObject1).equals("stringList"))
        {
          localObject2 = ((JSONObject)localObject2).getJSONArray("value");
          j = ((JSONArray)localObject2).length();
          localObject3 = new ArrayList(j);
          i = 0;
          if (i < j)
          {
            localObject1 = ((JSONArray)localObject2).get(i);
            if (localObject1 == JSONObject.NULL) {}
            for (localObject1 = null;; localObject1 = (String)localObject1)
            {
              ((ArrayList)localObject3).add(i, localObject1);
              i++;
              break;
            }
          }
          paramBundle.putStringArrayList(paramString, (ArrayList)localObject3);
        }
        else if (((String)localObject1).equals("enum"))
        {
          try
          {
            paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(((JSONObject)localObject2).getString("enumType")), ((JSONObject)localObject2).getString("value")));
          }
          catch (ClassNotFoundException paramString) {}catch (IllegalArgumentException paramString) {}
        }
      }
    }
  }
  
  public static boolean a(Bundle paramBundle)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramBundle == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      String str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
      bool1 = bool2;
      if (str != null)
      {
        bool1 = bool2;
        if (str.length() != 0)
        {
          bool1 = bool2;
          if (paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public static String b(Bundle paramBundle)
  {
    ajp.a(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
  }
  
  public static afl c(Bundle paramBundle)
  {
    ajp.a(paramBundle, "bundle");
    if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
      paramBundle = (afl)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
    }
    for (;;)
    {
      return paramBundle;
      if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
        paramBundle = afl.a;
      } else {
        paramBundle = afl.c;
      }
    }
  }
  
  public static String d(Bundle paramBundle)
  {
    ajp.a(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
  }
  
  public final Bundle a()
  {
    Object localObject1 = new Bundle();
    Object localObject2 = this.c.getAll().keySet().iterator();
    for (;;)
    {
      if (((Iterator)localObject2).hasNext())
      {
        String str1 = (String)((Iterator)localObject2).next();
        try
        {
          a(str1, (Bundle)localObject1);
        }
        catch (JSONException localJSONException)
        {
          localObject1 = ags.d;
          localObject2 = a;
          String str2 = String.valueOf(localJSONException);
          aiw.a((ags)localObject1, 5, (String)localObject2, String.valueOf(str1).length() + 42 + String.valueOf(str2).length() + "Error reading cached value for key: '" + str1 + "' -- " + str2);
          localObject1 = null;
        }
      }
    }
    for (;;)
    {
      return (Bundle)localObject1;
    }
  }
  
  public final void b()
  {
    this.c.edit().clear().apply();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */