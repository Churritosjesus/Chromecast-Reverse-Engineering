	private static final I a
	
	    static mv()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16843531;
	        mv.a = v0_1;
	        return;
	    }
	
	
	    public static android.graphics.drawable.Drawable a(android.app.Activity p2)
	    {
	        android.content.res.TypedArray v0_1 = p2.obtainStyledAttributes(mv.a);
	        android.graphics.drawable.Drawable v1_1 = v0_1.getDrawable(0);
	        v0_1.recycle();
	        return v1_1;
	    }
	
	
	    public static mw a(android.app.Activity p6, android.graphics.drawable.Drawable p7, int p8)
	    {
	        mw v1_1 = new mw(p6);
	        if (v1_1.a == null) {
	            if (v1_1.c == null) {
	                android.util.Log.w("ActionBarDrawerToggleHoneycomb", "Couldn\'t set home-as-up indicator");
	            } else {
	                v1_1.c.setImageDrawable(p7);
	            }
	        } else {
	            try {
	                String v0_4 = p6.getActionBar();
	                String v2_1 = v1_1.a;
	                String v3_1 = new Object[1];
	                v3_1[0] = p7;
	                v2_1.invoke(v0_4, v3_1);
	                String v2_2 = v1_1.b;
	                String v3_3 = new Object[1];
	                v3_3[0] = Integer.valueOf(p8);
	                v2_2.invoke(v0_4, v3_3);
	            } catch (String v0_5) {
	                android.util.Log.w("ActionBarDrawerToggleHoneycomb", "Couldn\'t set home-as-up indicator via JB-MR2 API", v0_5);
	            }
	        }
	        return v1_1;
	    }
	
	
	    public static mw a(mw p5, android.app.Activity p6, int p7)
	    {
	        if (p5 == null) {
	            p5 = new mw(p6);
	        }
	        if (p5.a != null) {
	            try {
	                Exception v0_1 = p6.getActionBar();
	                CharSequence v1_0 = p5.b;
	                String v2_1 = new Object[1];
	                v2_1[0] = Integer.valueOf(p7);
	                v1_0.invoke(v0_1, v2_1);
	            } catch (Exception v0_2) {
	                android.util.Log.w("ActionBarDrawerToggleHoneycomb", "Couldn\'t set content description via JB-MR2 API", v0_2);
	            }
	            if (android.os.Build$VERSION.SDK_INT <= 19) {
	                v0_1.setSubtitle(v0_1.getSubtitle());
	            }
	        }
	        return p5;
	    }
	
