import org.json.JSONArray;
import org.json.JSONObject;

public final class btj
{
  public long a;
  public btg b;
  public int c;
  public long d;
  private double e;
  private int f;
  private long g;
  private double h;
  private boolean i;
  private long[] j;
  
  public btj(JSONObject paramJSONObject)
  {
    a(paramJSONObject, 0);
  }
  
  public final int a(JSONObject paramJSONObject, int paramInt)
  {
    int i4 = 2;
    int i3 = 0;
    int i2 = 1;
    long l = paramJSONObject.getLong("mediaSessionId");
    if (l != this.a) {
      this.a = l;
    }
    for (int m = 1;; m = 0)
    {
      int n = m;
      Object localObject;
      int k;
      if (paramJSONObject.has("playerState"))
      {
        localObject = paramJSONObject.getString("playerState");
        if (!((String)localObject).equals("IDLE")) {
          break label465;
        }
        k = 1;
      }
      for (;;)
      {
        int i1 = m;
        if (k != this.c)
        {
          this.c = k;
          i1 = m | 0x2;
        }
        n = i1;
        if (k == 1)
        {
          n = i1;
          if (paramJSONObject.has("idleReason"))
          {
            localObject = paramJSONObject.getString("idleReason");
            if (!((String)localObject).equals("CANCELLED")) {
              break label513;
            }
            k = i4;
          }
        }
        for (;;)
        {
          label140:
          n = i1;
          if (k != this.f)
          {
            this.f = k;
            n = i1 | 0x2;
          }
          k = n;
          double d1;
          if (paramJSONObject.has("playbackRate"))
          {
            d1 = paramJSONObject.getDouble("playbackRate");
            k = n;
            if (this.e != d1)
            {
              this.e = d1;
              k = n | 0x2;
            }
          }
          n = k;
          if (paramJSONObject.has("currentTime"))
          {
            n = k;
            if ((paramInt & 0x2) == 0)
            {
              l = (paramJSONObject.getDouble("currentTime") * 1000.0D);
              n = k;
              if (l != this.g)
              {
                this.g = l;
                n = k | 0x2;
              }
            }
          }
          m = n;
          if (paramJSONObject.has("supportedMediaCommands"))
          {
            l = paramJSONObject.getLong("supportedMediaCommands");
            m = n;
            if (l != this.d)
            {
              this.d = l;
              m = n | 0x2;
            }
          }
          k = m;
          if (paramJSONObject.has("volume"))
          {
            k = m;
            if ((paramInt & 0x1) == 0)
            {
              localObject = paramJSONObject.getJSONObject("volume");
              d1 = ((JSONObject)localObject).getDouble("level");
              paramInt = m;
              if (d1 != this.h)
              {
                this.h = d1;
                paramInt = m | 0x2;
              }
              boolean bool = ((JSONObject)localObject).getBoolean("muted");
              k = paramInt;
              if (bool != this.i)
              {
                this.i = bool;
                k = paramInt | 0x2;
              }
            }
          }
          if (paramJSONObject.has("activeTrackIds"))
          {
            JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
            n = localJSONArray.length();
            localObject = new long[n];
            paramInt = 0;
            for (;;)
            {
              if (paramInt < n)
              {
                localObject[paramInt] = localJSONArray.getLong(paramInt);
                paramInt++;
                continue;
                label465:
                if (((String)localObject).equals("PLAYING"))
                {
                  k = 2;
                  break;
                }
                if (((String)localObject).equals("PAUSED"))
                {
                  k = 3;
                  break;
                }
                if (!((String)localObject).equals("BUFFERING")) {
                  break label768;
                }
                k = 4;
                break;
                label513:
                if (((String)localObject).equals("INTERRUPTED"))
                {
                  k = 3;
                  break label140;
                }
                if (((String)localObject).equals("FINISHED"))
                {
                  k = 1;
                  break label140;
                }
                if (!((String)localObject).equals("ERROR")) {
                  break label762;
                }
                k = 4;
                break label140;
              }
            }
            if (this.j == null) {
              paramInt = i2;
            }
          }
          for (;;)
          {
            if (paramInt != 0) {
              this.j = ((long[])localObject);
            }
            m = paramInt;
            for (;;)
            {
              paramInt = k;
              if (m != 0)
              {
                this.j = ((long[])localObject);
                paramInt = k | 0x2;
              }
              k = paramInt;
              if (paramJSONObject.has("customData"))
              {
                paramJSONObject.getJSONObject("customData");
                k = paramInt | 0x2;
              }
              paramInt = k;
              if (paramJSONObject.has("media"))
              {
                paramJSONObject = paramJSONObject.getJSONObject("media");
                this.b = new btg(paramJSONObject);
                k |= 0x2;
                paramInt = k;
                if (paramJSONObject.has("metadata")) {
                  paramInt = k | 0x4;
                }
              }
              return paramInt;
              paramInt = i2;
              if (this.j.length != n) {
                break;
              }
              for (m = 0;; m++)
              {
                if (m >= n) {
                  break label757;
                }
                paramInt = i2;
                if (this.j[m] != localObject[m]) {
                  break;
                }
              }
              if (this.j != null)
              {
                m = 1;
                localObject = null;
              }
              else
              {
                localObject = null;
                m = i3;
              }
            }
            label757:
            paramInt = 0;
          }
          label762:
          k = 0;
        }
        label768:
        k = 0;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\btj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */