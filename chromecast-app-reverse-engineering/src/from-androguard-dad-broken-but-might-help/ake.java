	public static final android.os.Parcelable$Creator CREATOR
	
	    static ake()
	    {
	        ake.CREATOR = new akf();
	        return;
	    }
	
	
	    ake(akh p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    ake(android.os.Parcel p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    private akn a(akl p8, android.content.Intent p9)
	    {
	        akn v0 = 0;
	        String v1_0 = p9.getExtras();
	        java.util.Set v2_0 = ake.a(v1_0);
	        afl v3_1 = v1_0.getString("error_code");
	        String v4_0 = ake.b(v1_0);
	        String v5_1 = v1_0.getString("e2e");
	        if (!aji.a(v5_1)) {
	            this.a(v5_1);
	        }
	        if ((v2_0 != null) || ((v3_1 != null) || (v4_0 != null))) {
	            if (!ajh.a.contains(v2_0)) {
	                if (!ajh.b.contains(v2_0)) {
	                    v0 = akn.a(p8, v2_0, v4_0, v3_1);
	                } else {
	                    v0 = akn.a(p8, 0);
	                }
	            }
	        } else {
	            try {
	                v0 = akn.a(p8, ake.a(p8.b, v1_0, afl.a, p8.d));
	            } catch (String v1_6) {
	                v0 = akn.a(p8, v0, v1_6.getMessage());
	            }
	        }
	        return v0;
	    }
	
	
	    private static String a(android.os.Bundle p1)
	    {
	        String v0_1 = p1.getString("error");
	        if (v0_1 == null) {
	            v0_1 = p1.getString("error_type");
	        }
	        return v0_1;
	    }
	
	
	    private boolean a(android.content.Intent p3, int p4)
	    {
	        int v0 = 0;
	        if (p3 != null) {
	            try {
	                this.b.c.a(p3, p4);
	                v0 = 1;
	            } catch (android.content.ActivityNotFoundException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    private static String b(android.os.Bundle p1)
	    {
	        String v0_1 = p1.getString("error_message");
	        if (v0_1 == null) {
	            v0_1 = p1.getString("error_description");
	        }
	        return v0_1;
	    }
	
	
	    final String a()
	    {
	        return "katana_proxy_auth";
	    }
	
	
	    final boolean a(int p6, android.content.Intent p7)
	    {
	        int v0_2;
	        int v0_1 = this.b.f;
	        if (p7 != null) {
	            if (p6 != 0) {
	                if (p6 == -1) {
	                    v0_2 = this.a(v0_1, p7);
	                } else {
	                    v0_2 = akn.a(v0_1, "Unexpected resultCode from authorization.", 0);
	                }
	            } else {
	                String v1_2 = p7.getExtras();
	                int v2_1 = ake.a(v1_2);
	                String v3_1 = v1_2.getString("error_code");
	                if (!"CONNECTION_FAILURE".equals(v3_1)) {
	                    v0_2 = akn.a(v0_1, v2_1);
	                } else {
	                    v0_2 = akn.a(v0_1, v2_1, ake.b(v1_2), v3_1);
	                }
	            }
	        } else {
	            v0_2 = akn.a(v0_1, "Operation canceled");
	        }
	        if (v0_2 == 0) {
	            this.b.e();
	        } else {
	            this.b.a(v0_2);
	        }
	        return 1;
	    }
	
	
	    final boolean a(akl p8)
	    {
	        String v3 = akh.g();
	        boolean v0_2 = this.b.c.y;
	        int v1_0 = p8.d;
	        java.util.Set v2 = p8.b;
	        boolean v4 = p8.f;
	        ajy v6_0 = p8.b.iterator();
	        while (v6_0.hasNext()) {
	            if (aku.a(((String) v6_0.next()))) {
	                int v5_2 = 1;
	            }
	            boolean v0_3 = aix.a(v0_2, v1_0, v2, v3, v4, v5_2, p8.c);
	            this.a("e2e", v3);
	            return this.a(v0_3, akh.b());
	        }
	        v5_2 = 0;
	        v0_3 = aix.a(v0_2, v1_0, v2, v3, v4, v5_2, p8.c);
	        this.a("e2e", v3);
	        return this.a(v0_3, akh.b());
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
	
