	private  a
	private android.os.Bundle b
	private synthetic byo c
	
	    protected byp(byo p2, int p3, android.os.Bundle p4)
	    {
	        this.c = p2;
	        this(p2, Boolean.valueOf(1));
	        this.a = p3;
	        this.b = p4;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p4)
	    {
	        android.app.PendingIntent v0_0 = 0;
	        if (((Boolean) p4) != null) {
	            switch (this.a) {
	                case 0:
	                    if (!this.a()) {
	                        byo.a(this.c, 1, 0);
	                        this.a(new com.google.android.gms.common.ConnectionResult(8, 0));
	                    }
	                    break;
	                case 10:
	                    byo.a(this.c, 1, 0);
	                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
	                    break;
	                default:
	                    byo.a(this.c, 1, 0);
	                    if (this.b != null) {
	                        v0_0 = ((android.app.PendingIntent) this.b.getParcelable("pendingIntent"));
	                    }
	                    this.a(new com.google.android.gms.common.ConnectionResult(this.a, v0_0));
	            }
	        } else {
	            byo.a(this.c, 1, 0);
	        }
	        return;
	    }
	
