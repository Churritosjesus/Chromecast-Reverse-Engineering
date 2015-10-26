	public static final android.os.Parcelable$Creator CREATOR
	private ajq c
	private java.lang.String d
	
	    static alb()
	    {
	        alb.CREATOR = new ald();
	        return;
	    }
	
	
	    alb(akh p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    alb(android.os.Parcel p2)
	    {
	        this(p2);
	        this.d = p2.readString();
	        return;
	    }
	
	
	    final String a()
	    {
	        return "web_view";
	    }
	
	
	    final void a(akl p8, android.os.Bundle p9, afq p10)
	    {
	        akn v0_3;
	        if (p9 == null) {
	            if (!(p10 instanceof afr)) {
	                akh v1_1;
	                this.d = 0;
	                akn v0_1 = p10.getMessage();
	                if (!(p10 instanceof afz)) {
	                    v1_1 = 0;
	                } else {
	                    akn v0_2 = ((afz) p10).a;
	                    Object[] v4_1 = new Object[1];
	                    v4_1[0] = Integer.valueOf(v0_2.b);
	                    v1_1 = String.format(java.util.Locale.ROOT, "%d", v4_1);
	                    v0_1 = v0_2.toString();
	                }
	                v0_3 = akn.a(this.b.f, 0, v0_1, v1_1);
	            } else {
	                v0_3 = akn.a(this.b.f, "User canceled log in.");
	            }
	        } else {
	            if (p9.containsKey("e2e")) {
	                this.d = p9.getString("e2e");
	            }
	            try {
	                akh v1_5 = alb.a(p8.b, p9, afl.c, p8.d);
	                v0_3 = akn.a(this.b.f, v1_5);
	                android.webkit.CookieSyncManager.createInstance(this.b.a()).sync();
	                this.b.a().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", v1_5.d).apply();
	            } catch (akn v0_13) {
	                v0_3 = akn.a(this.b.f, 0, v0_13.getMessage());
	            }
	        }
	        if (!aji.a(this.d)) {
	            this.a(this.d);
	        }
	        this.b.a(v0_3);
	        return;
	    }
	
	
	    final boolean a(akl p7)
	    {
	        t v1_1 = new android.os.Bundle();
	        if (!aji.a(p7.b)) {
	            ain v0_3 = android.text.TextUtils.join(",", p7.b);
	            v1_1.putString("scope", v0_3);
	            this.a("scope", v0_3);
	        }
	        ain v0_7;
	        v1_1.putString("default_audience", p7.c.b);
	        ain v0_6 = afb.a();
	        if (v0_6 == null) {
	            v0_7 = 0;
	        } else {
	            v0_7 = v0_6.d;
	        }
	        if ((v0_7 == null) || (!v0_7.equals(this.b.a().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))) {
	            aji.b(this.b.a());
	            this.a("access_token", "0");
	        } else {
	            v1_1.putString("access_token", v0_7);
	            this.a("access_token", "1");
	        }
	        ain v0_13 = new alc(this, p7);
	        this.d = akh.g();
	        this.a("e2e", this.d);
	        String v2_15 = this.b.a();
	        ale v3_4 = new ale(v2_15, p7.d, v1_1);
	        v3_4.f = this.d;
	        v3_4.g = p7.f;
	        v3_4.d = v0_13;
	        v3_4.c = afv.j();
	        this.c = v3_4.a();
	        ain v0_17 = new ain();
	        v0_17.c(1);
	        v0_17.Z = this.c;
	        v0_17.a(v2_15.b, "FacebookDialogFragment");
	        return 1;
	    }
	
	
	    final void b()
	    {
	        if (this.c != null) {
	            this.c.cancel();
	            this.c = 0;
	        }
	        return;
	    }
	
	
	    final boolean c()
	    {
	        return 1;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        super.writeToParcel(p2, p3);
	        p2.writeString(this.d);
	        return;
	    }
	
