	private static java.lang.reflect.Method a
	
	    static tm()
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 18) {
	            try {
	                Class[] v2_1 = new Class[2];
	                v2_1[0] = android.graphics.Rect;
	                v2_1[1] = android.graphics.Rect;
	                reflect.Method v0_2 = android.view.View.getDeclaredMethod("computeFitSystemWindows", v2_1);
	                tm.a = v0_2;
	            } catch (reflect.Method v0) {
	            }
	            if (!v0_2.isAccessible()) {
	                tm.a.setAccessible(1);
	            }
	        }
	        return;
	    }
	
	
	    public static int a(int p1, int p2)
	    {
	        return (p1 | p2);
	    }
	
	
	    public static void a(android.view.View p3, android.graphics.Rect p4, android.graphics.Rect p5)
	    {
	        if (tm.a != null) {
	            try {
	                Object[] v1_1 = new Object[2];
	                v1_1[0] = p4;
	                v1_1[1] = p5;
	                tm.a.invoke(p3, v1_1);
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
	
	    public static boolean a(android.view.View p2)
	    {
	        int v0 = 1;
	        if (gt.g(p2) != 1) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public static void b(android.view.View p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 16) {
	            try {
	                Class[] v2_1 = new Class[0];
	                IllegalAccessException v0_2 = p3.getClass().getMethod("makeOptionalFitsSystemWindows", v2_1);
	            } catch (IllegalAccessException v0) {
	            } catch (IllegalAccessException v0) {
	            } catch (IllegalAccessException v0) {
	            }
	            if (!v0_2.isAccessible()) {
	                v0_2.setAccessible(1);
	            }
	            Object[] v1_5 = new Object[0];
	            v0_2.invoke(p3, v1_5);
	        }
	        return;
	    }
	
