	public static final csu CREATOR
	public final  a
	public final java.lang.String b
	public final  c
	public final  d
	public final java.lang.String e
	public final java.lang.String f
	public final  g
	public final java.lang.String h
	public final  i
	
	    static PlayLoggerContext()
	    {
	        com.google.android.gms.playlog.internal.PlayLoggerContext.CREATOR = new csu();
	        return;
	    }
	
	
	    public PlayLoggerContext(int p1, String p2, int p3, int p4, String p5, String p6, boolean p7, String p8, boolean p9)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        this.g = p7;
	        this.h = p8;
	        this.i = p9;
	        return;
	    }
	
	
	    public PlayLoggerContext(String p3, int p4, int p5, String p6, String p7, String p8, boolean p9)
	    {
	        int v0_2;
	        this.a = 1;
	        this.b = ((String) a.c(p3));
	        this.c = p4;
	        this.d = p5;
	        this.h = p6;
	        this.e = p7;
	        this.f = p8;
	        if (p9) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.g = v0_2;
	        this.i = p9;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if (!(p5 instanceof com.google.android.gms.playlog.internal.PlayLoggerContext)) {
	                v0 = 0;
	            } else {
	                if ((!this.b.equals(((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).b)) || ((this.c != ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).c) || ((this.d != ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).d) || ((!a.e(this.h, ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).h)) || ((!a.e(this.e, ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).e)) || ((!a.e(this.f, ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).f)) || ((this.g != ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).g) || (this.i != ((com.google.android.gms.playlog.internal.PlayLoggerContext) p5).i)))))))) {
	                    v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[8];
	        v0_1[0] = this.b;
	        v0_1[1] = Integer.valueOf(this.c);
	        v0_1[2] = Integer.valueOf(this.d);
	        v0_1[3] = this.h;
	        v0_1[4] = this.e;
	        v0_1[5] = this.f;
	        v0_1[6] = Boolean.valueOf(this.g);
	        v0_1[7] = Boolean.valueOf(this.i);
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public String toString()
	    {
	        String v0_1 = new StringBuilder();
	        v0_1.append("PlayLoggerContext[");
	        v0_1.append("package=").append(this.b).append(44);
	        v0_1.append("versionCode=").append(this.a).append(44);
	        v0_1.append("logSource=").append(this.d).append(44);
	        v0_1.append("logSourceName=").append(this.h).append(44);
	        v0_1.append("uploadAccount=").append(this.e).append(44);
	        v0_1.append("loggingId=").append(this.f).append(44);
	        v0_1.append("logAndroidId=").append(this.g).append(44);
	        v0_1.append("isAnonymous=").append(this.i);
	        v0_1.append("]");
	        return v0_1.toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        csu.a(this, p1);
	        return;
	    }
	
