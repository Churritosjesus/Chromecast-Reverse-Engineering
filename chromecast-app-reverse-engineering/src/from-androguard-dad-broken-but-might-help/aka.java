	public static final android.os.Parcelable$Creator CREATOR
	private ajz c
	
	    static aka()
	    {
	        aka.CREATOR = new akd();
	        return;
	    }
	
	
	    aka(akh p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    aka(android.os.Parcel p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    final String a()
	    {
	        return "get_token";
	    }
	
	
	    final void a(akl p6, android.os.Bundle p7)
	    {
	        if (this.c != null) {
	            this.c.b = 0;
	        }
	        this.c = 0;
	        String v0_2 = this.b;
	        if (v0_2.e != null) {
	            v0_2.e.b();
	        }
	        if (p7 == null) {
	            this.b.e();
	        } else {
	            String v1_2 = p7.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	            String v0_5 = p6.b;
	            if ((v1_2 == null) || ((v0_5 != null) && (!v1_2.containsAll(v0_5)))) {
	                boolean v2_2 = new java.util.HashSet();
	                java.util.Iterator v3 = v0_5.iterator();
	                while (v3.hasNext()) {
	                    String v0_12 = ((String) v3.next());
	                    if (!v1_2.contains(v0_12)) {
	                        v2_2.add(v0_12);
	                    }
	                }
	                if (!v2_2.isEmpty()) {
	                    this.a("new_permissions", android.text.TextUtils.join(",", v2_2));
	                }
	                ajp.a(v2_2, "permissions");
	                p6.b = v2_2;
	            } else {
	                String v0_14 = p7.getString("com.facebook.platform.extra.USER_ID");
	                if ((v0_14 != null) && (!v0_14.isEmpty())) {
	                    this.b(p6, p7);
	                } else {
	                    this.b.f();
	                    aji.a(p7.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new akc(this, p7, p6));
	                }
	            }
	        }
	        return;
	    }
	
	
	    final boolean a(akl p6)
	    {
	        int v2_3;
	        int v0_0 = 0;
	        this.c = new ajz(this.b.c.y, p6.d);
	        int v2_2 = this.c;
	        if (!v2_2.c) {
	            if (aix.a(v2_2.e) != -1) {
	                android.content.Intent v3_7 = aix.a(v2_2.a);
	                if (v3_7 != null) {
	                    v2_2.c = 1;
	                    v2_2.a.bindService(v3_7, v2_2, 1);
	                    v2_3 = 1;
	                } else {
	                    v2_3 = 0;
	                }
	            } else {
	                v2_3 = 0;
	            }
	        } else {
	            v2_3 = 0;
	        }
	        if (v2_3 != 0) {
	            this.b.f();
	            this.c.b = new akb(this, p6);
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
	
	    final void b()
	    {
	        if (this.c != null) {
	            this.c.c = 0;
	            this.c.b = 0;
	            this.c = 0;
	        }
	        return;
	    }
	
	
	    final void b(akl p11, android.os.Bundle p12)
	    {
	        afb v5 = 0;
	        String v2 = p11.d;
	        java.util.Date v7 = aji.a(p12, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new java.util.Date(0));
	        java.util.ArrayList v4 = p12.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
	        akh v1_2 = p12.getString("com.facebook.platform.extra.ACCESS_TOKEN");
	        if (!aji.a(v1_2)) {
	            v5 = new afb(v1_2, v2, p12.getString("com.facebook.platform.extra.USER_ID"), v4, 0, afl.b, v7, new java.util.Date());
	        }
	        this.b.a(akn.a(this.b.f, v5));
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        super.writeToParcel(p1, p2);
	        return;
	    }
	
