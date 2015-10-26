	private synthetic com.google.android.apps.chromecast.app.MainActivity b
	
	    public anb(com.google.android.apps.chromecast.app.MainActivity p2)
	    {
	        this.b = p2;
	        this(p2.b);
	        return;
	    }
	
	
	    public final int a()
	    {
	        return com.google.android.apps.chromecast.app.MainActivity.a(this.b).size();
	    }
	
	
	    public final j a(int p6)
	    {
	        ama v0_9;
	        if (com.google.android.apps.chromecast.app.MainActivity.a(this.b).get(p6) != ana.b) {
	            try {
	                v0_9 = ((j) ((ana) com.google.android.apps.chromecast.app.MainActivity.a(this.b).get(p6)).e.newInstance());
	            } catch (ama v0_12) {
	                blp v1_4 = com.google.android.apps.chromecast.app.MainActivity.c(this.b);
	                Object[] v3_2 = new Object[1];
	                v3_2[0] = v0_12.getMessage();
	                v1_4.a("InstantiationException: %s", v3_2);
	                v0_9 = new ama();
	            } catch (ama v0_10) {
	                blp v1_2 = com.google.android.apps.chromecast.app.MainActivity.c(this.b);
	                Object[] v3_1 = new Object[1];
	                v3_1[0] = v0_10.getMessage();
	                v1_2.a("IllegalAccessException: %s", v3_1);
	            }
	        } else {
	            com.google.android.apps.chromecast.app.MainActivity.a(this.b, new ama());
	            v0_9 = com.google.android.apps.chromecast.app.MainActivity.b(this.b);
	        }
	        return v0_9;
	    }
	
	
	    public final synthetic CharSequence b(int p3)
	    {
	        return this.b.getString(((ana) com.google.android.apps.chromecast.app.MainActivity.a(this.b).get(p3)).d);
	    }
	
