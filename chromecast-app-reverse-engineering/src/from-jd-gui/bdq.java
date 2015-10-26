import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdq
  extends bfp
{
  public final bdf a;
  String b;
  private final int j;
  private final int k;
  
  public bdq(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString);
    this.j = paramInt1;
    this.k = paramInt2;
    this.a = new bdf();
  }
  
  private void a(String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    String str = null;
    if (paramString == null)
    {
      this.a.I = null;
      return;
    }
    if (paramJSONObject != null) {}
    for (paramJSONObject = paramJSONObject.optJSONObject("timezone");; paramJSONObject = null)
    {
      if (paramJSONObject != null)
      {
        str = paramJSONObject.optString("display_string", null);
        i = paramJSONObject.optInt("offset", 0);
      }
      this.a.I = new bdb(paramString, str, i);
      break;
    }
  }
  
  private void a(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optJSONObject("multizone");
    if (paramJSONObject == null) {}
    for (;;)
    {
      return;
      this.a.S = paramJSONObject.optInt("audio_output_delay");
      paramJSONObject = paramJSONObject.optJSONArray("groups");
      if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
      {
        bcx[] arrayOfbcx = new bcx[paramJSONObject.length()];
        for (int i = 0; i < paramJSONObject.length(); i++)
        {
          JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
          arrayOfbcx[i] = new bcx(localJSONObject.optString("uuid", null), localJSONObject.optString("name", null), localJSONObject.optString("leader", null));
        }
        this.a.T = arrayOfbcx;
      }
    }
  }
  
  private void b(String paramString, JSONObject paramJSONObject)
  {
    Object localObject2 = null;
    if (paramString == null) {}
    Object localObject1;
    for (this.a.K = null;; this.a.K = new bcz(paramString, (String)localObject1))
    {
      return;
      localObject1 = localObject2;
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.optJSONObject("locale");
        localObject1 = localObject2;
        if (paramJSONObject != null) {
          localObject1 = paramJSONObject.optString("display_string", null);
        }
      }
    }
  }
  
  private void b(JSONObject paramJSONObject)
  {
    int i = 0;
    Object localObject1 = paramJSONObject.optJSONObject("sign");
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      String str = ((JSONObject)localObject1).optString("certificate", null);
      paramJSONObject = ((JSONObject)localObject1).optString("nonce", null);
      Object localObject2 = ((JSONObject)localObject1).optString("signed_data", null);
      if ((str != null) && (paramJSONObject != null) && (localObject2 != null))
      {
        localObject1 = ((JSONObject)localObject1).optJSONArray("intermediate_certs");
        localObject2 = Base64.decode(((String)localObject2).getBytes(), 0);
        this.a.U = new bcv(str, paramJSONObject, (byte[])localObject2);
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          paramJSONObject = new String[((JSONArray)localObject1).length()];
          while (i < ((JSONArray)localObject1).length())
          {
            paramJSONObject[i] = ((JSONArray)localObject1).optString(i, null);
            i++;
          }
          this.a.V = paramJSONObject;
        }
      }
    }
  }
  
  public final int a()
  {
    ArrayList localArrayList = new ArrayList();
    if ((this.k == 0) || (this.k >= 7))
    {
      localArrayList.add("version");
      if ((this.j & 0x2) != 0) {
        localArrayList.add("name");
      }
      if ((this.j & 0x4) != 0) {
        localArrayList.add("build_info");
      }
      if ((this.j & 0x8) != 0) {
        localArrayList.add("device_info");
      }
      if ((this.j & 0x10) != 0) {
        localArrayList.add("ota_status");
      }
      if ((this.j & 0x20) != 0) {
        localArrayList.add("net");
      }
      if ((this.j & 0x40) != 0) {
        localArrayList.add("wifi");
      }
      if ((this.j & 0x80) != 0) {
        localArrayList.add("setup");
      }
      if ((this.j & 0x100) != 0) {
        localArrayList.add("settings");
      }
      if ((this.j & 0x200) != 0) {
        localArrayList.add("opt_in");
      }
      if ((this.j & 0x400) != 0) {
        localArrayList.add("opencast");
      }
      if ((this.j & 0x800) != 0) {
        localArrayList.add("multizone");
      }
      if ((this.j & 0x1000) != 0) {
        localArrayList.add("sign");
      }
      if ((this.j & 0x2000) != 0) {
        localArrayList.add("detail");
      }
    }
    Object localObject4 = new ArrayList(2);
    if ((this.k == 0) || (this.k < 7))
    {
      if (((this.j & 0x8) != 0) || ((this.j & 0x2000) != 0) || ((this.j & 0x100) != 0)) {
        ((ArrayList)localObject4).add("detail");
      }
      if ((this.j & 0x1000) != 0) {
        ((ArrayList)localObject4).add("sign");
      }
    }
    Object localObject3 = new StringBuilder();
    Object localObject1;
    if (!localArrayList.isEmpty())
    {
      localObject1 = String.valueOf(TextUtils.join(",", localArrayList));
      if (((String)localObject1).length() != 0)
      {
        localObject1 = "params=".concat((String)localObject1);
        ((StringBuilder)localObject3).append((String)localObject1);
      }
    }
    else
    {
      if (!((ArrayList)localObject4).isEmpty())
      {
        if (!localArrayList.isEmpty()) {
          ((StringBuilder)localObject3).append("&");
        }
        localObject1 = String.valueOf(TextUtils.join(",", (Iterable)localObject4));
        if (((String)localObject1).length() == 0) {
          break label534;
        }
        localObject1 = "options=".concat((String)localObject1);
        label447:
        ((StringBuilder)localObject3).append((String)localObject1);
      }
      localObject3 = ((StringBuilder)localObject3).toString();
      if (this.b == null) {
        break label2066;
      }
      localObject1 = new HashMap(1);
      ((Map)localObject1).put("Accept-Language", this.b);
    }
    for (;;)
    {
      int i;
      try
      {
        localObject1 = a("eureka_info", (String)localObject3, (Map)localObject1, c);
        i = ((bfq)localObject1).b();
        if (i == 200) {
          continue;
        }
        i = -1;
      }
      catch (IOException localIOException)
      {
        i = -1;
        continue;
      }
      catch (TimeoutException localTimeoutException)
      {
        i = -2;
        continue;
        localObject3 = localTimeoutException.a();
        if (localObject3 != null) {
          break label608;
        }
        i = -3;
        continue;
      }
      return i;
      localObject1 = new String("params=");
      break;
      label534:
      localObject1 = new String("options=");
      break label447;
      localObject1 = ((bfq)localObject1).c();
      if ((localObject1 == null) || (!"application/json".equals(((bfc)localObject1).b)))
      {
        i = -3;
      }
      else
      {
        try
        {
          label608:
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>((String)localObject3);
          i = localJSONObject.optInt("version", 0);
          this.a.a = i;
          this.a.b = localJSONObject.optString("name", null);
          if (i < 7)
          {
            this.a.n = localJSONObject.optString("ssdp_udn", null);
            this.a.c = localJSONObject.optString("build_version", null);
            this.a.d = localJSONObject.optString("build_version", null);
            this.a.m = ((localJSONObject.optDouble("uptime", 0.0D) * 1000.0D));
            this.a.s = localJSONObject.optBoolean("has_update", false);
            this.a.u = localJSONObject.optString("ip_address");
            this.a.p = localJSONObject.getString("mac_address");
            this.a.v = localJSONObject.optBoolean("connected", false);
            this.a.w = localJSONObject.optBoolean("ethernet_connected", false);
            this.a.E = localJSONObject.optBoolean("tos_accepted", false);
            this.a.x = localJSONObject.optString("bssid");
            this.a.y = localJSONObject.optString("ssid");
            this.a.a(localJSONObject.optString("hotspot_bssid"));
            this.a.z = bdl.a(localJSONObject.optInt("wpa_state", bdl.a.b));
            this.a.G = bdj.a(localJSONObject.optInt("setup_state", bdj.a.r));
            this.a.A = localJSONObject.optBoolean("wpa_configured", false);
            this.a.B = localJSONObject.optInt("wpa_id", 0);
            this.a.C = localJSONObject.optInt("signal_level", 0);
            this.a.D = localJSONObject.optInt("noise_level", 0);
            this.a.r = localJSONObject.optString("public_key", null);
            this.a.J = bdk.a(localJSONObject.optInt("time_format", bdk.a.c));
            this.a.R = localJSONObject.optString("opencast_pin_code", null);
            localObject3 = localJSONObject.optJSONObject("detail");
            localObject4 = localJSONObject.optString("locale", null);
            a(localJSONObject.optString("timezone", null), (JSONObject)localObject3);
            b((String)localObject4, (JSONObject)localObject3);
            if ((localObject3 != null) && (((JSONObject)localObject3).has("model_name"))) {
              this.a.g = ((JSONObject)localObject3).getString("model_name");
            }
            if (localJSONObject.has("location"))
            {
              localObject3 = localJSONObject.getJSONObject("location").optString("country_code");
              this.a.L = ((String)localObject3);
            }
            b(localJSONObject);
            boolean bool;
            if (localJSONObject.has("opt_in"))
            {
              localObject4 = localJSONObject.getJSONObject("opt_in");
              localObject3 = this.a;
              if ((!((JSONObject)localObject4).optBoolean("stats", false)) && (!((JSONObject)localObject4).optBoolean("crash", false))) {
                break label1239;
              }
              bool = true;
              label1154:
              ((bdf)localObject3).O = bool;
              this.a.Q = ((JSONObject)localObject4).optBoolean("device_id", false);
              if (!((JSONObject)localObject4).has("opencast")) {
                break label1245;
              }
            }
            label1239:
            label1245:
            for (this.a.P = Boolean.valueOf(((JSONObject)localObject4).optBoolean("opencast", false));; this.a.P = null)
            {
              if (localJSONObject.has("setup_stats"))
              {
                localJSONObject = localJSONObject.getJSONObject("setup_stats");
                this.a.H = localJSONObject.optInt("num_initial_eureka_info");
              }
              i = 0;
              break;
              bool = false;
              break label1154;
            }
          }
        }
        catch (JSONException localJSONException)
        {
          i = -3;
        }
        localObject3 = localJSONException.optJSONObject("build_info");
        if (localObject3 != null)
        {
          this.a.c = ((JSONObject)localObject3).optString("cast_build_revision", null);
          this.a.d = ((JSONObject)localObject3).optString("system_build_number", null);
          this.a.e = ((JSONObject)localObject3).optString("release_track", null);
        }
        localObject3 = localJSONException.optJSONObject("device_info");
        if (localObject3 != null)
        {
          this.a.f = ((JSONObject)localObject3).optString("manufacturer", null);
          this.a.g = ((JSONObject)localObject3).optString("model_name", null);
          localObject4 = ((JSONObject)localObject3).optJSONObject("capabilities");
          if (localObject4 != null)
          {
            this.a.h = ((JSONObject)localObject4).optBoolean("display_supported", true);
            this.a.i = ((JSONObject)localObject4).optBoolean("wifi_supported", true);
            this.a.j = ((JSONObject)localObject4).optBoolean("hotspot_supported", true);
            this.a.k = ((JSONObject)localObject4).optBoolean("ble_supported", false);
            this.a.l = ((JSONObject)localObject4).optBoolean("multizone_supported", false);
          }
          this.a.m = ((((JSONObject)localObject3).optDouble("uptime", 0.0D) * 1000.0D));
          this.a.n = ((JSONObject)localObject3).optString("ssdp_udn", null);
          this.a.o = ((JSONObject)localObject3).optString("uma_client_id", null);
          this.a.p = ((JSONObject)localObject3).getString("mac_address");
          this.a.a(((JSONObject)localObject3).optString("hotspot_bssid"));
          this.a.r = ((JSONObject)localObject3).optString("public_key", null);
        }
        localObject3 = localJSONException.optJSONObject("ota_status");
        if (localObject3 != null)
        {
          this.a.s = ((JSONObject)localObject3).optBoolean("ready_to_apply", false);
          this.a.t = ((JSONObject)localObject3).optInt("download_progress", 0);
        }
        localObject3 = localJSONException.optJSONObject("net");
        if (localObject3 != null)
        {
          this.a.u = ((JSONObject)localObject3).optString("ip_address");
          this.a.v = ((JSONObject)localObject3).optBoolean("online", false);
          this.a.w = ((JSONObject)localObject3).optBoolean("ethernet_connected", false);
        }
        localObject3 = localJSONException.optJSONObject("wifi");
        if (localObject3 != null)
        {
          this.a.x = ((JSONObject)localObject3).optString("bssid");
          this.a.y = ((JSONObject)localObject3).optString("ssid");
          this.a.z = bdl.a(((JSONObject)localObject3).optInt("wpa_state", bdl.a.b));
          this.a.A = ((JSONObject)localObject3).optBoolean("wpa_configured", false);
          this.a.B = ((JSONObject)localObject3).optInt("wpa_id", 0);
          this.a.C = ((JSONObject)localObject3).optInt("signal_level", 0);
          this.a.D = ((JSONObject)localObject3).optInt("noise_level", 0);
        }
        localObject3 = localJSONException.optJSONObject("setup");
        if (localObject3 != null)
        {
          this.a.E = ((JSONObject)localObject3).optBoolean("tos_accepted", false);
          this.a.F = ((JSONObject)localObject3).optString("ssid_suffix");
          this.a.G = bdj.a(((JSONObject)localObject3).optInt("setup_state", bdj.a.r));
          if (((JSONObject)localObject3).has("stats"))
          {
            localObject3 = ((JSONObject)localObject3).getJSONObject("stats");
            this.a.H = ((JSONObject)localObject3).optInt("num_initial_eureka_info");
          }
        }
        localObject4 = localJSONException.optJSONObject("detail");
        localObject3 = localJSONException.optJSONObject("settings");
        if (localObject3 != null)
        {
          a(((JSONObject)localObject3).optString("timezone", null), (JSONObject)localObject4);
          this.a.J = bdk.a(((JSONObject)localObject3).optInt("time_format", bdk.a.c));
          b(((JSONObject)localObject3).optString("locale", null), (JSONObject)localObject4);
          this.a.L = ((JSONObject)localObject3).optString("country_code", null);
          this.a.M = ((JSONObject)localObject3).optBoolean("system_sound_effects", false);
        }
        localObject3 = localJSONException.optJSONObject("opt_in");
        if (localObject3 != null)
        {
          this.a.N = ((JSONObject)localObject3).optBoolean("audio_hdr", false);
          this.a.O = ((JSONObject)localObject3).optBoolean("stats", false);
          if (!((JSONObject)localObject3).has("opencast")) {
            break label2055;
          }
        }
        label2055:
        for (this.a.P = Boolean.valueOf(((JSONObject)localObject3).optBoolean("opencast", false));; this.a.P = null)
        {
          localObject3 = localJSONException.optJSONObject("opencast");
          if (localObject3 != null) {
            this.a.R = ((JSONObject)localObject3).optString("pin_code", null);
          }
          a(localJSONException);
          b(localJSONException);
          break;
        }
        label2066:
        Object localObject2 = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */