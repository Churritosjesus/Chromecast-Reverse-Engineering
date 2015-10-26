	public static final bvo CREATOR
	public static final com.google.android.gms.common.ConnectionResult a
	public final  b
	public final  c
	public final android.app.PendingIntent d
	
	    static ConnectionResult()
	    {
	        com.google.android.gms.common.ConnectionResult.a = new com.google.android.gms.common.ConnectionResult(0, 0);
	        com.google.android.gms.common.ConnectionResult.CREATOR = new bvo();
	        return;
	    }
	
	
	    public ConnectionResult(int p1, int p2, android.app.PendingIntent p3)
	    {
	        this.b = p1;
	        this.c = p2;
	        this.d = p3;
	        return;
	    }
	
	
	    public ConnectionResult(int p2, android.app.PendingIntent p3)
	    {
	        this(1, p2, p3);
	        return;
	    }
	
	
	    public final void a(android.app.Activity p8, int p9)
	    {
	        if (this.a()) {
	            p8.startIntentSenderForResult(this.d.getIntentSender(), p9, 0, 0, 0, 0);
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        if ((this.c == 0) || (this.d == null)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_1;
	        if (this.c != 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (p5 != this) {
	            if ((p5 instanceof com.google.android.gms.common.ConnectionResult)) {
	                if ((this.c != ((com.google.android.gms.common.ConnectionResult) p5).c) || (!a.e(this.d, ((com.google.android.gms.common.ConnectionResult) p5).d))) {
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
	        int v0_1 = new Object[2];
	        v0_1[0] = Integer.valueOf(this.c);
	        v0_1[1] = this.d;
	        return java.util.Arrays.hashCode(v0_1);
	    }
	
	
	    public final String toString()
	    {
	        String v0_1;
	        String v1_0 = a.b(this);
	        switch (this.c) {
	            case 0:
	                v0_1 = "SUCCESS";
	                break;
	            case 1:
	                v0_1 = "SERVICE_MISSING";
	                break;
	            case 2:
	                v0_1 = "SERVICE_VERSION_UPDATE_REQUIRED";
	                break;
	            case 3:
	                v0_1 = "SERVICE_DISABLED";
	                break;
	            case 4:
	                v0_1 = "SIGN_IN_REQUIRED";
	                break;
	            case 5:
	                v0_1 = "INVALID_ACCOUNT";
	                break;
	            case 6:
	                v0_1 = "RESOLUTION_REQUIRED";
	                break;
	            case 7:
	                v0_1 = "NETWORK_ERROR";
	                break;
	            case 8:
	                v0_1 = "INTERNAL_ERROR";
	                break;
	            case 9:
	                v0_1 = "SERVICE_INVALID";
	                break;
	            case 10:
	                v0_1 = "DEVELOPER_ERROR";
	                break;
	            case 11:
	                v0_1 = "LICENSE_CHECK_FAILED";
	                break;
	            case 12:
	            default:
	                v0_1 = new StringBuilder("unknown status code ").append(this.c).toString();
	                break;
	            case 13:
	                v0_1 = "CANCELED";
	                break;
	            case 14:
	                v0_1 = "TIMEOUT";
	                break;
	            case 15:
	                v0_1 = "INTERRUPTED";
	                break;
	            case 16:
	                v0_1 = "API_UNAVAILABLE";
	                break;
	            case 17:
	                v0_1 = "SIGN_IN_FAILED";
	                break;
	            case 18:
	                v0_1 = "SERVICE_UPDATING";
	                break;
	        }
	        return v1_0.a("statusCode", v0_1).a("resolution", this.d).toString();
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        bvo.a(this, p1, p2);
	        return;
	    }
	
