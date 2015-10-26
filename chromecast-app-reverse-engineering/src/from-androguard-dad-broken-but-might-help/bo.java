	private static bp a
	
	    static bo()
	    {
	        bp v0_0 = android.os.Build$VERSION.SDK_INT;
	        if (v0_0 < 22) {
	            if (v0_0 < 21) {
	                if (v0_0 < 19) {
	                    if (v0_0 < 11) {
	                        bo.a = new bp();
	                    } else {
	                        bo.a = new bq();
	                    }
	                } else {
	                    bo.a = new br();
	                }
	            } else {
	                bo.a = new bs();
	            }
	        } else {
	            bo.a = new bt();
	        }
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1)
	    {
	        bo.a.a(p1);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1, float p2, float p3)
	    {
	        bo.a.a(p1, p2, p3);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1, int p2)
	    {
	        bo.a.a(p1, p2);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p6, int p7, int p8, int p9, int p10)
	    {
	        bo.a.a(p6, p7, p8, p9, p10);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1, android.content.res.ColorStateList p2)
	    {
	        bo.a.a(p1, p2);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1, android.graphics.PorterDuff$Mode p2)
	    {
	        bo.a.a(p1, p2);
	        return;
	    }
	
	
	    public static void a(android.graphics.drawable.Drawable p1, boolean p2)
	    {
	        bo.a.a(p1, p2);
	        return;
	    }
	
	
	    public static boolean b(android.graphics.drawable.Drawable p1)
	    {
	        return bo.a.b(p1);
	    }
	
	
	    public static android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable p1)
	    {
	        return bo.a.c(p1);
	    }
	
	
	    public static android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable p1)
	    {
	        if ((p1 instanceof bu)) {
	            p1 = ((bu) p1).a();
	        }
	        return p1;
	    }
	
