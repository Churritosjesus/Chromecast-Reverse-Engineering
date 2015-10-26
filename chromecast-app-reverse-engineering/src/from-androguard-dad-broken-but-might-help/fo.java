	
	    fo()
	    {
	        return;
	    }
	
	
	    public void a(android.view.LayoutInflater p4, fs p5)
	    {
	        int v1;
	        if (p5 == null) {
	            v1 = 0;
	        } else {
	            v1 = new fr(p5);
	        }
	        p4.setFactory2(v1);
	        android.view.LayoutInflater$Factory2 v0_3 = p4.getFactory();
	        if (!(v0_3 instanceof android.view.LayoutInflater$Factory2)) {
	            b.a(p4, v1);
	        } else {
	            b.a(p4, ((android.view.LayoutInflater$Factory2) v0_3));
	        }
	        return;
	    }
	
