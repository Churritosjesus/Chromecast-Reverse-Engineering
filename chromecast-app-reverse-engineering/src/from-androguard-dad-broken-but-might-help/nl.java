	
	    nl(android.content.Context p1, android.view.Window p2, ng p3)
	    {
	        this(p1, p2, p3);
	        return;
	    }
	
	
	    final android.view.View b(android.view.View p2, String p3, android.content.Context p4, android.util.AttributeSet p5)
	    {
	        int v0_0 = super.b(p2, p3, p4, p5);
	        if (v0_0 == 0) {
	            if (!(this.c instanceof android.view.LayoutInflater$Factory2)) {
	                v0_0 = 0;
	            } else {
	                v0_0 = ((android.view.LayoutInflater$Factory2) this.c).onCreateView(p2, p3, p4, p5);
	            }
	        }
	        return v0_0;
	    }
	
