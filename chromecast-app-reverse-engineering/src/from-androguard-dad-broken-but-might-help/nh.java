	
	    nh()
	    {
	        return;
	    }
	
	
	    static nh a(android.content.Context p2, android.view.Window p3, ng p4)
	    {
	        no v0_2;
	        no v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 14) {
	            if (v0_0 < 11) {
	                v0_2 = new no(p2, p3, p4);
	            } else {
	                v0_2 = new nl(p2, p3, p4);
	            }
	        } else {
	            v0_2 = new nm(p2, p3, p4);
	        }
	        return v0_2;
	    }
	
