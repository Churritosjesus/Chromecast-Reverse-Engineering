	public static final bvn CREATOR
	public final  a
	public com.google.android.gms.playlog.internal.PlayLoggerContext b
	public B c
	public final cmy d
	public final bvk e
	
	    static LogEventParcelable()
	    {
	        com.google.android.gms.clearcut.LogEventParcelable.CREATOR = new bvn();
	        return;
	    }
	
	
	    public LogEventParcelable(int p2, com.google.android.gms.playlog.internal.PlayLoggerContext p3, byte[] p4)
	    {
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        this.d = 0;
	        this.e = 0;
	        return;
	    }
	
	
	    public LogEventParcelable(com.google.android.gms.playlog.internal.PlayLoggerContext p2, cmy p3, bvk p4)
	    {
	        this.a = 1;
	        this.b = p2;
	        this.d = p3;
	        this.e = p4;
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
	            if (!(p5 instanceof com.google.android.gms.clearcut.LogEventParcelable)) {
	                v0 = 0;
	            } else {
	                if ((this.a != ((com.google.android.gms.clearcut.LogEventParcelable) p5).a) || ((!a.e(this.b, ((com.google.android.gms.clearcut.LogEventParcelable) p5).b)) || ((!java.util.Arrays.equals(this.c, ((com.google.android.gms.clearcut.LogEventParcelable) p5).c)) || ((!a.e(this.d, ((com.google.android.gms.clearcut.LogEventParcelable) p5).d)) || (!a.e(this.e, ((com.google.android.gms.clearcut.LogEventParcelable) p5).e)))))) {
	                    v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[5];
	        v0_1[0] = Integer.valueOf(this.a);
	        v0_1[1] = this.b;
	        v0_1[2] = this.c;
	        v0_1[3] = this.d;
	        v0_1[4] = this.e;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public String toString()
	    {
	        String v0_7;
	        StringBuilder v1_1 = new StringBuilder("LogEventParcelable[");
	        v1_1.append(this.a);
	        v1_1.append(", ");
	        v1_1.append(this.b);
	        v1_1.append(", ");
	        if (this.c != null) {
	            v0_7 = new String(this.c);
	        } else {
	            v0_7 = 0;
	        }
	        v1_1.append(v0_7);
	        v1_1.append(", ");
	        v1_1.append(this.d);
	        v1_1.append(", ");
	        v1_1.append(this.e);
	        v1_1.append("]");
	        return v1_1.toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bvn.a(this, p1, p2);
	        return;
	    }
	
