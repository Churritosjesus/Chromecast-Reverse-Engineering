	public static final android.os.Parcelable$Creator CREATOR
	private static final java.util.Date i
	private static final java.util.Date j
	private static final java.util.Date k
	private static final afl l
	public final java.util.Date a
	public final java.util.Set b
	final java.util.Set c
	public final java.lang.String d
	final afl e
	final java.util.Date f
	public final java.lang.String g
	public final java.lang.String h
	
	    static afb()
	    {
	        afc v0_1 = new java.util.Date(nan);
	        afb.i = v0_1;
	        afb.j = v0_1;
	        afb.k = new java.util.Date();
	        afb.l = afl.a;
	        afb.CREATOR = new afc();
	        return;
	    }
	
	
	    afb(android.os.Parcel p5)
	    {
	        this.a = new java.util.Date(p5.readLong());
	        String v0_3 = new java.util.ArrayList();
	        p5.readStringList(v0_3);
	        this.b = java.util.Collections.unmodifiableSet(new java.util.HashSet(v0_3));
	        v0_3.clear();
	        p5.readStringList(v0_3);
	        this.c = java.util.Collections.unmodifiableSet(new java.util.HashSet(v0_3));
	        this.d = p5.readString();
	        this.e = afl.valueOf(p5.readString());
	        this.f = new java.util.Date(p5.readLong());
	        this.g = p5.readString();
	        this.h = p5.readString();
	        return;
	    }
	
	
	    public afb(String p2, String p3, String p4, java.util.Collection p5, java.util.Collection p6, afl p7, java.util.Date p8, java.util.Date p9)
	    {
	        ajp.a(p2, "accessToken");
	        ajp.a(p3, "applicationId");
	        ajp.a(p4, "userId");
	        if (p8 == null) {
	            p8 = afb.j;
	        }
	        java.util.Set v0_4;
	        this.a = p8;
	        if (p5 == null) {
	            v0_4 = new java.util.HashSet();
	        } else {
	            v0_4 = new java.util.HashSet(p5);
	        }
	        java.util.Set v0_8;
	        this.b = java.util.Collections.unmodifiableSet(v0_4);
	        if (p6 == null) {
	            v0_8 = new java.util.HashSet();
	        } else {
	            v0_8 = new java.util.HashSet(p6);
	        }
	        this.c = java.util.Collections.unmodifiableSet(v0_8);
	        this.d = p2;
	        if (p7 == null) {
	            p7 = afb.l;
	        }
	        this.e = p7;
	        if (p9 == null) {
	            p9 = afb.k;
	        }
	        this.f = p9;
	        this.g = p3;
	        this.h = p4;
	        return;
	    }
	
	
	    public static afb a()
	    {
	        return aff.a().b;
	    }
	
	
	    static afb a(android.os.Bundle p9)
	    {
	        java.util.List v4 = afb.a(p9, "com.facebook.TokenCachingStrategy.Permissions");
	        java.util.List v5 = afb.a(p9, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
	        String v2 = agr.d(p9);
	        if (aji.a(v2)) {
	            v2 = afv.h();
	        }
	        String v1 = agr.b(p9);
	        try {
	            int v0_5 = new afb(v1, v2, aji.d(v1).getString("id"), v4, v5, agr.c(p9), agr.a(p9, "com.facebook.TokenCachingStrategy.ExpirationDate"), agr.a(p9, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
	        } catch (int v0) {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    static afb a(org.json.JSONObject p9)
	    {
	        if (p9.getInt("version") <= 1) {
	            return new afb(p9.getString("token"), p9.getString("application_id"), p9.getString("user_id"), aji.a(p9.getJSONArray("permissions")), aji.a(p9.getJSONArray("declined_permissions")), afl.valueOf(p9.getString("source")), new java.util.Date(p9.getLong("expires_at")), new java.util.Date(p9.getLong("last_refresh")));
	        } else {
	            throw new afq("Unknown AccessToken serialization format.");
	        }
	    }
	
	
	    private static java.util.List a(android.os.Bundle p2, String p3)
	    {
	        java.util.List v0_1;
	        java.util.List v0_0 = p2.getStringArrayList(p3);
	        if (v0_0 != null) {
	            v0_1 = java.util.Collections.unmodifiableList(new java.util.ArrayList(v0_0));
	        } else {
	            v0_1 = java.util.Collections.emptyList();
	        }
	        return v0_1;
	    }
	
	
	    public static void a(afb p2)
	    {
	        aff.a().a(p2, 1);
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 instanceof afb)) {
	                if ((this.a.equals(((afb) p5).a)) && ((this.b.equals(((afb) p5).b)) && ((this.c.equals(((afb) p5).c)) && ((this.d.equals(((afb) p5).d)) && ((this.e == ((afb) p5).e) && (this.f.equals(((afb) p5).f))))))) {
	                    if (this.g != null) {
	                        if (!this.g.equals(((afb) p5).g)) {
	                            v0 = 0;
	                            return v0;
	                        }
	                    } else {
	                        if (((afb) p5).g != null) {
	                        }
	                    }
	                    if (this.h.equals(((afb) p5).h)) {
	                        return v0;
	                    }
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_15;
	        int v1_10 = ((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31);
	        if (this.g != null) {
	            v0_15 = this.g.hashCode();
	        } else {
	            v0_15 = 0;
	        }
	        return (((v0_15 + v1_10) * 31) + this.h.hashCode());
	    }
	
	
	    public final String toString()
	    {
	        String v0_5;
	        StringBuilder v1_1 = new StringBuilder();
	        v1_1.append("{AccessToken");
	        java.util.Set v2_0 = v1_1.append(" token:");
	        if (this.d != null) {
	            if (!afv.a(ags.b)) {
	                v0_5 = "ACCESS_TOKEN_REMOVED";
	            } else {
	                v0_5 = this.d;
	            }
	        } else {
	            v0_5 = "null";
	        }
	        v2_0.append(v0_5);
	        v1_1.append(" permissions:");
	        if (this.b != null) {
	            v1_1.append("[");
	            v1_1.append(android.text.TextUtils.join(", ", this.b));
	            v1_1.append("]");
	        } else {
	            v1_1.append("null");
	        }
	        v1_1.append("}");
	        return v1_1.toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p3, int p4)
	    {
	        p3.writeLong(this.a.getTime());
	        p3.writeStringList(new java.util.ArrayList(this.b));
	        p3.writeStringList(new java.util.ArrayList(this.c));
	        p3.writeString(this.d);
	        p3.writeString(this.e.name());
	        p3.writeLong(this.f.getTime());
	        p3.writeString(this.g);
	        p3.writeString(this.h);
	        return;
	    }
	
