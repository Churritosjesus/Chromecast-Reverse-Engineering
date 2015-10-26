	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public  b
	public java.lang.String c
	
	    static LaunchOptions()
	    {
	        com.google.android.gms.cast.LaunchOptions.CREATOR = new bvb();
	        return;
	    }
	
	
	    public LaunchOptions()
	    {
	        String v2_0 = java.util.Locale.getDefault();
	        StringBuilder v3_1 = new StringBuilder(20);
	        v3_1.append(v2_0.getLanguage());
	        StringBuilder v4_2 = v2_0.getCountry();
	        if (!android.text.TextUtils.isEmpty(v4_2)) {
	            v3_1.append(45).append(v4_2);
	        }
	        String v2_1 = v2_0.getVariant();
	        if (!android.text.TextUtils.isEmpty(v2_1)) {
	            v3_1.append(45).append(v2_1);
	        }
	        this(1, 0, v3_1.toString());
	        return;
	    }
	
	
	    public LaunchOptions(int p1, boolean p2, String p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (p5 != this) {
	            if ((p5 instanceof com.google.android.gms.cast.LaunchOptions)) {
	                if ((this.b != ((com.google.android.gms.cast.LaunchOptions) p5).b) || (!a.d(this.c, ((com.google.android.gms.cast.LaunchOptions) p5).c))) {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[2];
	        v0_1[0] = Boolean.valueOf(this.b);
	        v0_1[1] = this.c;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public String toString()
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = Boolean.valueOf(this.b);
	        v1_1[1] = this.c;
	        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", v1_1);
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bvb.a(this, p1);
	        return;
	    }
	
