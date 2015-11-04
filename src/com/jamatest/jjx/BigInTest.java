package com.jamatest.jjx;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigInTest {

	public static void main(String[] args) {
		BigDecimal bd1=new BigDecimal("10");
		BigDecimal bd2=new BigDecimal("6");
		System.out.println(bd1.divide(bd2, 1));
		BigDecimal bi=new BigDecimal("23360944815178189871471616329820911783024889832530979450588602887607050701536641198008556409187555576579788496056066546535418292151963652044213261241903665239766124829849040193397126590606074301080225767947975968881030084212760257019143684532375575427032");
		BigDecimal tempBigInteger=new BigDecimal("103144797123484263659365303277844541782875414489945082081113338438539334123110784029186789390587282225220051956415005737892765262510729093387583269718677230775699075567759621590463013863795035950354099219710748171675932258259587666362396217204074080602519096345257683018521521049256691770814861140401366115701554067501074224841254556418904308894169430675531138215159475649970805095531805620772929063170232772985041203167410986526934836481415512948416142098199059192617610838189.034679389661882447558317758121494341094558177910909598294986098402915925125363061011407976692641418649466442131512050630696601004268550800688300570948671288207715330252541400186880000000");
		long t0=System.currentTimeMillis();
		for(int i=0;i<3000000;i++)
		{
			BigInteger resultBigInteger=bi.divide(tempBigInteger,6).toBigInteger();
//			System.out.println(resultBigInteger.mod(new BigInteger("3")));
		}
		System.out.println(System.currentTimeMillis()-t0);
	}

}