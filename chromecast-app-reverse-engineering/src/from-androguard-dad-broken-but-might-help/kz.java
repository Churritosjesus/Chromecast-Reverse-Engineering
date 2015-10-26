	private static final I a
	
	    static kz()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16843828;
	        kz.a = v0_1;
	        return;
	    }
	
	
	    public static int a(Object p1)
	    {
	        int v0;
	        if (p1 == null) {
	            v0 = 0;
	        } else {
	            v0 = ((android.view.WindowInsets) p1).getSystemWindowInsetTop();
	        }
	        return v0;
	    }
	
	
	    public static android.graphics.drawable.Drawable a(android.content.Context p2)
	    {
	        android.content.res.TypedArray v0_1 = p2.obtainStyledAttributes(kz.a);
	        try {
	            Throwable v1_1 = v0_1.getDrawable(0);
	            v0_1.recycle();
	            return v1_1;
	        } catch (Throwable v1_2) {
	            v0_1.recycle();
	            throw v1_2;
	        }
	    }
	
	
	    public static void a(android.view.View p1)
	    {
	        if ((p1 instanceof lb)) {
	            p1.setOnApplyWindowInsetsListener(new la());
	            p1.setSystemUiVisibility(1280);
	        }
	        return;
	    }
	
	
	    public static void a(android.view.View p4, Object p5, int p6)
	    {
	        android.view.WindowInsets v5_1 = ((android.view.WindowInsets) p5);
	        if (p6 != 3) {
	            if (p6 == 5) {
	                v5_1 = ((android.view.WindowInsets) p5).replaceSystemWindowInsets(0, ((android.view.WindowInsets) p5).getSystemWindowInsetTop(), ((android.view.WindowInsets) p5).getSystemWindowInsetRight(), ((android.view.WindowInsets) p5).getSystemWindowInsetBottom());
	            }
	        } else {
	            v5_1 = ((android.view.WindowInsets) p5).replaceSystemWindowInsets(((android.view.WindowInsets) p5).getSystemWindowInsetLeft(), ((android.view.WindowInsets) p5).getSystemWindowInsetTop(), 0, ((android.view.WindowInsets) p5).getSystemWindowInsetBottom());
	        }
	        p4.dispatchApplyWindowInsets(v5_1);
	        return;
	    }
	
	
	    public static void a(android.view.ViewGroup$MarginLayoutParams p4, Object p5, int p6)
	    {
	        android.view.WindowInsets v5_1 = ((android.view.WindowInsets) p5);
	        if (p6 != 3) {
	            if (p6 == 5) {
	                v5_1 = ((android.view.WindowInsets) p5).replaceSystemWindowInsets(0, ((android.view.WindowInsets) p5).getSystemWindowInsetTop(), ((android.view.WindowInsets) p5).getSystemWindowInsetRight(), ((android.view.WindowInsets) p5).getSystemWindowInsetBottom());
	            }
	        } else {
	            v5_1 = ((android.view.WindowInsets) p5).replaceSystemWindowInsets(((android.view.WindowInsets) p5).getSystemWindowInsetLeft(), ((android.view.WindowInsets) p5).getSystemWindowInsetTop(), 0, ((android.view.WindowInsets) p5).getSystemWindowInsetBottom());
	        }
	        p4.leftMargin = v5_1.getSystemWindowInsetLeft();
	        p4.topMargin = v5_1.getSystemWindowInsetTop();
	        p4.rightMargin = v5_1.getSystemWindowInsetRight();
	        p4.bottomMargin = v5_1.getSystemWindowInsetBottom();
	        return;
	    }
	
