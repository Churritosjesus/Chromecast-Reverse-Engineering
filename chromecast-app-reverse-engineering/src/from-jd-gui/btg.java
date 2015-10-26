import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class btg
{
  public bth a;
  private final String b;
  private int c;
  private String d;
  private long e;
  private List f;
  private JSONObject g;
  
  btg(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getString("contentId");
    Object localObject1 = paramJSONObject.getString("streamType");
    if ("NONE".equals(localObject1)) {
      this.c = 0;
    }
    for (;;)
    {
      this.d = paramJSONObject.getString("contentType");
      Object localObject2;
      if (paramJSONObject.has("metadata"))
      {
        localObject1 = paramJSONObject.getJSONObject("metadata");
        this.a = new bth(((JSONObject)localObject1).getInt("metadataType"));
        localObject2 = this.a;
        ((bth)localObject2).b.clear();
        ((bth)localObject2).a.clear();
        ((bth)localObject2).c = 0;
      }
      try
      {
        ((bth)localObject2).c = ((JSONObject)localObject1).getInt("metadataType");
        cjf.a(((bth)localObject2).a, (JSONObject)localObject1);
        switch (((bth)localObject2).c)
        {
        default: 
          ((bth)localObject2).a((JSONObject)localObject1, new String[0]);
        }
        for (;;)
        {
          this.e = -1L;
          if ((paramJSONObject.has("duration")) && (!paramJSONObject.isNull("duration")))
          {
            double d1 = paramJSONObject.optDouble("duration", 0.0D);
            if ((!Double.isNaN(d1)) && (!Double.isInfinite(d1))) {
              this.e = ((d1 * 1000.0D));
            }
          }
          if (!paramJSONObject.has("tracks")) {
            break label580;
          }
          this.f = new ArrayList();
          localObject1 = paramJSONObject.getJSONArray("tracks");
          for (int i = 0; i < ((JSONArray)localObject1).length(); i++)
          {
            localObject2 = new btk(((JSONArray)localObject1).getJSONObject(i));
            this.f.add(localObject2);
          }
          if ("BUFFERED".equals(localObject1))
          {
            this.c = 1;
            break;
          }
          if ("LIVE".equals(localObject1))
          {
            this.c = 2;
            break;
          }
          this.c = -1;
          break;
          ((bth)localObject2).a((JSONObject)localObject1, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          ((bth)localObject2).a((JSONObject)localObject1, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          ((bth)localObject2).a((JSONObject)localObject1, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
          continue;
          ((bth)localObject2).a((JSONObject)localObject1, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          ((bth)localObject2).a((JSONObject)localObject1, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
        }
        label580:
        this.f = null;
        String str;
        if (paramJSONObject.has("textTrackStyle"))
        {
          localObject1 = paramJSONObject.getJSONObject("textTrackStyle");
          localObject2 = new bty();
          ((bty)localObject2).a();
          ((bty)localObject2).a = ((float)((JSONObject)localObject1).optDouble("fontScale", 1.0D));
          ((bty)localObject2).b = bty.a(((JSONObject)localObject1).optString("foregroundColor"));
          ((bty)localObject2).c = bty.a(((JSONObject)localObject1).optString("backgroundColor"));
          if (((JSONObject)localObject1).has("edgeType"))
          {
            str = ((JSONObject)localObject1).getString("edgeType");
            if (!"NONE".equals(str)) {
              break label893;
            }
            ((bty)localObject2).d = 0;
          }
          ((bty)localObject2).e = bty.a(((JSONObject)localObject1).optString("edgeColor"));
          if (((JSONObject)localObject1).has("windowType"))
          {
            str = ((JSONObject)localObject1).getString("windowType");
            if (!"NONE".equals(str)) {
              break label973;
            }
            ((bty)localObject2).f = 0;
          }
          label745:
          ((bty)localObject2).g = bty.a(((JSONObject)localObject1).optString("windowColor"));
          if (((bty)localObject2).f == 2) {
            ((bty)localObject2).h = ((JSONObject)localObject1).optInt("windowRoundedCornerRadius", 0);
          }
          ((bty)localObject2).i = ((JSONObject)localObject1).optString("fontFamily", null);
          if (((JSONObject)localObject1).has("fontGenericFamily"))
          {
            str = ((JSONObject)localObject1).getString("fontGenericFamily");
            if (!"SANS_SERIF".equals(str)) {
              break label1013;
            }
            ((bty)localObject2).j = 0;
          }
          label830:
          if (((JSONObject)localObject1).has("fontStyle"))
          {
            str = ((JSONObject)localObject1).getString("fontStyle");
            if (!"NORMAL".equals(str)) {
              break label1134;
            }
            ((bty)localObject2).k = 0;
          }
        }
        for (;;)
        {
          ((bty)localObject2).l = ((JSONObject)localObject1).optJSONObject("customData");
          this.g = paramJSONObject.optJSONObject("customData");
          return;
          label893:
          if ("OUTLINE".equals(str))
          {
            ((bty)localObject2).d = 1;
            break;
          }
          if ("DROP_SHADOW".equals(str))
          {
            ((bty)localObject2).d = 2;
            break;
          }
          if ("RAISED".equals(str))
          {
            ((bty)localObject2).d = 3;
            break;
          }
          if (!"DEPRESSED".equals(str)) {
            break;
          }
          ((bty)localObject2).d = 4;
          break;
          label973:
          if ("NORMAL".equals(str))
          {
            ((bty)localObject2).f = 1;
            break label745;
          }
          if (!"ROUNDED_CORNERS".equals(str)) {
            break label745;
          }
          ((bty)localObject2).f = 2;
          break label745;
          label1013:
          if ("MONOSPACED_SANS_SERIF".equals(str))
          {
            ((bty)localObject2).j = 1;
            break label830;
          }
          if ("SERIF".equals(str))
          {
            ((bty)localObject2).j = 2;
            break label830;
          }
          if ("MONOSPACED_SERIF".equals(str))
          {
            ((bty)localObject2).j = 3;
            break label830;
          }
          if ("CASUAL".equals(str))
          {
            ((bty)localObject2).j = 4;
            break label830;
          }
          if ("CURSIVE".equals(str))
          {
            ((bty)localObject2).j = 5;
            break label830;
          }
          if (!"SMALL_CAPITALS".equals(str)) {
            break label830;
          }
          ((bty)localObject2).j = 6;
          break label830;
          label1134:
          if ("BOLD".equals(str)) {
            ((bty)localObject2).k = 1;
          } else if ("ITALIC".equals(str)) {
            ((bty)localObject2).k = 2;
          } else if ("BOLD_ITALIC".equals(str)) {
            ((bty)localObject2).k = 3;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramObject instanceof btg));
    paramObject = (btg)paramObject;
    int i;
    if (this.g == null)
    {
      i = 1;
      label39:
      if (((btg)paramObject).g != null) {
        break label185;
      }
    }
    label185:
    for (int j = 1;; j = 0)
    {
      bool1 = bool2;
      if (i != j) {
        break;
      }
      if ((this.g != null) && (((btg)paramObject).g != null))
      {
        bool1 = bool2;
        if (!cae.a(this.g, ((btg)paramObject).g)) {
          break;
        }
      }
      bool1 = bool2;
      if (!a.d(this.b, ((btg)paramObject).b)) {
        break;
      }
      bool1 = bool2;
      if (this.c != ((btg)paramObject).c) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.d, ((btg)paramObject).d)) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.a, ((btg)paramObject).a)) {
        break;
      }
      bool1 = bool2;
      if (this.e != ((btg)paramObject).e) {
        break;
      }
      bool1 = true;
      break;
      i = 0;
      break label39;
    }
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.b, Integer.valueOf(this.c), this.d, this.a, Long.valueOf(this.e), String.valueOf(this.g) });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */