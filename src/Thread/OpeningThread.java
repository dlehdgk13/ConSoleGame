package Thread;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class OpeningThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String[] titles = new String[18];
		titles[0]="                                                                                                                                                                                            ";
		titles[1]="                             *                              *                                                                                                                               ";
		titles[2]="         *             *     *           * * * * * * * *    *                                    *                                                                           *              ";
		titles[3]="         *             *     *                         *    *               * * * * * *          *                                               * * * * * * * * * * *       *              ";
		titles[4]="         *             *     *                         *    *             *             *        *                                                                   *       *              ";
		titles[5]="         *             *     *                         *    *            *               *       *        *                        *                                 *       *              ";
		titles[6]="         *             *     *                         *    *           *                 *      *        *                        *                                 *       *              ";
		titles[7]="         * * * * * * * *     * * *       * * * * * * * *    * * *      *                   *     *        *                        *                                 *       *              ";
		titles[8]="         *             *     *           *                  *          *                   *     *        *                        *                                 *       * * *          "; 
		titles[9]="         *             *     *           *                  *           *                 *      *        *                        *             * * * * * * * * * * *       *              ";
		titles[10]="        *             *     *           *                  *            *               *       *        *                        * * *         *                           *              ";
		titles[11]="        * * * * * * * *     *           * * * * * * * *    *             *             *        *        *                        *             *                           *              ";
		titles[12]="                            *                              *               * * * * * *          *        *                        *             *                           *              ";
		titles[13]="                            *                              *                                    *        *                        *             *                           *              ";
		titles[14]="                                                                                                *        *                        *             *                           *              ";
		titles[15]="                                        * * * * * * * * * *         * * * * * * * * * * * * *   *        * * * * * * * * * * *    *             * * * * * * * * * * *       *              ";
		titles[16]="                                        *                 *                                                                       *                                         *              ";
		titles[17]="                                        *                 *                                                                                                                                ";
		titles[17]="                                        *                 *                                                                                                                                ";
		titles[17]="                                        * * * * * * * * * *                                                                                                                                ";
		for(int i=0; i<titles.length ;i++) {
			System.out.println(titles[i]);
			
			try {
				Thread.sleep(140);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0; i<60; i++) {
			System.out.println("");
		}	
	}
}
