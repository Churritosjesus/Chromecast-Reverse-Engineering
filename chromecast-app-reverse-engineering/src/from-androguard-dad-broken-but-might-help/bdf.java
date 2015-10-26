	public static final android.os.Parcelable$Creator CREATOR
	  A
	  B
	  C
	  D
	public  E
	public java.lang.String F
	public bdj G
	public  H
	public bdb I
	public bdk J
	public bcz K
	public java.lang.String L
	public  M
	public  N
	public  O
	public java.lang.Boolean P
	public  Q
	public java.lang.String R
	  S
	 Lbcx T
	public bcv U
	public Ljava.lang.String V
	public java.util.ArrayList W
	public java.util.ArrayList X
	private final blp Y
	public  a
	public java.lang.String b
	public java.lang.String c
	 java.lang.String d
	 java.lang.String e
	 java.lang.String f
	public java.lang.String g
	public  h
	public  i
	public  j
	public  k
	public  l
	public  m
	public java.lang.String n
	public java.lang.String o
	public java.lang.String p
	public java.lang.String q
	public java.lang.String r
	public  s
	public  t
	public java.lang.String u
	  v
	public  w
	 java.lang.String x
	public java.lang.String y
	 bdl z
	
	    static bdf()
	    {
	        bdf.CREATOR = new bdg();
	        return;
	    }
	
	
	    public bdf()
	    {
	        this.Y = new blp("DeviceConfiguration", 0);
	        this.h = 1;
	        this.i = 1;
	        this.j = 1;
	        return;
	    }
	
	
	    public bdf(android.os.Parcel p8)
	    {
	        java.util.ArrayList v0_16;
	        int v1 = 1;
	        this.Y = new blp("DeviceConfiguration", 0);
	        this.h = 1;
	        this.i = 1;
	        this.j = 1;
	        this.a = p8.readInt();
	        this.b = ((String) p8.readValue(0));
	        this.c = ((String) p8.readValue(0));
	        this.d = ((String) p8.readValue(0));
	        this.e = ((String) p8.readValue(0));
	        this.f = ((String) p8.readValue(0));
	        this.g = ((String) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v0_16 = 0;
	        } else {
	            v0_16 = 1;
	        }
	        java.util.ArrayList v0_18;
	        this.h = v0_16;
	        if (p8.readInt() == 0) {
	            v0_18 = 0;
	        } else {
	            v0_18 = 1;
	        }
	        java.util.ArrayList v0_20;
	        this.i = v0_18;
	        if (p8.readInt() == 0) {
	            v0_20 = 0;
	        } else {
	            v0_20 = 1;
	        }
	        java.util.ArrayList v0_22;
	        this.j = v0_20;
	        if (p8.readInt() == 0) {
	            v0_22 = 0;
	        } else {
	            v0_22 = 1;
	        }
	        java.util.ArrayList v0_24;
	        this.k = v0_22;
	        if (p8.readInt() == 0) {
	            v0_24 = 0;
	        } else {
	            v0_24 = 1;
	        }
	        java.util.ArrayList v0_36;
	        this.l = v0_24;
	        this.m = p8.readLong();
	        this.n = ((String) p8.readValue(0));
	        this.o = ((String) p8.readValue(0));
	        this.p = ((String) p8.readValue(0));
	        this.q = ((String) p8.readValue(0));
	        this.r = ((String) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v0_36 = 0;
	        } else {
	            v0_36 = 1;
	        }
	        java.util.ArrayList v0_41;
	        this.s = v0_36;
	        this.t = p8.readInt();
	        this.u = ((String) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v0_41 = 0;
	        } else {
	            v0_41 = 1;
	        }
	        java.util.ArrayList v0_43;
	        this.v = v0_41;
	        if (p8.readInt() == 0) {
	            v0_43 = 0;
	        } else {
	            v0_43 = 1;
	        }
	        java.util.ArrayList v0_51;
	        this.w = v0_43;
	        this.x = ((String) p8.readValue(0));
	        this.y = ((String) p8.readValue(0));
	        this.z = ((bdl) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v0_51 = 0;
	        } else {
	            v0_51 = 1;
	        }
	        java.util.ArrayList v0_56;
	        this.A = v0_51;
	        this.B = p8.readInt();
	        this.C = p8.readInt();
	        this.D = p8.readInt();
	        if (p8.readInt() == 0) {
	            v0_56 = 0;
	        } else {
	            v0_56 = 1;
	        }
	        java.util.ArrayList v0_75;
	        this.E = v0_56;
	        this.F = ((String) p8.readValue(0));
	        this.G = ((bdj) p8.readValue(0));
	        this.H = p8.readInt();
	        this.I = ((bdb) p8.readParcelable(bdf.getClassLoader()));
	        this.J = ((bdk) p8.readValue(0));
	        this.K = ((bcz) p8.readParcelable(bdf.getClassLoader()));
	        this.L = ((String) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v0_75 = 0;
	        } else {
	            v0_75 = 1;
	        }
	        java.util.ArrayList v0_77;
	        this.M = v0_75;
	        if (p8.readInt() == 0) {
	            v0_77 = 0;
	        } else {
	            v0_77 = 1;
	        }
	        java.util.ArrayList v0_79;
	        this.N = v0_77;
	        if (p8.readInt() == 0) {
	            v0_79 = 0;
	        } else {
	            v0_79 = 1;
	        }
	        this.O = v0_79;
	        this.P = ((Boolean) p8.readValue(0));
	        if (p8.readInt() == 0) {
	            v1 = 0;
	        }
	        this.Q = v1;
	        this.R = ((String) p8.readValue(0));
	        this.S = p8.readInt();
	        this.T = ((bcx[]) p8.createTypedArray(bcx.CREATOR));
	        this.U = ((bcv) p8.readParcelable(bdf.getClassLoader()));
	        this.V = p8.createStringArray();
	        this.W = p8.createTypedArrayList(bdb.CREATOR);
	        this.X = p8.createTypedArrayList(bcz.CREATOR);
	        return;
	    }
	
	
	    private static void a(java.util.ArrayList p2, String p3, int p4)
	    {
	        if (p4 != 0) {
	            p2.add(new StringBuilder((String.valueOf(p3).length() + 13)).append(p3).append(": ").append(p4).toString());
	        }
	        return;
	    }
	
	
	    private static void a(java.util.ArrayList p3, String p4, String p5)
	    {
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            p3.add(new StringBuilder(((String.valueOf(p4).length() + 2) + String.valueOf(p5).length())).append(p4).append(": ").append(p5).toString());
	        }
	        return;
	    }
	
	
	    private static void a(java.util.ArrayList p2, String p3, boolean p4)
	    {
	        if (p4) {
	            p2.add(new StringBuilder((String.valueOf(p3).length() + 7)).append(p3).append(": ").append(p4).toString());
	        }
	        return;
	    }
	
	
	    public final int a()
	    {
	        try {
	            int v0_2 = Integer.valueOf(this.d).intValue();
	        } catch (int v0) {
	            v0_2 = -1;
	        } catch (int v0_3) {
	            Object[] v1_1 = new Object[2];
	            v1_1[0] = this.d;
	            v1_1[1] = v0_3;
	        }
	        return v0_2;
	    }
	
	
	    public final void a(String p2)
	    {
	        if (p2 == null) {
	            this.q = 0;
	        } else {
	            this.q = p2.toUpperCase();
	        }
	        return;
	    }
	
	
	    public final int b()
	    {
	        int v0_2;
	        if (android.text.TextUtils.isEmpty(this.F)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        int v0_3;
	        if (v0_2 == 0) {
	            v0_3 = bdi.c;
	        } else {
	            switch (this.F.charAt(0)) {
	                case 97:
	                    v0_3 = bdi.a;
	                    break;
	                case 98:
	                    v0_3 = bdi.b;
	                    break;
	                case 99:
	                    v0_3 = bdi.c;
	                    break;
	                case 100:
	                    v0_3 = bdi.d;
	                    break;
	                case 101:
	                    v0_3 = bdi.e;
	                    break;
	                default:
	                    v0_3 = bdi.f;
	            }
	        }
	        return v0_3;
	    }
	
	
	    public final boolean c()
	    {
	        int v0_1;
	        if (this.P != Boolean.TRUE) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final boolean d()
	    {
	        int v0_1;
	        int v0_0 = this.a();
	        if ((v0_0 != -1) && (v0_0 < 15339)) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean e()
	    {
	        int v0_1;
	        int v0_0 = this.a();
	        if ((this.P == null) || ((v0_0 < 20249) && (v0_0 != -1))) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public String toString()
	    {
	        java.util.Iterator v1_0 = 0;
	        java.util.ArrayList v2_1 = new java.util.ArrayList();
	        bdf.a(v2_1, "version", this.a);
	        bdf.a(v2_1, "name", this.b);
	        bdf.a(v2_1, "cast_build_revision", this.c);
	        bdf.a(v2_1, "system_build_number", this.d);
	        bdf.a(v2_1, "release_track", this.e);
	        bdf.a(v2_1, "manufacturer", this.f);
	        bdf.a(v2_1, "model_name", this.g);
	        bdf.a(v2_1, "display_supported", this.h);
	        bdf.a(v2_1, "wifi_supported", this.i);
	        bdf.a(v2_1, "hotspot_supported", this.j);
	        bdf.a(v2_1, "ble_supported", this.k);
	        bdf.a(v2_1, "multizone_supported", this.l);
	        bcx[] v4_0 = this.m;
	        if (v4_0 != 0) {
	            v2_1.add(new StringBuilder((String.valueOf("uptime").length() + 22)).append("uptime").append(": ").append(v4_0).toString());
	        }
	        String v0_39;
	        bdf.a(v2_1, "ssdp_udn", this.n);
	        bdf.a(v2_1, "uma_client_id", this.o);
	        bdf.a(v2_1, "mac_address", this.p);
	        bdf.a(v2_1, "hotspot_bssid", this.q);
	        bdf.a(v2_1, "public_key", this.r);
	        bdf.a(v2_1, "ready_to_apply", this.s);
	        bdf.a(v2_1, "download_progress", this.t);
	        bdf.a(v2_1, "ip_address", this.u);
	        bdf.a(v2_1, "online", this.v);
	        bdf.a(v2_1, "ethernet_connected", this.w);
	        bdf.a(v2_1, "bssid", this.x);
	        bdf.a(v2_1, "ssid", this.y);
	        bdf.a(v2_1, "wpa_state", String.valueOf(this.z));
	        bdf.a(v2_1, "wpa_configured", this.A);
	        bdf.a(v2_1, "wpa_id", this.B);
	        bdf.a(v2_1, "signal_level", this.C);
	        bdf.a(v2_1, "noise_level", this.D);
	        bdf.a(v2_1, "tos_accepted", this.E);
	        bdf.a(v2_1, "ssid_suffix", this.F);
	        bdf.a(v2_1, "setup_state", String.valueOf(this.G));
	        bdf.a(v2_1, "num_initial_eureka_info", this.H);
	        String v0_38 = this.I;
	        if (v0_38 == null) {
	            v0_39 = 0;
	        } else {
	            v0_39 = v0_38.toString();
	        }
	        String v0_42;
	        bdf.a(v2_1, "timezone", v0_39);
	        bdf.a(v2_1, "time_format", String.valueOf(this.J));
	        String v0_41 = this.K;
	        if (v0_41 == null) {
	            v0_42 = 0;
	        } else {
	            v0_42 = v0_41.toString();
	        }
	        bdf.a(v2_1, "locale", v0_42);
	        bdf.a(v2_1, "country_code", this.L);
	        bdf.a(v2_1, "system_sound_effects", this.M);
	        bdf.a(v2_1, "audio_hdr", this.N);
	        bdf.a(v2_1, "stats", this.O);
	        bdf.a(v2_1, "opencast", this.c());
	        bdf.a(v2_1, "device_id", this.Q);
	        bdf.a(v2_1, "pin_code", this.R);
	        bdf.a(v2_1, "audio_output_delay", this.S);
	        if (this.T != null) {
	            bdf.a(v2_1, "groups", android.text.TextUtils.join(",", this.T));
	        }
	        String v0_53 = this.U;
	        if (v0_53 != null) {
	            v1_0 = v0_53.toString();
	        }
	        bdf.a(v2_1, "certificate", v1_0);
	        if (this.V != null) {
	            bdf.a(v2_1, "intermediate_certs", android.text.TextUtils.join(",", this.V));
	        }
	        if ((this.W != null) && (!this.W.isEmpty())) {
	            java.util.Iterator v1_3 = this.W.iterator();
	            while (v1_3.hasNext()) {
	                bdf.a(v2_1, "supportedTimeZone", ((bdb) v1_3.next()).toString());
	            }
	        }
	        if ((this.X != null) && (!this.X.isEmpty())) {
	            java.util.Iterator v1_4 = this.X.iterator();
	            while (v1_4.hasNext()) {
	                bdf.a(v2_1, "supportedLocale", ((bcz) v1_4.next()).toString());
	            }
	        }
	        return android.text.TextUtils.join("\n", v2_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p7, int p8)
	    {
	        java.util.ArrayList v0_8;
	        int v1 = 1;
	        p7.writeInt(this.a);
	        p7.writeValue(this.b);
	        p7.writeValue(this.c);
	        p7.writeValue(this.d);
	        p7.writeValue(this.e);
	        p7.writeValue(this.f);
	        p7.writeValue(this.g);
	        if (!this.h) {
	            v0_8 = 0;
	        } else {
	            v0_8 = 1;
	        }
	        java.util.ArrayList v0_10;
	        p7.writeInt(v0_8);
	        if (!this.i) {
	            v0_10 = 0;
	        } else {
	            v0_10 = 1;
	        }
	        java.util.ArrayList v0_12;
	        p7.writeInt(v0_10);
	        if (!this.j) {
	            v0_12 = 0;
	        } else {
	            v0_12 = 1;
	        }
	        java.util.ArrayList v0_14;
	        p7.writeInt(v0_12);
	        if (!this.k) {
	            v0_14 = 0;
	        } else {
	            v0_14 = 1;
	        }
	        java.util.ArrayList v0_16;
	        p7.writeInt(v0_14);
	        if (!this.l) {
	            v0_16 = 0;
	        } else {
	            v0_16 = 1;
	        }
	        java.util.ArrayList v0_23;
	        p7.writeInt(v0_16);
	        p7.writeLong(this.m);
	        p7.writeValue(this.n);
	        p7.writeValue(this.o);
	        p7.writeValue(this.p);
	        p7.writeValue(this.q);
	        p7.writeValue(this.r);
	        if (!this.s) {
	            v0_23 = 0;
	        } else {
	            v0_23 = 1;
	        }
	        java.util.ArrayList v0_27;
	        p7.writeInt(v0_23);
	        p7.writeInt(this.t);
	        p7.writeValue(this.u);
	        if (!this.v) {
	            v0_27 = 0;
	        } else {
	            v0_27 = 1;
	        }
	        java.util.ArrayList v0_29;
	        p7.writeInt(v0_27);
	        if (!this.w) {
	            v0_29 = 0;
	        } else {
	            v0_29 = 1;
	        }
	        java.util.ArrayList v0_34;
	        p7.writeInt(v0_29);
	        p7.writeValue(this.x);
	        p7.writeValue(this.y);
	        p7.writeValue(this.z);
	        if (!this.A) {
	            v0_34 = 0;
	        } else {
	            v0_34 = 1;
	        }
	        java.util.ArrayList v0_39;
	        p7.writeInt(v0_34);
	        p7.writeInt(this.B);
	        p7.writeInt(this.C);
	        p7.writeInt(this.D);
	        if (!this.E) {
	            v0_39 = 0;
	        } else {
	            v0_39 = 1;
	        }
	        java.util.ArrayList v0_48;
	        p7.writeInt(v0_39);
	        p7.writeValue(this.F);
	        p7.writeValue(this.G);
	        p7.writeInt(this.H);
	        p7.writeParcelable(this.I, p8);
	        p7.writeValue(this.J);
	        p7.writeParcelable(this.K, p8);
	        p7.writeValue(this.L);
	        if (!this.M) {
	            v0_48 = 0;
	        } else {
	            v0_48 = 1;
	        }
	        java.util.ArrayList v0_50;
	        p7.writeInt(v0_48);
	        if (!this.N) {
	            v0_50 = 0;
	        } else {
	            v0_50 = 1;
	        }
	        java.util.ArrayList v0_52;
	        p7.writeInt(v0_50);
	        if (!this.O) {
	            v0_52 = 0;
	        } else {
	            v0_52 = 1;
	        }
	        p7.writeInt(v0_52);
	        p7.writeValue(this.P);
	        if (!this.Q) {
	            v1 = 0;
	        }
	        p7.writeInt(v1);
	        p7.writeValue(this.R);
	        p7.writeInt(this.S);
	        p7.writeTypedArray(this.T, p8);
	        p7.writeParcelable(this.U, p8);
	        p7.writeStringArray(this.V);
	        p7.writeTypedList(this.W);
	        p7.writeTypedList(this.X);
	        return;
	    }
	
