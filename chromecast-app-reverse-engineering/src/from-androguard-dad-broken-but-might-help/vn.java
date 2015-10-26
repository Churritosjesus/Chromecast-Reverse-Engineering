	private synthetic vl a
	
	    vn(vl p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p4, android.content.Intent p5)
	    {
	        if ((p5.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) && (p5.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)) {
	            vl v0_5 = p5.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
	            if ((v0_5 >= null) && (v0_5 != vl.c(this.a))) {
	                vl.b(this.a);
	            }
	        }
	        return;
	    }
	
