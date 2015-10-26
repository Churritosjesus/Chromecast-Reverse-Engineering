	private static gb a
	
	    static fx()
	    {
	        fy v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 14) {
	            if (v0_0 < 11) {
	                fx.a = new fy();
	            } else {
	                fx.a = new fz();
	            }
	        } else {
	            fx.a = new ga();
	        }
	        return;
	    }
	
	
	    public static android.view.MenuItem a(android.view.MenuItem p1, android.view.View p2)
	    {
	        android.view.MenuItem v0_2;
	        if (!(p1 instanceof cd)) {
	            v0_2 = fx.a.a(p1, p2);
	        } else {
	            v0_2 = ((cd) p1).setActionView(p2);
	        }
	        return v0_2;
	    }
	
	
	    public static android.view.MenuItem a(android.view.MenuItem p2, fb p3)
	    {
	        if (!(p2 instanceof cd)) {
	            android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
	        } else {
	            p2 = ((cd) p2).a(p3);
	        }
	        return p2;
	    }
	
	
	    public static android.view.View a(android.view.MenuItem p1)
	    {
	        android.view.View v0_2;
	        if (!(p1 instanceof cd)) {
	            v0_2 = fx.a.a(p1);
	        } else {
	            v0_2 = ((cd) p1).getActionView();
	        }
	        return v0_2;
	    }
	
	
	    public static void a(android.view.MenuItem p1, int p2)
	    {
	        if (!(p1 instanceof cd)) {
	            fx.a.a(p1, p2);
	        } else {
	            ((cd) p1).setShowAsAction(p2);
	        }
	        return;
	    }
	
	
	    public static android.view.MenuItem b(android.view.MenuItem p1, int p2)
	    {
	        android.view.MenuItem v0_2;
	        if (!(p1 instanceof cd)) {
	            v0_2 = fx.a.b(p1, p2);
	        } else {
	            v0_2 = ((cd) p1).setActionView(p2);
	        }
	        return v0_2;
	    }
	
	
	    public static boolean b(android.view.MenuItem p1)
	    {
	        boolean v0_2;
	        if (!(p1 instanceof cd)) {
	            v0_2 = fx.a.b(p1);
	        } else {
	            v0_2 = ((cd) p1).expandActionView();
	        }
	        return v0_2;
	    }
	
	
	    public static boolean c(android.view.MenuItem p1)
	    {
	        boolean v0_2;
	        if (!(p1 instanceof cd)) {
	            v0_2 = fx.a.c(p1);
	        } else {
	            v0_2 = ((cd) p1).isActionViewExpanded();
	        }
	        return v0_2;
	    }
	
