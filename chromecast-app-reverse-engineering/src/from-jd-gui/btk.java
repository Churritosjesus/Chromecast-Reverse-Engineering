import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class btk
{
  private long a = 0L;
  private int b = 0;
  private String c = null;
  private String d;
  private String e = null;
  private String f = null;
  private int g = -1;
  private JSONObject h = null;
  
  btk(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.getLong("trackId");
    String str = paramJSONObject.getString("type");
    if ("TEXT".equals(str))
    {
      this.b = 1;
      this.c = paramJSONObject.optString("trackContentId", null);
      this.d = paramJSONObject.optString("trackContentType", null);
      this.e = paramJSONObject.optString("name", null);
      this.f = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype")) {
        break label305;
      }
      str = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str)) {
        break label213;
      }
      this.g = 1;
    }
    for (;;)
    {
      this.h = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str))
      {
        this.b = 2;
        break;
      }
      if ("VIDEO".equals(str))
      {
        this.b = 3;
        break;
      }
      throw new JSONException("invalid type: " + str);
      label213:
      if ("CAPTIONS".equals(str))
      {
        this.g = 2;
      }
      else if ("DESCRIPTIONS".equals(str))
      {
        this.g = 3;
      }
      else if ("CHAPTERS".equals(str))
      {
        this.g = 4;
      }
      else if ("METADATA".equals(str))
      {
        this.g = 5;
      }
      else
      {
        throw new JSONException("invalid subtype: " + str);
        label305:
        this.g = 0;
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
    } while (!(paramObject instanceof btk));
    paramObject = (btk)paramObject;
    int i;
    if (this.h == null)
    {
      i = 1;
      label39:
      if (((btk)paramObject).h != null) {
        break label218;
      }
    }
    label218:
    for (int j = 1;; j = 0)
    {
      bool1 = bool2;
      if (i != j) {
        break;
      }
      if ((this.h != null) && (((btk)paramObject).h != null))
      {
        bool1 = bool2;
        if (!cae.a(this.h, ((btk)paramObject).h)) {
          break;
        }
      }
      bool1 = bool2;
      if (this.a != ((btk)paramObject).a) {
        break;
      }
      bool1 = bool2;
      if (this.b != ((btk)paramObject).b) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.c, ((btk)paramObject).c)) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.d, ((btk)paramObject).d)) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.e, ((btk)paramObject).e)) {
        break;
      }
      bool1 = bool2;
      if (!a.d(this.f, ((btk)paramObject).f)) {
        break;
      }
      bool1 = bool2;
      if (this.g != ((btk)paramObject).g) {
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
    return Arrays.hashCode(new Object[] { Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h });
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */