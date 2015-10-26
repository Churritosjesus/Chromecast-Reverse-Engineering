	private cq a
	
	    public de(cq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        try {
	            this.a.g();
	        } catch (String v0_1) {
	            android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in play. ").append(v0_1).toString());
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        try {
	            this.a.h();
	        } catch (String v0_1) {
	            android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in pause. ").append(v0_1).toString());
	        }
	        return;
	    }
	
