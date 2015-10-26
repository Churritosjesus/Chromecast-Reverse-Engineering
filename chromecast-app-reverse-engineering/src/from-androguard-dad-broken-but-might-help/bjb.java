	private synthetic biy a
	
	    bjb(biy p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean onError(android.media.MediaPlayer p2, int p3, int p4)
	    {
	        int v0_2;
	        if (biy.a(this.a) == null) {
	            v0_2 = 0;
	        } else {
	            biy.a(this.a).a(p3, p4);
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
