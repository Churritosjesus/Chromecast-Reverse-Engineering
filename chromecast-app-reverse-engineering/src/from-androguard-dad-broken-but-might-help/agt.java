	public static final android.os.Parcelable$Creator CREATOR
	private final java.lang.String a
	private final java.lang.String b
	private final java.lang.String c
	private final java.lang.String d
	private final java.lang.String e
	private final android.net.Uri f
	
	    static agt()
	    {
	        agt.CREATOR = new agv();
	        return;
	    }
	
	
	    agt(android.os.Parcel p2)
	    {
	        android.net.Uri v0_6;
	        this.a = p2.readString();
	        this.b = p2.readString();
	        this.c = p2.readString();
	        this.d = p2.readString();
	        this.e = p2.readString();
	        android.net.Uri v0_5 = p2.readString();
	        if (v0_5 != null) {
	            v0_6 = android.net.Uri.parse(v0_5);
	        } else {
	            v0_6 = 0;
	        }
	        this.f = v0_6;
	        return;
	    }
	
	
	    public agt(String p2, String p3, String p4, String p5, String p6, android.net.Uri p7)
	    {
	        ajp.a(p2, "id");
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = p5;
	        this.e = p6;
	        this.f = p7;
	        return;
	    }
	
	
	    agt(org.json.JSONObject p3)
	    {
	        android.net.Uri v0 = 0;
	        this.a = p3.optString("id", 0);
	        this.b = p3.optString("first_name", 0);
	        this.c = p3.optString("middle_name", 0);
	        this.d = p3.optString("last_name", 0);
	        this.e = p3.optString("name", 0);
	        String v1_11 = p3.optString("link_uri", 0);
	        if (v1_11 != null) {
	            v0 = android.net.Uri.parse(v1_11);
	        }
	        this.f = v0;
	        return;
	    }
	
	
	    public static agt a()
	    {
	        return agx.a().b;
	    }
	
	
	    public static void a(agt p2)
	    {
	        agx.a().a(p2, 1);
	        return;
	    }
	
	
	    public static void b()
	    {
	        String v0_0 = afb.a();
	        if (v0_0 != null) {
	            aji.a(v0_0.d, new agu());
	        } else {
	            agt.a(0);
	        }
	        return;
	    }
	
	
	    final org.json.JSONObject c()
	    {
	        int v0_1 = new org.json.JSONObject();
	        try {
	            v0_1.put("id", this.a);
	            v0_1.put("first_name", this.b);
	            v0_1.put("middle_name", this.c);
	            v0_1.put("last_name", this.d);
	            v0_1.put("name", this.e);
	        } catch (int v0) {
	            v0_1 = 0;
	            return v0_1;
	        }
	        if (this.f == null) {
	            return v0_1;
	        } else {
	            v0_1.put("link_uri", this.f.toString());
	            return v0_1;
	        }
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        android.net.Uri v0_0 = 1;
	        if (this != p5) {
	            if ((p5 instanceof agt)) {
	                if ((!this.a.equals(((agt) p5).a)) || (this.b != null)) {
	                    if ((!this.b.equals(((agt) p5).b)) || (this.c != null)) {
	                        if ((!this.c.equals(((agt) p5).c)) || (this.d != null)) {
	                            if ((!this.d.equals(((agt) p5).d)) || (this.e != null)) {
	                                if ((!this.e.equals(((agt) p5).e)) || (this.f != null)) {
	                                    v0_0 = this.f.equals(((agt) p5).f);
	                                } else {
	                                    if (((agt) p5).f != null) {
	                                        v0_0 = 0;
	                                    }
	                                }
	                            } else {
	                                if (((agt) p5).e != null) {
	                                    v0_0 = 0;
	                                }
	                            }
	                        } else {
	                            if (((agt) p5).d != null) {
	                                v0_0 = 0;
	                            }
	                        }
	                    } else {
	                        if (((agt) p5).c != null) {
	                            v0_0 = 0;
	                        }
	                    }
	                } else {
	                    if (((agt) p5).b != null) {
	                        v0_0 = 0;
	                    }
	                }
	            } else {
	                v0_0 = 0;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2 = (this.a.hashCode() + 527);
	        if (this.b != null) {
	            v0_2 = ((v0_2 * 31) + this.b.hashCode());
	        }
	        if (this.c != null) {
	            v0_2 = ((v0_2 * 31) + this.c.hashCode());
	        }
	        if (this.d != null) {
	            v0_2 = ((v0_2 * 31) + this.d.hashCode());
	        }
	        if (this.e != null) {
	            v0_2 = ((v0_2 * 31) + this.e.hashCode());
	        }
	        if (this.f != null) {
	            v0_2 = ((v0_2 * 31) + this.f.hashCode());
	        }
	        return v0_2;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p2, int p3)
	    {
	        String v0_7;
	        p2.writeString(this.a);
	        p2.writeString(this.b);
	        p2.writeString(this.c);
	        p2.writeString(this.d);
	        p2.writeString(this.e);
	        if (this.f != null) {
	            v0_7 = this.f.toString();
	        } else {
	            v0_7 = 0;
	        }
	        p2.writeString(v0_7);
	        return;
	    }
	
