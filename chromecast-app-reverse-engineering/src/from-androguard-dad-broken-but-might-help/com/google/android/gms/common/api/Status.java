	public static final bwo CREATOR
	public static final com.google.android.gms.common.api.Status a
	public static final com.google.android.gms.common.api.Status b
	public static final com.google.android.gms.common.api.Status c
	public static final com.google.android.gms.common.api.Status d
	public final  e
	public final  f
	public final java.lang.String g
	public final android.app.PendingIntent h
	
	    static Status()
	    {
	        com.google.android.gms.common.api.Status.a = new com.google.android.gms.common.api.Status(0);
	        new com.google.android.gms.common.api.Status(14);
	        com.google.android.gms.common.api.Status.b = new com.google.android.gms.common.api.Status(8);
	        com.google.android.gms.common.api.Status.c = new com.google.android.gms.common.api.Status(15);
	        com.google.android.gms.common.api.Status.d = new com.google.android.gms.common.api.Status(16);
	        com.google.android.gms.common.api.Status.CREATOR = new bwo();
	        return;
	    }
	
	
	    public Status(int p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public Status(int p1, int p2, String p3, android.app.PendingIntent p4)
	    {
	        this.e = p1;
	        this.f = p2;
	        this.g = p3;
	        this.h = p4;
	        return;
	    }
	
	
	    public Status(int p3, String p4)
	    {
	        this(1, p3, p4, 0);
	        return;
	    }
	
	
	    public Status(int p2, String p3, android.app.PendingIntent p4)
	    {
	        this(1, p2, p3, p4);
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0_1;
	        if (this.f > 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final com.google.android.gms.common.api.Status b()
	    {
	        return this;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        int v0 = 0;
	        if (((p4 instanceof com.google.android.gms.common.api.Status)) && ((this.e == ((com.google.android.gms.common.api.Status) p4).e) && ((this.f == ((com.google.android.gms.common.api.Status) p4).f) && ((a.e(this.g, ((com.google.android.gms.common.api.Status) p4).g)) && (a.e(this.h, ((com.google.android.gms.common.api.Status) p4).h)))))) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_1 = new Object[4];
	        v0_1[0] = Integer.valueOf(this.e);
	        v0_1[1] = Integer.valueOf(this.f);
	        v0_1[2] = this.g;
	        v0_1[3] = this.h;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_2;
	        String v1_0 = a.b(this);
	        if (this.g == null) {
	            String v0_1 = this.f;
	            switch (v0_1) {
	                case -1:
	                    v0_2 = "SUCCESS_CACHE";
	                    break;
	                case 0:
	                    v0_2 = "SUCCESS";
	                    break;
	                case 1:
	                    v0_2 = "SERVICE_MISSING";
	                    break;
	                case 2:
	                    v0_2 = "SERVICE_VERSION_UPDATE_REQUIRED";
	                    break;
	                case 3:
	                    v0_2 = "SERVICE_DISABLED";
	                    break;
	                case 4:
	                    v0_2 = "SIGN_IN_REQUIRED";
	                    break;
	                case 5:
	                    v0_2 = "INVALID_ACCOUNT";
	                    break;
	                case 6:
	                    v0_2 = "RESOLUTION_REQUIRED";
	                    break;
	                case 7:
	                    v0_2 = "NETWORK_ERROR";
	                    break;
	                case 8:
	                    v0_2 = "INTERNAL_ERROR";
	                    break;
	                case 9:
	                    v0_2 = "SERVICE_INVALID";
	                    break;
	                case 10:
	                    v0_2 = "DEVELOPER_ERROR";
	                    break;
	                case 11:
	                    v0_2 = "LICENSE_CHECK_FAILED";
	                    break;
	                case 13:
	                    v0_2 = "ERROR_OPERATION_FAILED";
	                    break;
	                case 14:
	                    v0_2 = "INTERRUPTED";
	                    break;
	                case 15:
	                    v0_2 = "TIMEOUT";
	                    break;
	                case 16:
	                    v0_2 = "CANCELED";
	                    break;
	                case 3000:
	                    v0_2 = "AUTH_API_INVALID_CREDENTIALS";
	                    break;
	                case 3001:
	                    v0_2 = "AUTH_API_ACCESS_FORBIDDEN";
	                    break;
	                case 3002:
	                    v0_2 = "AUTH_API_CLIENT_ERROR";
	                    break;
	                case 3003:
	                    v0_2 = "AUTH_API_SERVER_ERROR";
	                    break;
	                case 3004:
	                    v0_2 = "AUTH_TOKEN_ERROR";
	                    break;
	                case 3005:
	                    v0_2 = "AUTH_URL_RESOLUTION";
	                    break;
	                default:
	                    v0_2 = new StringBuilder("unknown status code: ").append(v0_1).toString();
	            }
	        } else {
	            v0_2 = this.g;
	        }
	        return v1_0.a("statusCode", v0_2).a("resolution", this.h).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bwo.a(this, p1, p2);
	        return;
	    }
	
