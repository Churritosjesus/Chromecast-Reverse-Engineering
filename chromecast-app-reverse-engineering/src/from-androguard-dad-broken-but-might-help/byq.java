	private synthetic byo a
	
	    public byq(byo p1, android.os.Looper p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p8)
	    {
	        if (((p8.what != 1) && ((p8.what != 5) && (p8.what != 6))) || (this.a.m())) {
	            if (p8.what != 3) {
	                if (p8.what != 4) {
	                    if ((p8.what != 2) || (this.a.k())) {
	                        if ((p8.what != 2) && ((p8.what != 1) && ((p8.what != 5) && (p8.what != 6)))) {
	                            android.util.Log.wtf("GmsClient", "Don\'t know how to handle this message.");
	                        } else {
	                            ((byr) p8.obj).b();
	                        }
	                    } else {
	                        ((byr) p8.obj).c();
	                    }
	                } else {
	                    byo.a(this.a, 4, 0);
	                    byo.c(this.a).a(((Integer) p8.obj).intValue());
	                    byo.a(this.a, 4, 1, 0);
	                }
	            } else {
	                String v1_6 = new com.google.android.gms.common.ConnectionResult(((Integer) p8.obj).intValue(), 0);
	                if (!byo.a(this.a)) {
	                    byo.c(this.a).a(v1_6);
	                } else {
	                    byo.b(this.a).a(v1_6);
	                }
	            }
	        } else {
	            ((byr) p8.obj).c();
	        }
	        return;
	    }
	
