	private synthetic ajd a
	
	    aje(ajd p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        ajd v0 = this.a;
	        if (p4.what == v0.d) {
	            android.content.Context v1_1 = p4.getData();
	            if (v1_1.getString("com.facebook.platform.status.ERROR_TYPE") == null) {
	                v0.a(v1_1);
	            } else {
	                v0.a(0);
	            }
	            v0.a.unbindService(v0);
	        }
	        return;
	    }
	
