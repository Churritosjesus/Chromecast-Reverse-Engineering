	public static final dfd a
	private final java.util.Map b
	
	    static dfd()
	    {
	        dfd.a = new dfd(new dfe());
	        return;
	    }
	
	
	    dfd(dfe p2)
	    {
	        this.b = dgs.a(p2.a);
	        return;
	    }
	
	
	    private static dke a(java.security.cert.X509Certificate p1)
	    {
	        return dgs.a(dke.a(p1.getPublicKey().getEncoded()));
	    }
	
	
	    public static String a(java.security.cert.Certificate p2)
	    {
	        if ((p2 instanceof java.security.cert.X509Certificate)) {
	            return new StringBuilder("sha1/").append(djy.a(dfd.a(((java.security.cert.X509Certificate) p2)).b)).toString();
	        } else {
	            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
	        }
	    }
	
	
	    public final void a(String p8, java.util.List p9)
	    {
	        StringBuilder v4_2;
	        int v3 = 0;
	        javax.net.ssl.SSLPeerUnverifiedException v0_2 = ((java.util.Set) this.b.get(p8));
	        String v1_0 = p8.indexOf(46);
	        if (v1_0 == p8.lastIndexOf(46)) {
	            v4_2 = 0;
	        } else {
	            v4_2 = ((java.util.Set) this.b.get(new StringBuilder("*.").append(p8.substring((v1_0 + 1))).toString()));
	        }
	        if ((v0_2 != null) || (v4_2 != null)) {
	            if ((v0_2 == null) || (v4_2 == null)) {
	                if (v0_2 == null) {
	                    v3 = v4_2;
	                } else {
	                    v3 = v0_2;
	                }
	            } else {
	                String v1_8 = new java.util.LinkedHashSet();
	                v1_8.addAll(v0_2);
	                v1_8.addAll(v4_2);
	                v3 = v1_8;
	            }
	        }
	        if (v3 != 0) {
	            StringBuilder v4_4 = p9.size();
	            String v1_9 = 0;
	            while (v1_9 < v4_4) {
	                if (!v3.contains(dfd.a(((java.security.cert.X509Certificate) p9.get(v1_9))))) {
	                    v1_9++;
	                }
	            }
	            StringBuilder v4_5 = new StringBuilder("Certificate pinning failure!").append("\n  Peer certificate chain:");
	            int v5_2 = p9.size();
	            String v1_12 = 0;
	            while (v1_12 < v5_2) {
	                javax.net.ssl.SSLPeerUnverifiedException v0_16 = ((java.security.cert.X509Certificate) p9.get(v1_12));
	                v4_5.append("\n    ").append(dfd.a(v0_16)).append(": ").append(v0_16.getSubjectDN().getName());
	                v1_12++;
	            }
	            v4_5.append("\n  Pinned certificates for ").append(p8).append(":");
	            String v1_14 = v3.iterator();
	            while (v1_14.hasNext()) {
	                v4_5.append("\n    sha1/").append(djy.a(((dke) v1_14.next()).b));
	            }
	            throw new javax.net.ssl.SSLPeerUnverifiedException(v4_5.toString());
	        }
	        return;
	    }
	
