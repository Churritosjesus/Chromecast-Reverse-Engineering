	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public java.lang.String b
	public java.lang.String c
	public java.util.List d
	public java.util.List e
	public java.lang.String f
	public android.net.Uri g
	
	    static ApplicationMetadata()
	    {
	        com.google.android.gms.cast.ApplicationMetadata.CREATOR = new buz();
	        return;
	    }
	
	
	    private ApplicationMetadata()
	    {
	        this.a = 1;
	        this.d = new java.util.ArrayList();
	        this.e = new java.util.ArrayList();
	        return;
	    }
	
	
	    public ApplicationMetadata(int p1, String p2, String p3, java.util.List p4, java.util.List p5, String p6, android.net.Uri p7)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        this.g = p7;
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (p5 != this) {
	            if ((p5 instanceof com.google.android.gms.cast.ApplicationMetadata)) {
	                if ((!a.d(this.b, ((com.google.android.gms.cast.ApplicationMetadata) p5).b)) || ((!a.d(this.d, ((com.google.android.gms.cast.ApplicationMetadata) p5).d)) || ((!a.d(this.c, ((com.google.android.gms.cast.ApplicationMetadata) p5).c)) || ((!a.d(this.e, ((com.google.android.gms.cast.ApplicationMetadata) p5).e)) || ((!a.d(this.f, ((com.google.android.gms.cast.ApplicationMetadata) p5).f)) || (!a.d(this.g, ((com.google.android.gms.cast.ApplicationMetadata) p5).g))))))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[7];
	        v0_1[0] = Integer.valueOf(this.a);
	        v0_1[1] = this.b;
	        v0_1[2] = this.c;
	        v0_1[3] = this.d;
	        v0_1[4] = this.e;
	        v0_1[5] = this.f;
	        v0_1[6] = this.g;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_7;
	        int v1_0 = 0;
	        java.util.List v2_5 = new StringBuilder("applicationId: ").append(this.b).append(", name: ").append(this.c).append(", images.count: ");
	        if (this.d != null) {
	            v0_7 = this.d.size();
	        } else {
	            v0_7 = 0;
	        }
	        String v0_9 = v2_5.append(v0_7).append(", namespaces.count: ");
	        if (this.e != null) {
	            v1_0 = this.e.size();
	        }
	        return v0_9.append(v1_0).append(", senderAppIdentifier: ").append(this.f).append(", senderAppLaunchUrl: ").append(this.g).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        buz.a(this, p1, p2);
	        return;
	    }
	
