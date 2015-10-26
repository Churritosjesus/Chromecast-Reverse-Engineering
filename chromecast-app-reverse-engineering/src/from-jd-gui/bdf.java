import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public class bdf
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bdg();
  boolean A;
  int B;
  int C;
  int D;
  public boolean E;
  public String F;
  public bdj G;
  public int H;
  public bdb I;
  public bdk J;
  public bcz K;
  public String L;
  public boolean M;
  public boolean N;
  public boolean O;
  public Boolean P;
  public boolean Q;
  public String R;
  int S;
  bcx[] T;
  public bcv U;
  public String[] V;
  public ArrayList W;
  public ArrayList X;
  private final blp Y = new blp("DeviceConfiguration", false);
  public int a;
  public String b;
  public String c;
  String d;
  String e;
  String f;
  public String g;
  public boolean h = true;
  public boolean i = true;
  public boolean j = true;
  public boolean k;
  public boolean l;
  public long m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String r;
  public boolean s;
  public int t;
  public String u;
  boolean v;
  public boolean w;
  String x;
  public String y;
  bdl z;
  
  public bdf() {}
  
  public bdf(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = ((String)paramParcel.readValue(null));
    this.c = ((String)paramParcel.readValue(null));
    this.d = ((String)paramParcel.readValue(null));
    this.e = ((String)paramParcel.readValue(null));
    this.f = ((String)paramParcel.readValue(null));
    this.g = ((String)paramParcel.readValue(null));
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.h = bool1;
      if (paramParcel.readInt() == 0) {
        break label645;
      }
      bool1 = true;
      label138:
      this.i = bool1;
      if (paramParcel.readInt() == 0) {
        break label650;
      }
      bool1 = true;
      label152:
      this.j = bool1;
      if (paramParcel.readInt() == 0) {
        break label655;
      }
      bool1 = true;
      label166:
      this.k = bool1;
      if (paramParcel.readInt() == 0) {
        break label660;
      }
      bool1 = true;
      label180:
      this.l = bool1;
      this.m = paramParcel.readLong();
      this.n = ((String)paramParcel.readValue(null));
      this.o = ((String)paramParcel.readValue(null));
      this.p = ((String)paramParcel.readValue(null));
      this.q = ((String)paramParcel.readValue(null));
      this.r = ((String)paramParcel.readValue(null));
      if (paramParcel.readInt() == 0) {
        break label665;
      }
      bool1 = true;
      label262:
      this.s = bool1;
      this.t = paramParcel.readInt();
      this.u = ((String)paramParcel.readValue(null));
      if (paramParcel.readInt() == 0) {
        break label670;
      }
      bool1 = true;
      label296:
      this.v = bool1;
      if (paramParcel.readInt() == 0) {
        break label675;
      }
      bool1 = true;
      label310:
      this.w = bool1;
      this.x = ((String)paramParcel.readValue(null));
      this.y = ((String)paramParcel.readValue(null));
      this.z = ((bdl)paramParcel.readValue(null));
      if (paramParcel.readInt() == 0) {
        break label680;
      }
      bool1 = true;
      label360:
      this.A = bool1;
      this.B = paramParcel.readInt();
      this.C = paramParcel.readInt();
      this.D = paramParcel.readInt();
      if (paramParcel.readInt() == 0) {
        break label685;
      }
      bool1 = true;
      label398:
      this.E = bool1;
      this.F = ((String)paramParcel.readValue(null));
      this.G = ((bdj)paramParcel.readValue(null));
      this.H = paramParcel.readInt();
      this.I = ((bdb)paramParcel.readParcelable(bdf.class.getClassLoader()));
      this.J = ((bdk)paramParcel.readValue(null));
      this.K = ((bcz)paramParcel.readParcelable(bdf.class.getClassLoader()));
      this.L = ((String)paramParcel.readValue(null));
      if (paramParcel.readInt() == 0) {
        break label690;
      }
      bool1 = true;
      label500:
      this.M = bool1;
      if (paramParcel.readInt() == 0) {
        break label695;
      }
      bool1 = true;
      label514:
      this.N = bool1;
      if (paramParcel.readInt() == 0) {
        break label700;
      }
      bool1 = true;
      label528:
      this.O = bool1;
      this.P = ((Boolean)paramParcel.readValue(null));
      if (paramParcel.readInt() == 0) {
        break label705;
      }
    }
    label645:
    label650:
    label655:
    label660:
    label665:
    label670:
    label675:
    label680:
    label685:
    label690:
    label695:
    label700:
    label705:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.Q = bool1;
      this.R = ((String)paramParcel.readValue(null));
      this.S = paramParcel.readInt();
      this.T = ((bcx[])paramParcel.createTypedArray(bcx.CREATOR));
      this.U = ((bcv)paramParcel.readParcelable(bdf.class.getClassLoader()));
      this.V = paramParcel.createStringArray();
      this.W = paramParcel.createTypedArrayList(bdb.CREATOR);
      this.X = paramParcel.createTypedArrayList(bcz.CREATOR);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label138;
      bool1 = false;
      break label152;
      bool1 = false;
      break label166;
      bool1 = false;
      break label180;
      bool1 = false;
      break label262;
      bool1 = false;
      break label296;
      bool1 = false;
      break label310;
      bool1 = false;
      break label360;
      bool1 = false;
      break label398;
      bool1 = false;
      break label500;
      bool1 = false;
      break label514;
      bool1 = false;
      break label528;
    }
  }
  
  private static void a(ArrayList paramArrayList, String paramString, int paramInt)
  {
    if (paramInt != 0) {
      paramArrayList.add(String.valueOf(paramString).length() + 13 + paramString + ": " + paramInt);
    }
  }
  
  private static void a(ArrayList paramArrayList, String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      paramArrayList.add(String.valueOf(paramString1).length() + 2 + String.valueOf(paramString2).length() + paramString1 + ": " + paramString2);
    }
  }
  
  private static void a(ArrayList paramArrayList, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramArrayList.add(String.valueOf(paramString).length() + 7 + paramString + ": " + paramBoolean);
    }
  }
  
  public final int a()
  {
    try
    {
      i1 = Integer.valueOf(this.d).intValue();
      return i1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str = this.d;
        int i1 = -1;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;) {}
    }
  }
  
  public final void a(String paramString)
  {
    if (paramString != null) {}
    for (this.q = paramString.toUpperCase();; this.q = null) {
      return;
    }
  }
  
  public final int b()
  {
    int i1;
    if (!TextUtils.isEmpty(this.F))
    {
      i1 = 1;
      if (i1 == 0) {
        break label106;
      }
      switch (this.F.charAt(0))
      {
      default: 
        i1 = bdi.f;
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      break;
      i1 = bdi.a;
      continue;
      i1 = bdi.b;
      continue;
      i1 = bdi.c;
      continue;
      i1 = bdi.d;
      continue;
      i1 = bdi.e;
      continue;
      label106:
      i1 = bdi.c;
    }
  }
  
  public final boolean c()
  {
    if (this.P == Boolean.TRUE) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean d()
  {
    int i1 = a();
    if ((i1 == -1) || (i1 >= 15339)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean e()
  {
    int i1 = a();
    if ((this.P != null) && ((i1 >= 20249) || (i1 == -1))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String toString()
  {
    Object localObject2 = null;
    ArrayList localArrayList = new ArrayList();
    a(localArrayList, "version", this.a);
    a(localArrayList, "name", this.b);
    a(localArrayList, "cast_build_revision", this.c);
    a(localArrayList, "system_build_number", this.d);
    a(localArrayList, "release_track", this.e);
    a(localArrayList, "manufacturer", this.f);
    a(localArrayList, "model_name", this.g);
    a(localArrayList, "display_supported", this.h);
    a(localArrayList, "wifi_supported", this.i);
    a(localArrayList, "hotspot_supported", this.j);
    a(localArrayList, "ble_supported", this.k);
    a(localArrayList, "multizone_supported", this.l);
    long l1 = this.m;
    if (l1 != 0L) {
      localArrayList.add(String.valueOf("uptime").length() + 22 + "uptime" + ": " + l1);
    }
    a(localArrayList, "ssdp_udn", this.n);
    a(localArrayList, "uma_client_id", this.o);
    a(localArrayList, "mac_address", this.p);
    a(localArrayList, "hotspot_bssid", this.q);
    a(localArrayList, "public_key", this.r);
    a(localArrayList, "ready_to_apply", this.s);
    a(localArrayList, "download_progress", this.t);
    a(localArrayList, "ip_address", this.u);
    a(localArrayList, "online", this.v);
    a(localArrayList, "ethernet_connected", this.w);
    a(localArrayList, "bssid", this.x);
    a(localArrayList, "ssid", this.y);
    a(localArrayList, "wpa_state", String.valueOf(this.z));
    a(localArrayList, "wpa_configured", this.A);
    a(localArrayList, "wpa_id", this.B);
    a(localArrayList, "signal_level", this.C);
    a(localArrayList, "noise_level", this.D);
    a(localArrayList, "tos_accepted", this.E);
    a(localArrayList, "ssid_suffix", this.F);
    a(localArrayList, "setup_state", String.valueOf(this.G));
    a(localArrayList, "num_initial_eureka_info", this.H);
    Object localObject1 = this.I;
    if (localObject1 != null)
    {
      localObject1 = ((bdb)localObject1).toString();
      a(localArrayList, "timezone", (String)localObject1);
      a(localArrayList, "time_format", String.valueOf(this.J));
      localObject1 = this.K;
      if (localObject1 == null) {
        break label718;
      }
    }
    label718:
    for (localObject1 = ((bcz)localObject1).toString();; localObject1 = null)
    {
      a(localArrayList, "locale", (String)localObject1);
      a(localArrayList, "country_code", this.L);
      a(localArrayList, "system_sound_effects", this.M);
      a(localArrayList, "audio_hdr", this.N);
      a(localArrayList, "stats", this.O);
      a(localArrayList, "opencast", c());
      a(localArrayList, "device_id", this.Q);
      a(localArrayList, "pin_code", this.R);
      a(localArrayList, "audio_output_delay", this.S);
      if (this.T != null) {
        a(localArrayList, "groups", TextUtils.join(",", this.T));
      }
      bcv localbcv = this.U;
      localObject1 = localObject2;
      if (localbcv != null) {
        localObject1 = localbcv.toString();
      }
      a(localArrayList, "certificate", (String)localObject1);
      if (this.V != null) {
        a(localArrayList, "intermediate_certs", TextUtils.join(",", this.V));
      }
      if ((this.W == null) || (this.W.isEmpty())) {
        break label723;
      }
      localObject1 = this.W.iterator();
      while (((Iterator)localObject1).hasNext()) {
        a(localArrayList, "supportedTimeZone", ((bdb)((Iterator)localObject1).next()).toString());
      }
      localObject1 = null;
      break;
    }
    label723:
    if ((this.X != null) && (!this.X.isEmpty()))
    {
      localObject1 = this.X.iterator();
      while (((Iterator)localObject1).hasNext()) {
        a(localArrayList, "supportedLocale", ((bcz)((Iterator)localObject1).next()).toString());
      }
    }
    return TextUtils.join("\n", localArrayList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i2 = 1;
    paramParcel.writeInt(this.a);
    paramParcel.writeValue(this.b);
    paramParcel.writeValue(this.c);
    paramParcel.writeValue(this.d);
    paramParcel.writeValue(this.e);
    paramParcel.writeValue(this.f);
    paramParcel.writeValue(this.g);
    if (this.h)
    {
      i1 = 1;
      paramParcel.writeInt(i1);
      if (!this.i) {
        break label498;
      }
      i1 = 1;
      label82:
      paramParcel.writeInt(i1);
      if (!this.j) {
        break label503;
      }
      i1 = 1;
      label96:
      paramParcel.writeInt(i1);
      if (!this.k) {
        break label508;
      }
      i1 = 1;
      label110:
      paramParcel.writeInt(i1);
      if (!this.l) {
        break label513;
      }
      i1 = 1;
      label124:
      paramParcel.writeInt(i1);
      paramParcel.writeLong(this.m);
      paramParcel.writeValue(this.n);
      paramParcel.writeValue(this.o);
      paramParcel.writeValue(this.p);
      paramParcel.writeValue(this.q);
      paramParcel.writeValue(this.r);
      if (!this.s) {
        break label518;
      }
      i1 = 1;
      label186:
      paramParcel.writeInt(i1);
      paramParcel.writeInt(this.t);
      paramParcel.writeValue(this.u);
      if (!this.v) {
        break label523;
      }
      i1 = 1;
      label216:
      paramParcel.writeInt(i1);
      if (!this.w) {
        break label528;
      }
      i1 = 1;
      label230:
      paramParcel.writeInt(i1);
      paramParcel.writeValue(this.x);
      paramParcel.writeValue(this.y);
      paramParcel.writeValue(this.z);
      if (!this.A) {
        break label533;
      }
      i1 = 1;
      label268:
      paramParcel.writeInt(i1);
      paramParcel.writeInt(this.B);
      paramParcel.writeInt(this.C);
      paramParcel.writeInt(this.D);
      if (!this.E) {
        break label538;
      }
      i1 = 1;
      label306:
      paramParcel.writeInt(i1);
      paramParcel.writeValue(this.F);
      paramParcel.writeValue(this.G);
      paramParcel.writeInt(this.H);
      paramParcel.writeParcelable(this.I, paramInt);
      paramParcel.writeValue(this.J);
      paramParcel.writeParcelable(this.K, paramInt);
      paramParcel.writeValue(this.L);
      if (!this.M) {
        break label543;
      }
      i1 = 1;
      label378:
      paramParcel.writeInt(i1);
      if (!this.N) {
        break label548;
      }
      i1 = 1;
      label392:
      paramParcel.writeInt(i1);
      if (!this.O) {
        break label553;
      }
      i1 = 1;
      label406:
      paramParcel.writeInt(i1);
      paramParcel.writeValue(this.P);
      if (!this.Q) {
        break label558;
      }
    }
    label498:
    label503:
    label508:
    label513:
    label518:
    label523:
    label528:
    label533:
    label538:
    label543:
    label548:
    label553:
    label558:
    for (int i1 = i2;; i1 = 0)
    {
      paramParcel.writeInt(i1);
      paramParcel.writeValue(this.R);
      paramParcel.writeInt(this.S);
      paramParcel.writeTypedArray(this.T, paramInt);
      paramParcel.writeParcelable(this.U, paramInt);
      paramParcel.writeStringArray(this.V);
      paramParcel.writeTypedList(this.W);
      paramParcel.writeTypedList(this.X);
      return;
      i1 = 0;
      break;
      i1 = 0;
      break label82;
      i1 = 0;
      break label96;
      i1 = 0;
      break label110;
      i1 = 0;
      break label124;
      i1 = 0;
      break label186;
      i1 = 0;
      break label216;
      i1 = 0;
      break label230;
      i1 = 0;
      break label268;
      i1 = 0;
      break label306;
      i1 = 0;
      break label378;
      i1 = 0;
      break label392;
      i1 = 0;
      break label406;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */