	private static fl a
	
	    static fi()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            fi.a = new fl();
	        } else {
	            fi.a = new fk();
	        }
	        return;
	    }
	
	
	    public static boolean a(android.view.KeyEvent p2)
	    {
	        return fi.a.b(p2.getMetaState());
	    }
	
	
	    public static boolean a(android.view.KeyEvent p3, int p4)
	    {
	        return fi.a.a(p3.getMetaState(), 1);
	    }
	
	
	    public static void b(android.view.KeyEvent p1)
	    {
	        fi.a.a(p1);
	        return;
	    }
	
