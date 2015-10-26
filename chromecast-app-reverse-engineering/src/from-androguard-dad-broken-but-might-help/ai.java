	private android.graphics.Rect a
	private synthetic ak b
	
	    ai(ak p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final android.graphics.Rect onGetEpicenter(android.transition.Transition p2)
	    {
	        if ((this.a == null) && (this.b.a != null)) {
	            this.a = a.a(this.b.a);
	        }
	        return this.a;
	    }
	
