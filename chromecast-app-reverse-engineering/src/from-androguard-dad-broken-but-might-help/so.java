	private synthetic sm a
	
	    so(sm p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final int getCount()
	    {
	        return sm.a(this.a).getChildCount();
	    }
	
	
	    public final Object getItem(int p2)
	    {
	        return ((sq) sm.a(this.a).getChildAt(p2)).a;
	    }
	
	
	    public final long getItemId(int p3)
	    {
	        return ((long) p3);
	    }
	
	
	    public final android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        if (p5 != null) {
	            ((sq) p5).a = ((ml) this.getItem(p4));
	            ((sq) p5).a();
	        } else {
	            p5 = sm.a(this.a, ((ml) this.getItem(p4)), 1);
	        }
	        return p5;
	    }
	
