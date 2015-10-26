import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class bfo
  extends bfp
{
  private final bdf a;
  private final HashMap b;
  private final int j;
  
  public bfo(String paramString, bdf parambdf, HashMap paramHashMap, int paramInt)
  {
    super(paramString);
    this.a = parambdf;
    this.b = paramHashMap;
    this.j = paramInt;
  }
  
  public final int a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localObject3 = null;
    localObject6 = null;
    localObject9 = null;
    localObject12 = null;
    localObject23 = null;
    int i10 = 0;
    k = 0;
    int i9 = 0;
    m = 0;
    int i8 = 0;
    n = 0;
    int i7 = 0;
    int i6 = 0;
    boolean bool13 = false;
    bool2 = false;
    boolean bool12 = false;
    bool3 = false;
    boolean bool11 = false;
    bool4 = false;
    boolean bool10 = false;
    boolean bool9 = false;
    int i5;
    if (this.j >= 7) {
      i5 = 1;
    }
    for (;;)
    {
      Object localObject15;
      label108:
      label350:
      boolean bool8;
      boolean bool7;
      boolean bool5;
      int i4;
      int i3;
      int i2;
      boolean bool1;
      int i;
      label1321:
      Object localObject2;
      try
      {
        localObject24 = this.b.get("friendly_name");
        if (i5 != 0)
        {
          localObject15 = new org/json/JSONObject;
          ((JSONObject)localObject15).<init>();
          localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
          localObject1 = localObject3;
          if (localObject24 != null)
          {
            localObject1 = localObject3;
            if ((localObject24 instanceof String)) {
              localObject1 = (String)localObject24;
            }
          }
        }
      }
      catch (JSONException localJSONException1)
      {
        Object localObject24;
        JSONObject localJSONObject2;
        Object localObject1;
        bool1 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = false;
        n = 0;
        i = 0;
        i1 = 0;
        localObject2 = null;
        localObject3 = null;
        localObject6 = null;
        localObject9 = null;
        localObject12 = null;
        continue;
      }
      try
      {
        localJSONObject1.put("name", localObject1);
      }
      catch (JSONException localJSONException2)
      {
        bool2 = false;
        bool3 = false;
        bool4 = false;
        bool5 = false;
        i = 0;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        localObject15 = null;
        Object localObject4 = null;
        localObject6 = null;
        localObject9 = null;
        localObject12 = localObject2;
        bool1 = false;
        localObject2 = localObject15;
        continue;
      }
      Object localObject5;
      try
      {
        localObject24 = this.b.get("timezone");
        localObject3 = localObject6;
        if (localObject24 != null)
        {
          localObject3 = localObject6;
          if ((localObject24 instanceof bdb)) {
            localObject3 = (bdb)localObject24;
          }
        }
      }
      catch (JSONException localJSONException3)
      {
        bool1 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = false;
        n = 0;
        i = 0;
        i1 = 0;
        localObject15 = null;
        localObject5 = null;
        localObject6 = null;
        localObject9 = null;
        localObject12 = localObject2;
        localObject2 = localObject15;
        continue;
      }
      try
      {
        ((JSONObject)localObject15).put("timezone", ((bdb)localObject3).a);
      }
      catch (JSONException localJSONException4)
      {
        bool2 = false;
        localObject12 = localObject2;
        bool3 = false;
        bool4 = false;
        bool5 = false;
        i = 0;
        m = 0;
        n = 0;
        i1 = 0;
        localObject2 = null;
        localObject15 = null;
        Object localObject7 = null;
        localObject9 = localObject5;
        bool1 = false;
        k = 0;
        localObject5 = localObject15;
        continue;
      }
      try
      {
        localObject24 = this.b.get("time_format");
        localObject6 = localObject9;
        if (localObject24 != null)
        {
          localObject6 = localObject9;
          if ((localObject24 instanceof bdk)) {
            localObject6 = (bdk)localObject24;
          }
        }
      }
      catch (JSONException localJSONException5)
      {
        bool1 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = false;
        n = 0;
        i = 0;
        i1 = 0;
        localObject23 = null;
        localObject15 = null;
        Object localObject8 = null;
        localObject9 = localObject5;
        localObject12 = localObject2;
        localObject2 = localObject23;
        localObject5 = localObject15;
        continue;
      }
      try
      {
        ((JSONObject)localObject15).put("time_format", ((bdk)localObject6).c);
      }
      catch (JSONException localJSONException6)
      {
        bool2 = false;
        Object localObject10 = localObject5;
        bool3 = false;
        localObject12 = localObject2;
        bool4 = false;
        bool5 = false;
        i = 0;
        n = 0;
        i1 = 0;
        localObject2 = null;
        localObject5 = null;
        bool1 = false;
        k = 0;
        m = 0;
        continue;
      }
      Object localObject11;
      try
      {
        localObject24 = this.b.get("locale");
        localObject9 = localObject12;
        if (localObject24 != null)
        {
          localObject9 = localObject12;
          if ((localObject24 instanceof bcz)) {
            localObject9 = (bcz)localObject24;
          }
        }
      }
      catch (JSONException localJSONException7)
      {
        bool1 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = false;
        n = 0;
        i = 0;
        i1 = 0;
        localObject23 = null;
        localObject15 = null;
        localObject11 = localObject5;
        localObject12 = localObject2;
        localObject2 = localObject23;
        localObject5 = localObject15;
        continue;
      }
      try
      {
        ((JSONObject)localObject15).put("locale", ((bcz)localObject9).a);
      }
      catch (JSONException localJSONException8)
      {
        bool2 = false;
        bool3 = false;
        localObject15 = localObject5;
        bool4 = false;
        Object localObject13 = localObject2;
        bool5 = false;
        i = 0;
        i1 = 0;
        localObject2 = null;
        localObject5 = localObject11;
        bool1 = false;
        k = 0;
        m = 0;
        n = 0;
        localObject11 = localObject15;
        continue;
      }
      Object localObject14;
      try
      {
        localObject24 = this.b.get("country_code");
        localObject12 = localObject23;
        if (localObject24 != null)
        {
          localObject12 = localObject23;
          if ((localObject24 instanceof String))
          {
            localObject12 = (String)localObject24;
            if (i5 == 0) {
              continue;
            }
          }
        }
      }
      catch (JSONException localJSONException9)
      {
        bool1 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = false;
        n = 0;
        i = 0;
        i1 = 0;
        localObject23 = null;
        localObject15 = localObject5;
        localObject14 = localObject2;
        localObject2 = localObject23;
        localObject5 = localObject11;
        localObject11 = localObject15;
        continue;
      }
      try
      {
        ((JSONObject)localObject15).put("country_code", localObject12);
        bool8 = bool10;
        bool7 = bool11;
        bool6 = bool12;
        bool5 = bool13;
        i4 = i7;
        i3 = i8;
        i2 = i9;
        i1 = i10;
      }
      catch (JSONException localJSONException10)
      {
        bool2 = false;
        localObject23 = localObject11;
        bool3 = false;
        bool4 = false;
        localObject11 = localObject5;
        bool5 = false;
        Object localObject16 = localObject2;
        i = 0;
        localObject2 = localObject14;
        bool1 = false;
        k = 0;
        m = 0;
        n = 0;
        i1 = 0;
        localObject5 = localObject23;
        localObject14 = localObject16;
        continue;
      }
      try
      {
        localObject23 = this.b.get("system_sound_effects");
        bool1 = bool2;
        i = k;
        if (localObject23 != null)
        {
          bool1 = bool2;
          i = k;
          bool8 = bool10;
          bool7 = bool11;
          bool6 = bool12;
          bool5 = bool13;
          i4 = i7;
          i3 = i8;
          i2 = i9;
          i1 = i10;
          if ((localObject23 instanceof Boolean))
          {
            bool8 = bool10;
            bool7 = bool11;
            bool6 = bool12;
            bool5 = bool13;
            i4 = i7;
            i3 = i8;
            i2 = i9;
            i1 = i10;
            bool1 = ((Boolean)localObject23).booleanValue();
            i = 1;
          }
        }
      }
      catch (JSONException localJSONException11)
      {
        bool1 = false;
        bool2 = bool8;
        bool3 = bool7;
        k = i4;
        bool4 = bool6;
        m = i3;
        n = i2;
        i = 0;
        Object localObject17 = localObject14;
        localObject14 = localObject5;
        localObject23 = localObject2;
        localObject2 = localObject17;
        localObject5 = localObject11;
        localObject11 = localObject14;
        localObject14 = localObject23;
        continue;
      }
      try
      {
        ((JSONObject)localObject15).put("system_sound_effects", bool1);
        bool8 = bool10;
        bool7 = bool11;
        bool6 = bool12;
        bool5 = bool1;
        i4 = i7;
        i3 = i8;
        i2 = i9;
        i1 = i;
        localObject23 = this.b.get("opt_in_audio_hdr");
        bool2 = bool3;
        k = m;
        if (localObject23 != null)
        {
          bool2 = bool3;
          k = m;
          bool8 = bool10;
          bool7 = bool11;
          bool6 = bool12;
          bool5 = bool1;
          i4 = i7;
          i3 = i8;
          i2 = i9;
          i1 = i;
          if ((localObject23 instanceof Boolean))
          {
            bool8 = bool10;
            bool7 = bool11;
            bool6 = bool12;
            bool5 = bool1;
            i4 = i7;
            i3 = i8;
            i2 = i9;
            i1 = i;
            bool2 = ((Boolean)localObject23).booleanValue();
            k = 1;
          }
        }
      }
      catch (JSONException localJSONException12)
      {
        bool6 = false;
        bool2 = false;
        bool3 = false;
        k = 0;
        bool4 = false;
        m = 0;
        bool5 = bool1;
        n = 0;
        i = 0;
        i1 = 1;
        Object localObject18 = localObject14;
        localObject23 = localObject11;
        localObject11 = localObject5;
        localObject14 = localObject2;
        bool1 = bool6;
        localObject2 = localObject18;
        localObject5 = localObject23;
        continue;
      }
      try
      {
        localJSONObject2.put("audio_hdr", bool2);
        bool8 = bool10;
        bool7 = bool11;
        bool6 = bool2;
        bool5 = bool1;
        i4 = i7;
        i3 = i8;
        i2 = k;
        i1 = i;
        localObject23 = this.b.get("opt_in_stats");
        bool3 = bool4;
        m = n;
        if (localObject23 != null)
        {
          bool3 = bool4;
          m = n;
          bool8 = bool10;
          bool7 = bool11;
          bool6 = bool2;
          bool5 = bool1;
          i4 = i7;
          i3 = i8;
          i2 = k;
          i1 = i;
          if ((localObject23 instanceof Boolean))
          {
            bool8 = bool10;
            bool7 = bool11;
            bool6 = bool2;
            bool5 = bool1;
            i4 = i7;
            i3 = i8;
            i2 = k;
            i1 = i;
            bool4 = ((Boolean)localObject23).booleanValue();
            n = 1;
          }
        }
      }
      catch (JSONException localJSONException13)
      {
        bool7 = false;
        bool6 = false;
        bool3 = false;
        k = 0;
        bool4 = bool2;
        m = 0;
        bool5 = bool1;
        n = 1;
        i2 = 0;
        i1 = i;
        localObject23 = localObject14;
        localObject14 = localObject5;
        Object localObject19 = localObject2;
        bool1 = bool7;
        bool2 = bool6;
        i = i2;
        localObject2 = localObject23;
        localObject5 = localObject11;
        localObject11 = localObject14;
        localObject14 = localObject19;
        continue;
      }
      try
      {
        localJSONObject2.put("stats", bool4);
        bool3 = bool4;
        m = n;
        if (i5 == 0)
        {
          localJSONObject2.put("crash", bool4);
          m = n;
          bool3 = bool4;
        }
        bool8 = bool10;
        bool7 = bool3;
        bool6 = bool2;
        bool5 = bool1;
        i4 = i7;
        i3 = m;
        i2 = k;
        i1 = i;
        localObject23 = this.b.get("opt_in_device_id");
        bool4 = bool9;
        n = i6;
        if (i5 == 0)
        {
          bool4 = bool9;
          n = i6;
          if (localObject23 != null)
          {
            bool4 = bool9;
            n = i6;
            bool8 = bool10;
            bool7 = bool3;
            bool6 = bool2;
            bool5 = bool1;
            i4 = i7;
            i3 = m;
            i2 = k;
            i1 = i;
            if ((localObject23 instanceof Boolean))
            {
              bool8 = bool10;
              bool7 = bool3;
              bool6 = bool2;
              bool5 = bool1;
              i4 = i7;
              i3 = m;
              i2 = k;
              i1 = i;
              bool4 = ((Boolean)localObject23).booleanValue();
              n = 1;
            }
          }
        }
      }
      catch (JSONException localJSONException14)
      {
        bool7 = false;
        bool6 = false;
        bool3 = bool4;
        i2 = 0;
        bool4 = bool2;
        m = 1;
        bool5 = bool1;
        n = k;
        k = 0;
        i1 = i;
        localObject23 = localObject14;
        localObject14 = localObject5;
        Object localObject20 = localObject2;
        bool1 = bool7;
        bool2 = bool6;
        i = k;
        k = i2;
        localObject2 = localObject23;
        localObject5 = localObject11;
        localObject11 = localObject14;
        localObject14 = localObject20;
        continue;
      }
      for (;;)
      {
        try
        {
          localJSONObject2.put("device_id", bool4);
          bool8 = bool4;
          bool7 = bool3;
          bool6 = bool2;
          bool5 = bool1;
          i4 = n;
          i3 = m;
          i2 = k;
          i1 = i;
          localObject23 = this.b.get("opt_in_opencast");
          if (localObject23 == null) {
            continue;
          }
          bool8 = bool4;
          bool7 = bool3;
          bool6 = bool2;
          bool5 = bool1;
          i4 = n;
          i3 = m;
          i2 = k;
          i1 = i;
          if (!(localObject23 instanceof Boolean)) {
            continue;
          }
          bool8 = bool4;
          bool7 = bool3;
          bool6 = bool2;
          bool5 = bool1;
          i4 = n;
          i3 = m;
          i2 = k;
          i1 = i;
          bool9 = ((Boolean)localObject23).booleanValue();
          bool6 = bool9;
          i2 = 1;
          i1 = 1;
          bool5 = bool6;
        }
        catch (JSONException localJSONException15)
        {
          bool7 = false;
          bool6 = bool4;
          i2 = 1;
          bool4 = bool2;
          bool5 = bool1;
          n = k;
          k = 0;
          i1 = i;
          Object localObject21 = localObject14;
          localObject14 = localObject11;
          localObject11 = localObject5;
          localObject23 = localObject2;
          bool1 = bool7;
          bool2 = bool6;
          i = k;
          k = i2;
          localObject2 = localObject21;
          localObject5 = localObject14;
          localObject14 = localObject23;
          break label1321;
          Object localObject22;
          bool6 = false;
          i1 = 0;
          break;
        }
        try
        {
          localJSONObject2.put("opencast", bool6);
          if (i5 != 0)
          {
            bool5 = bool6;
            i2 = i1;
            if (((JSONObject)localObject15).length() > 0)
            {
              bool5 = bool6;
              i2 = i1;
              localJSONObject1.put("settings", localObject15);
            }
          }
          bool5 = bool6;
          i2 = i1;
          if (localJSONObject2.length() > 0)
          {
            bool5 = bool6;
            i2 = i1;
            localJSONObject1.put("opt_in", localJSONObject2);
          }
          bool7 = bool4;
          i2 = i1;
          i3 = n;
          localObject15 = localObject12;
          localObject23 = localObject9;
          localObject12 = localObject1;
          localObject9 = localObject3;
          localObject3 = localObject23;
          localObject1 = localObject15;
          i1 = i;
          n = k;
          k = i3;
          i = i2;
          bool5 = bool1;
          bool4 = bool2;
          bool2 = bool7;
          bool1 = bool6;
        }
        catch (JSONException localJSONException16)
        {
          bool7 = bool2;
          bool6 = bool1;
          i3 = n;
          n = k;
          i1 = i;
          localObject22 = localObject14;
          localObject23 = localObject11;
          localObject11 = localObject5;
          localObject14 = localObject2;
          bool1 = bool5;
          bool2 = bool4;
          bool4 = bool7;
          bool5 = bool6;
          i = i2;
          k = i3;
          localObject2 = localObject22;
          localObject5 = localObject23;
          break label1321;
        }
      }
    }
    if (localJSONObject1.length() == 0) {
      i = 0;
    }
    for (;;)
    {
      return i;
      i5 = 0;
      break;
      localObject15 = localJSONObject1;
      break label108;
      localObject23 = new org/json/JSONObject;
      ((JSONObject)localObject23).<init>();
      ((JSONObject)localObject23).put("country_code", localObject12);
      localJSONObject1.put("location", localObject23);
      break label350;
      try
      {
        i2 = a("set_eureka_info", bfc.a(localJSONObject1), c).b();
        if (i2 == 200) {
          break label1431;
        }
        i = -1;
      }
      catch (IOException localIOException)
      {
        i = -1;
      }
      catch (TimeoutException localTimeoutException)
      {
        i = -2;
      }
      continue;
      label1431:
      if (this.a != null)
      {
        if (localObject12 != null) {
          this.a.b = ((String)localObject12);
        }
        if (localObject9 != null) {
          this.a.I = ((bdb)localObject9);
        }
        if (localObject6 != null) {
          this.a.J = ((bdk)localObject6);
        }
        if (localObject3 != null) {
          this.a.K = ((bcz)localObject3);
        }
        if (localTimeoutException != null) {
          this.a.L = localTimeoutException;
        }
        if (i1 != 0) {
          this.a.M = bool5;
        }
        if (n != 0) {
          this.a.N = bool4;
        }
        if (m != 0) {
          this.a.O = bool3;
        }
        if (k != 0) {
          this.a.Q = bool2;
        }
        if (i != 0)
        {
          this.a.P = Boolean.valueOf(bool1);
          if (!bool1) {
            this.a.R = null;
          }
        }
      }
      i = 0;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */