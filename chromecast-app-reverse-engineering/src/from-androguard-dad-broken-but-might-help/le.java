	
	    le()
	    {
	        return;
	    }
	
	
	    public final Object a(android.content.Context p2)
	    {
	        return new android.widget.EdgeEffect(p2);
	    }
	
	
	    public final void a(Object p1, int p2, int p3)
	    {
	        ((android.widget.EdgeEffect) p1).setSize(p2, p3);
	        return;
	    }
	
	
	    public final boolean a(Object p2)
	    {
	        return ((android.widget.EdgeEffect) p2).isFinished();
	    }
	
	
	    public final boolean a(Object p2, float p3)
	    {
	        return a.a(p2, p3);
	    }
	
	
	    public boolean a(Object p2, float p3, float p4)
	    {
	        return a.a(p2, p3);
	    }
	
	
	    public final boolean a(Object p2, int p3)
	    {
	        ((android.widget.EdgeEffect) p2).onAbsorb(p3);
	        return 1;
	    }
	
	
	    public final boolean a(Object p2, android.graphics.Canvas p3)
	    {
	        return ((android.widget.EdgeEffect) p2).draw(p3);
	    }
	
	
	    public final void b(Object p1)
	    {
	        ((android.widget.EdgeEffect) p1).finish();
	        return;
	    }
	
	
	    public final boolean c(Object p2)
	    {
	        ((android.widget.EdgeEffect) p2).onRelease();
	        return ((android.widget.EdgeEffect) p2).isFinished();
	    }
	
