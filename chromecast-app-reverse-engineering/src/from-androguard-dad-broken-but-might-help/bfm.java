	
	    public bfm(String p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final int a()
	    {
	        int v0 = -1;
	        try {
	            if (this.a("scan_wifi", 0, bfm.c).b() == 200) {
	                v0 = 0;
	            }
	        } catch (int v0) {
	            v0 = -2;
	        } catch (java.io.IOException v1) {
	        }
	        return v0;
	    }
	
