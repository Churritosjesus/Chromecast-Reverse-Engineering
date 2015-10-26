	final android.content.ContentResolver a
	final eh b
	
	    public abg(android.content.ContentResolver p3)
	    {
	        this.a = p3;
	        this.b = new eh(20);
	        return;
	    }
	
	
	    public final void a(acx p4, abs p5)
	    {
	        java.util.concurrent.Executor v1_0 = p4.j;
	        if (v1_0 == null) {
	            if (p5 != null) {
	                p5.d();
	            }
	        } else {
	            abh v0_2 = ((byte[]) this.b.a(v1_0));
	            if (v0_2 == null) {
	                Void[] v2_1 = new Void[0];
	                new abh(this, v1_0, p4, p5).executeOnExecutor(android.os.AsyncTask.SERIAL_EXECUTOR, v2_1);
	            } else {
	                p4.a(v0_2);
	                if (p5 != null) {
	                    p5.b();
	                }
	            }
	        }
	        return;
	    }
	
