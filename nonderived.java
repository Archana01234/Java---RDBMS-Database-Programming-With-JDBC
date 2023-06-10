package com.p2;

import com.p1.protection;

public final class nonderived {
	public nonderived() {
		protection p=new protection();
	
		System.out.println("nonderived's constructor ");
		// System.out.println("n :"+p.n);
		System.out.println("n_pub :"+p.n_pub);
		//System.out.println("n_pri :"+p.n_pri);
		//System.out.println("n_pro :"+p.n_pro);
		

}
}
