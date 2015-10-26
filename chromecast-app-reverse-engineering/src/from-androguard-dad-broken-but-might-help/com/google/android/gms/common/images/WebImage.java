	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public final android.net.Uri b
	public final  c
	public final  d
	
	    static WebImage()
	    {
	        com.google.android.gms.common.images.WebImage.CREATOR = new byc();
	        return;
	    }
	
	
	    public WebImage(int p1, android.net.Uri p2, int p3, int p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    private WebImage(android.net.Uri p3, int p4, int p5)
	    {
	        this(1, p3, p4, p5);
	        if (p3 != null) {
	            if ((p4 >= 0) && (p5 >= 0)) {
	                return;
	            } else {
	                throw new IllegalArgumentException("width and height must not be negative");
	            }
	        } else {
	            throw new IllegalArgumentException("url cannot be null");
	        }
	    }
	
	
	    public WebImage(org.json.JSONObject p5)
	    {
	        this(com.google.android.gms.common.images.WebImage.a(p5), p5.optInt("width", 0), p5.optInt("height", 0));
	        return;
	    }
	
	
	    private static android.net.Uri a(org.json.JSONObject p2)
	    {
	        android.net.Uri v0 = 0;
	        if (p2.has("url")) {
	            try {
	                v0 = android.net.Uri.parse(p2.getString("url"));
	            } catch (org.json.JSONException v1) {
	            }
	        }
	        return v0;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if ((p5 != null) && ((p5 instanceof com.google.android.gms.common.images.WebImage))) {
	                if ((!a.e(this.b, ((com.google.android.gms.common.images.WebImage) p5).b)) || ((this.c != ((com.google.android.gms.common.images.WebImage) p5).c) || (this.d != ((com.google.android.gms.common.images.WebImage) p5).d))) {
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
	        int v0_1 = new Object[3];
	        v0_1[0] = this.b;
	        v0_1[1] = Integer.valueOf(this.c);
	        v0_1[2] = Integer.valueOf(this.d);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        Object[] v1_1 = new Object[3];
	        v1_1[0] = Integer.valueOf(this.c);
	        v1_1[1] = Integer.valueOf(this.d);
	        v1_1[2] = this.b.toString();
	        return String.format("Image %dx%d %s", v1_1);
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        byc.a(this, p1, p2);
	        return;
	    }
	
