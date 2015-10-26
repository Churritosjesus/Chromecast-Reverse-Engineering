	private static java.util.Locale a
	private static java.lang.String b
	private static java.lang.String c
	
	    static ec()
	    {
	        ec.a = new java.util.Locale("", "");
	        ec.b = "Arab";
	        ec.c = "Hebr";
	        return;
	    }
	
	
	    public static int a(java.util.Locale p4)
	    {
	        int v0 = 1;
	        if ((p4 == null) || (p4.equals(ec.a))) {
	            v0 = 0;
	        } else {
	            boolean v2_4 = dx.a(dx.b(p4.toString()));
	            if (v2_4) {
	                if ((!v2_4.equalsIgnoreCase(ec.b)) && (!v2_4.equalsIgnoreCase(ec.c))) {
	                }
	            } else {
	                switch (Character.getDirectionality(p4.getDisplayName(p4).charAt(0))) {
	                    case 1:
	                    case 2:
	                        break;
	                    case 1:
	                    case 2:
	                        break;
	                    default:
	                        v0 = 0;
	                }
	            }
	        }
	        return v0;
	    }
	
