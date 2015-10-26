	public static final bsj CREATOR
	public final  a
	public final  b
	public final java.lang.String c
	public final  d
	public final  e
	public final java.lang.String f
	
	    static AccountChangeEvent()
	    {
	        com.google.android.gms.auth.AccountChangeEvent.CREATOR = new bsj();
	        return;
	    }
	
	
	    public AccountChangeEvent(int p3, long p4, String p6, int p7, int p8, String p9)
	    {
	        this.a = p3;
	        this.b = p4;
	        this.c = ((String) a.c(p6));
	        this.d = p7;
	        this.e = p8;
	        this.f = p9;
	        return;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public boolean equals(Object p7)
	    {
	        int v0 = 1;
	        if (p7 != this) {
	            if (!(p7 instanceof com.google.android.gms.auth.AccountChangeEvent)) {
	                v0 = 0;
	            } else {
	                if ((this.a != ((com.google.android.gms.auth.AccountChangeEvent) p7).a) || ((this.b != ((com.google.android.gms.auth.AccountChangeEvent) p7).b) || ((!a.e(this.c, ((com.google.android.gms.auth.AccountChangeEvent) p7).c)) || ((this.d != ((com.google.android.gms.auth.AccountChangeEvent) p7).d) || ((this.e != ((com.google.android.gms.auth.AccountChangeEvent) p7).e) || (!a.e(this.f, ((com.google.android.gms.auth.AccountChangeEvent) p7).f))))))) {
	                    v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public int hashCode()
	    {
	        int v0_1 = new Object[6];
	        v0_1[0] = Integer.valueOf(this.a);
	        v0_1[1] = Long.valueOf(this.b);
	        v0_1[2] = this.c;
	        v0_1[3] = Integer.valueOf(this.d);
	        v0_1[4] = Integer.valueOf(this.e);
	        v0_1[5] = this.f;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public String toString()
	    {
	        String v0_0 = "UNKNOWN";
	        switch (this.d) {
	            case 1:
	                v0_0 = "ADDED";
	                break;
	            case 2:
	                v0_0 = "REMOVED";
	                break;
	            case 3:
	                v0_0 = "RENAMED_FROM";
	                break;
	            case 4:
	                v0_0 = "RENAMED_TO";
	                break;
	        }
	        return new StringBuilder("AccountChangeEvent {accountName = ").append(this.c).append(", changeType = ").append(v0_0).append(", changeData = ").append(this.f).append(", eventIndex = ").append(this.e).append("}").toString();
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bsj.a(this, p1);
	        return;
	    }
	
