	private java.lang.reflect.Method a
	
	    public uk()
	    {
	        if ((android.os.Build$VERSION.SDK_INT >= 16) && (android.os.Build$VERSION.SDK_INT <= 17)) {
	            try {
	                Class[] v2_1 = new Class[0];
	                this.a = android.media.MediaRouter.getMethod("getSystemAudioRoute", v2_1);
	            } catch (NoSuchMethodException v0) {
	            }
	            return;
	        } else {
	            throw new UnsupportedOperationException();
	        }
	    }
	
	
	    public final Object a(Object p4)
	    {
	        reflect.InvocationTargetException v0_2;
	        if (this.a == null) {
	            v0_2 = ((android.media.MediaRouter) p4).getRouteAt(0);
	        } else {
	            try {
	                Object[] v1_1 = new Object[0];
	                v0_2 = this.a.invoke(((android.media.MediaRouter) p4), v1_1);
	            } catch (reflect.InvocationTargetException v0) {
	            } catch (reflect.InvocationTargetException v0) {
	            }
	        }
	        return v0_2;
	    }
	
