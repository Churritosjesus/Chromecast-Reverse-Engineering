	private synthetic com.google.android.gms.cast.CastDevice a
	private synthetic bbn b
	
	    bbq(bbn p1, com.google.android.gms.cast.CastDevice p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final synthetic void a(bwm p5)
	    {
	        if (((com.google.android.gms.common.api.Status) p5).a()) {
	            this.b.a(this.a);
	        } else {
	            bbn v0_2 = new Object[1];
	            v0_2[0] = Integer.valueOf(((com.google.android.gms.common.api.Status) p5).f);
	            bbn.a(this.b, 1);
	        }
	        return;
	    }
	
