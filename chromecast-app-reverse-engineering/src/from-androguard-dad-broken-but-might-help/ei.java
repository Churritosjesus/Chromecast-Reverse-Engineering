	 ek a
	 el b
	 en c
	
	    ei()
	    {
	        return;
	    }
	
	
	    public static boolean a(java.util.Map p3, java.util.Collection p4)
	    {
	        int v0_0 = p3.size();
	        int v1_1 = p3.keySet().iterator();
	        while (v1_1.hasNext()) {
	            if (!p4.contains(v1_1.next())) {
	                v1_1.remove();
	            }
	        }
	        int v0_1;
	        if (v0_0 == p3.size()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public static boolean a(java.util.Set p4, Object p5)
	    {
	        int v0 = 1;
	        if (p4 != p5) {
	            if (!(p5 instanceof java.util.Set)) {
	                v0 = 0;
	            } else {
	                try {
	                    if ((p4.size() != ((java.util.Set) p5).size()) || (!p4.containsAll(((java.util.Set) p5)))) {
	                        v0 = 0;
	                    }
	                } catch (int v0) {
	                    v0 = 0;
	                } catch (int v0) {
	                    v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public final Object[] a(Object[] p5, int p6)
	    {
	        Object[] v0_1;
	        int v2 = this.a();
	        if (p5.length >= v2) {
	            v0_1 = p5;
	        } else {
	            v0_1 = ((Object[]) reflect.Array.newInstance(p5.getClass().getComponentType(), v2));
	        }
	        int v1_0 = 0;
	        while (v1_0 < v2) {
	            v0_1[v1_0] = this.a(v1_0, p6);
	            v1_0++;
	        }
	        if (v0_1.length > v2) {
	            v0_1[v2] = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final Object[] b(int p5)
	    {
	        int v1 = this.a();
	        Object[] v2 = new Object[v1];
	        int v0 = 0;
	        while (v0 < v1) {
	            v2[v0] = this.a(v0, p5);
	            v0++;
	        }
	        return v2;
	    }
	
