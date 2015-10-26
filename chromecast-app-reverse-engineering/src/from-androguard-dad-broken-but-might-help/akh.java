	public static final android.os.Parcelable$Creator CREATOR
	 Laky a
	  b
	 j c
	 akk d
	 akj e
	 akl f
	private  g
	private java.util.Map h
	private akt i
	
	    static akh()
	    {
	        akh.CREATOR = new aki();
	        return;
	    }
	
	
	    public akh(android.os.Parcel p5)
	    {
	        this.b = -1;
	        android.os.Parcelable[] v2 = p5.readParcelableArray(aky.getClassLoader());
	        int v0_4 = new aky[v2.length];
	        this.a = v0_4;
	        int v1_0 = 0;
	        while (v1_0 < v2.length) {
	            this.a[v1_0] = ((aky) v2[v1_0]);
	            int v0_16 = this.a[v1_0];
	            if (v0_16.b == null) {
	                v0_16.b = this;
	                v1_0++;
	            } else {
	                throw new afq("Can\'t set LoginClient if it is already set.");
	            }
	        }
	        this.b = p5.readInt();
	        this.f = ((akl) p5.readParcelable(akl.getClassLoader()));
	        this.h = aji.a(p5);
	        return;
	    }
	
	
	    public akh(j p2)
	    {
	        this.b = -1;
	        this.c = p2;
	        return;
	    }
	
	
	    private void a(String p5, String p6, String p7, String p8, java.util.Map p9)
	    {
	        if (this.f != null) {
	            ahe v0_1 = this.h();
	            android.os.Bundle v1_2 = akt.a(this.f.e);
	            if (p6 != null) {
	                v1_2.putString("2_result", p6);
	            }
	            if (p7 != null) {
	                v1_2.putString("5_error_message", p7);
	            }
	            if (p8 != null) {
	                v1_2.putString("4_error_code", p8);
	            }
	            if ((p9 != null) && (!p9.isEmpty())) {
	                v1_2.putString("6_extras", new org.json.JSONObject(p9).toString());
	            }
	            v1_2.putString("3_method", p5);
	            v0_1.a.a("fb_mobile_login_method_complete", 0, v1_2);
	        } else {
	            this.h().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", p5);
	        }
	        return;
	    }
	
	
	    private void a(String p5, String p6, boolean p7)
	    {
	        if (this.h == null) {
	            this.h = new java.util.HashMap();
	        }
	        if ((this.h.containsKey(p5)) && (p7)) {
	            StringBuilder v0_7 = ((String) this.h.get(p5));
	            p6 = new StringBuilder(((String.valueOf(v0_7).length() + 1) + String.valueOf(p6).length())).append(v0_7).append(",").append(p6).toString();
	        }
	        this.h.put(p5, p6);
	        return;
	    }
	
	
	    public static int b()
	    {
	        return aim.a.a();
	    }
	
	
	    static String g()
	    {
	        String v0_1 = new org.json.JSONObject();
	        try {
	            v0_1.put("init", System.currentTimeMillis());
	        } catch (org.json.JSONException v1) {
	        }
	        return v0_1.toString();
	    }
	
	
	    private akt h()
	    {
	        if ((this.i == null) || (!this.i.b.equals(this.f.d))) {
	            this.i = new akt(this.a(), this.f.d);
	        }
	        return this.i;
	    }
	
	
	    final m a()
	    {
	        return this.c.y;
	    }
	
	
	    final void a(akn p4)
	    {
	        try {
	            if ((p4.b == null) || (afb.a() == null)) {
	                this.b(p4);
	            } else {
	                if (p4.b != null) {
	                    akn v0_7;
	                    akn v0_3 = afb.a();
	                    afb v1_0 = p4.b;
	                    if ((v0_3 == null) || ((v1_0 == null) || (!v0_3.h.equals(v1_0.h)))) {
	                        v0_7 = akn.a(this.f, "User logged in as different Facebook user.", 0);
	                    } else {
	                        v0_7 = akn.a(this.f, p4.b);
	                    }
	                    this.b(v0_7);
	                } else {
	                    throw new afq("Can\'t validate without a token");
	                }
	            }
	        } catch (akn v0_9) {
	            this.b(akn.a(this.f, "Caught exception", v0_9.getMessage()));
	        }
	        return;
	    }
	
	
	    final void b(akn p8)
	    {
	        akk v0_0 = this.c();
	        if (v0_0 != null) {
	            this.a(v0_0.a(), p8.a.d, p8.c, p8.d, v0_0.a);
	        }
	        if (this.h != null) {
	            p8.e = this.h;
	        }
	        this.a = 0;
	        this.b = -1;
	        this.f = 0;
	        this.h = 0;
	        if (this.d != null) {
	            this.d.a(p8);
	        }
	        return;
	    }
	
	
	    aky c()
	    {
	        int v0_1;
	        if (this.b < 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.a[this.b];
	        }
	        return v0_1;
	    }
	
	
	    final boolean d()
	    {
	        int v0_0 = 1;
	        if (!this.g) {
	            if (this.a().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
	                this.g = 1;
	            } else {
	                int v0_1 = this.a();
	                this.b(akn.a(this.f, v0_1.getString(a.db), v0_1.getString(a.da)));
	                v0_0 = 0;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    final void e()
	    {
	        if (this.b >= 0) {
	            this.a(this.c().a(), "skipped", 0, 0, this.c().a);
	        }
	        while ((this.a != null) && (this.b < (this.a.length - 1))) {
	            int v0_14;
	            this.b = (this.b + 1);
	            String v1_5 = this.c();
	            if ((!v1_5.c()) || (this.d())) {
	                v0_14 = v1_5.a(this.f);
	                if (v0_14 == 0) {
	                    this.a("not_tried", v1_5.a(), 1);
	                } else {
	                    String v2_2 = this.h();
	                    int v4_3 = this.f.e;
	                    String v1_7 = v1_5.a();
	                    int v4_4 = akt.a(v4_3);
	                    v4_4.putString("3_method", v1_7);
	                    v2_2.a.a("fb_mobile_login_method_start", 0, v4_4);
	                }
	            } else {
	                this.a("no_internet_permission", "1", 0);
	                v0_14 = 0;
	            }
	            if (v0_14 != 0) {
	            }
	            return;
	        }
	        if (this.f != null) {
	            this.b(akn.a(this.f, "Login attempt failed.", 0));
	        }
	        return;
	    }
	
	
	    final void f()
	    {
	        if (this.e != null) {
	            this.e.a();
	        }
	        return;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        p2.writeParcelableArray(this.a, p3);
	        p2.writeInt(this.b);
	        p2.writeParcelable(this.f, p3);
	        aji.a(p2, this.h);
	        return;
	    }
	
