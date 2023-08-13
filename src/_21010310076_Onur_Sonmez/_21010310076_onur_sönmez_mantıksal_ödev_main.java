package _21010310076_Onur_Sonmez;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _21010310076_onur_sönmez_mantıksal_ödev_main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> satirListesi = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		System.out.println("karnaugh.txt dosyası okundu");
		String dosyaYolu = "karnaugh.txt";
		char[] chars = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));

			String satir = br.readLine();
			int satırsayacı = 0;
			while (satir != null) {
				satırsayacı++;
				satirListesi.add(satir);
				sb.append(satir);
				chars = sb.toString().toCharArray();
				satir = br.readLine();
			}
			br.close();

			if (satırsayacı == 2) {
				String[] satirDizisi3lü = satirListesi.toArray(new String[0]);
				List<String> minterm_listesi = new ArrayList<>();
				List<String> maxterm_listesi = new ArrayList<>();
				List<String> Ftersimintermlistesi = new ArrayList<>();
				List<String> Ftersimaxtermlistesi = new ArrayList<>();
				System.out.println("A       " + "B       " + "C       	" + "F mi");
				for (int i = 0; i < satirDizisi3lü.length; i++) {

					// System.out.println("Dizinin "+(i+1)+"."+"satırı "+satirDizisi[i]);
					if (i == 0) {
						String[] birincisatırbolumu = satirDizisi3lü[i].split(" ");

						System.out.println("0	0	0	" + "	" + birincisatırbolumu[0] + " m0");
						if (birincisatırbolumu[0].equals("1")) {
							minterm_listesi.add("A'B'C'");
							Ftersimaxtermlistesi.add("A+B+C");
						} else {
							Ftersimintermlistesi.add("A'B'C'");
							maxterm_listesi.add("A+B+C");
						}

						System.out.println("0	0	1	" + "	" + birincisatırbolumu[1] + " m1");
						if (birincisatırbolumu[1].equals("1")) {
							minterm_listesi.add("A'B'C");
							Ftersimaxtermlistesi.add("A+B+C'");
						} else {
							Ftersimintermlistesi.add("A'B'C");
							maxterm_listesi.add("A+B+C'");
						}
						System.out.println("0	1	0	" + "	" + birincisatırbolumu[3] + " m2");
						if (birincisatırbolumu[3].equals("1")) {
							minterm_listesi.add("A'BC'");
							Ftersimaxtermlistesi.add("A+B'+C");

						} else {
							Ftersimintermlistesi.add("A'BC'");
							maxterm_listesi.add("A+B'+C");
						}
						System.out.println("0	1	1	" + "	" + birincisatırbolumu[2] + " m3");
						if (birincisatırbolumu[2].equals("1")) {
							minterm_listesi.add("A'BC");
							Ftersimaxtermlistesi.add("A+B'+C'");

						} else {
							Ftersimintermlistesi.add("A'BC");
							maxterm_listesi.add("A+B'+C'");
						}

					}
//					System.out.println(Ftersimaxtermlistesi.size());
					
					if (i == 1) {
						String[] ikincisatırbolumu = satirDizisi3lü[i].split(" ");

						System.out.println("1	0	0	" + "	" + ikincisatırbolumu[0] + " m4");
						if (ikincisatırbolumu[0].equals("1")) {
							minterm_listesi.add("AB'C'");
							Ftersimaxtermlistesi.add("A'+B+C");
						} else {
							maxterm_listesi.add("A'+B+C");
							Ftersimintermlistesi.add("AB'C'");
						}
						System.out.println("1	0	1	" + "	" + ikincisatırbolumu[1] + " m5");
						if (ikincisatırbolumu[1].equals("1")) {
							minterm_listesi.add("AB'C");
							Ftersimaxtermlistesi.add("A'+B+C'");
						} else {
							maxterm_listesi.add("A'+B+C'");
							Ftersimintermlistesi.add("AB'C");
						}
						System.out.println("1	1	0	" + "	" + ikincisatırbolumu[3] + " m6");
						if (ikincisatırbolumu[3].equals("1")) {
							minterm_listesi.add("ABC'");
							Ftersimaxtermlistesi.add("A'+B'+C");
						} else {
							maxterm_listesi.add("A'+B'+C");
							Ftersimintermlistesi.add("ABC'");
						}
						System.out.println("1	1	1	" + "	" + ikincisatırbolumu[2] + " m7");
						if (ikincisatırbolumu[2].equals("1")) {
							minterm_listesi.add("ABC");
							Ftersimaxtermlistesi.add("A'+B'+C'");
						} else {
							maxterm_listesi.add("A'+B'+C'");
							Ftersimintermlistesi.add("ABC");

						}
					}
				}
				System.out.println("fonksiyon ifadeleri :");

				System.out.print("F= " + "∑");
				for (int j = 0; j < minterm_listesi.size(); j++) {
					System.out.print("(" + minterm_listesi.get(j) + ")" + "+");
				}
				System.out.println("                                        ");
				System.out.print("F=" + "∏");
				for (int j = 0; j < maxterm_listesi.size(); j++) {
					System.out.print("(" + maxterm_listesi.get(j) + ")" + "*");
				}

				System.out.println("                                        ");
				System.out.print("F'=" + "∑");
				for (int j = 0; j < Ftersimintermlistesi.size(); j++) {
					System.out.print("(" + Ftersimintermlistesi.get(j) + ")" + "+");
				}
//				System.out.println(Ftersimaxtermlistesi.size());
				System.out.println("");
				System.out.print("F'=" + "∏");
				for (int k = 0; k< Ftersimaxtermlistesi.size(); k++) {
					System.out.print("(" + Ftersimaxtermlistesi.get(k) + ")" + "+");
				}
						}


			// 3 değişkenli kodun bitişi
			// 4 değişkenli kodun başlangıcı

			if (satırsayacı == 4) {
				String[] satirDizisi = satirListesi.toArray(new String[0]);

				List<String> minterm_listesi = new ArrayList<>();
				List<String> maxterm_listesi = new ArrayList<>();
				List<String> Ftersimintermlistesi = new ArrayList<>();
				List<String> Ftersimaxtermlistesi = new ArrayList<>();
				System.out.println("A	"+"B	"+"C	"+"D		"+"F"	 );   
				for (int i = 0; i < satirDizisi.length; i++) {

					// System.out.println("Dizinin "+(i+1)+"."+"satırı "+satirDizisi[i]);
					if (i == 0) {
						String[] birincisatırbolumu = satirDizisi[i].split(" ");

						System.out.println("0	0	0	0	" + "	" + birincisatırbolumu[0] + " m0");
						if (birincisatırbolumu[0].equals("1")) {
							minterm_listesi.add("A'B'C'D'");
							Ftersimaxtermlistesi.add("A+B+C+D");
						} else {
							Ftersimintermlistesi.add("A'B'C'D'");
							maxterm_listesi.add("A+B+C+D");
						}

						System.out.println("0	0	0	1	" + "	" + birincisatırbolumu[1] + " m1");
						if (birincisatırbolumu[1].equals("1")) {
							Ftersimaxtermlistesi.add("A+B+C+D'");
							minterm_listesi.add("A'B'C'D");
						} else {
							Ftersimintermlistesi.add("A'B'C'D");
							maxterm_listesi.add("A+B+C+D'");
						}
						System.out.println("0	0	1	0	" + "	" + birincisatırbolumu[3] + " m2");
						if (birincisatırbolumu[3].equals("1")) {
							Ftersimaxtermlistesi.add("A+B+C'+D");
							minterm_listesi.add("A'B'C D'");

						} else {
							Ftersimintermlistesi.add("A'B'C D'");
							maxterm_listesi.add("A+B+C'+D");
						}
						System.out.println("0	0	1	1	" + "	" + birincisatırbolumu[2] + " m3");
						if (birincisatırbolumu[2].equals("1")) {
							Ftersimaxtermlistesi.add("A+B+C'+D'");
							minterm_listesi.add("A'B'CD");
							;
						} else {
							Ftersimintermlistesi.add("A'B'C D");
							maxterm_listesi.add("A+B+C'+D'");
						}

					}
					if (i == 1) {
						String[] ikincisatırbolumu = satirDizisi[i].split(" ");

						System.out.println("0	1	0	0	" + "	" + ikincisatırbolumu[0] + " m4");
						if (ikincisatırbolumu[0].equals("1")) {
							minterm_listesi.add("A'B C' D");
							Ftersimaxtermlistesi.add("A+B'+C+D");
						} else {
							maxterm_listesi.add("A+B'+C+D'");
							Ftersimintermlistesi.add("A'B C'D'");
						}
						System.out.println("0	1	0	1	" + "	" + ikincisatırbolumu[1] + " m5");
						if (ikincisatırbolumu[1].equals("1")) {
							minterm_listesi.add("A'B C'D");
							Ftersimaxtermlistesi.add("A+B'+C+D'");
						} else {
							maxterm_listesi.add("A+B'+C+D'");
							Ftersimintermlistesi.add("A'B C'D");
						}
						System.out.println("0	1	1	0	" + "	" + ikincisatırbolumu[3] + " m6");
						if (ikincisatırbolumu[3].equals("1")) {
							minterm_listesi.add("A'B C D'");
							Ftersimaxtermlistesi.add("A+B'+C'+D");
						} else {
							maxterm_listesi.add("A+B'+C'+D");
							Ftersimintermlistesi.add("A'B C D'");
						}
						System.out.println("0	1	1	1	" + "	" + ikincisatırbolumu[2] + " m7");
						if (ikincisatırbolumu[2].equals("1")) {
							minterm_listesi.add("A'B C D");
							Ftersimaxtermlistesi.add("A+B'+C'+D'");

						} else {
							Ftersimintermlistesi.add("A'B C D ");
							maxterm_listesi.add("A+B'+C+D");
						}
					}
					if (i == 2) {
						String[] ucuncusatırbolumu = satirDizisi[i].split(" ");
						System.out.println("1	1	0	0	" + "	" + ucuncusatırbolumu[0] + " m12");
						if (ucuncusatırbolumu[0].equals("1")) {
							minterm_listesi.add("A B C' D'");
							Ftersimaxtermlistesi.add("A'+B'+C+D");
						} else {
							Ftersimintermlistesi.add("A B C'D'");
							maxterm_listesi.add("A'+B'+C+D");
						}
						System.out.println("1	1	0	1	" + "	" + ucuncusatırbolumu[1] + " m13");
						if (ucuncusatırbolumu[1].equals("1")) {
							minterm_listesi.add("A B C' D'");
							Ftersimaxtermlistesi.add("A'+B'+C+D'");
						} else {
							Ftersimintermlistesi.add("A B C'D");
							maxterm_listesi.add("A'+B'+C+D");
						}
						System.out.println("1	1	1	0	" + "	" + ucuncusatırbolumu[3] + " m14");
						if (ucuncusatırbolumu[3].equals("1")) {
							Ftersimaxtermlistesi.add("A'+B'+C'+D");
							minterm_listesi.add("A B C D'");
						} else {
							Ftersimintermlistesi.add("A B C D'");
							maxterm_listesi.add("A'+B'+C+D");
						}
						System.out.println("1	1	1	1	" + "	" + ucuncusatırbolumu[2] + " m15");
						if (ucuncusatırbolumu[2].equals("1")) {
							minterm_listesi.add("A B C D");
							Ftersimaxtermlistesi.add("A'+B'+C'+D'");
						} else {
							Ftersimintermlistesi.add("A B C D");
							maxterm_listesi.add("A'+B'+C'+D'");
						}
					}

					if (i == 3) {
						String[] dortuncusatırbolumu = satirDizisi[i].split(" ");
						String[] takas = satirDizisi;
						String[] takassondurum = takas[i].split(" ");
						System.out.println("1	0	0	0	" + "	" + takassondurum[0] + " m8");
						if (takassondurum[0].equals("1")) {
							Ftersimaxtermlistesi.add("A'+B+C+D");
							minterm_listesi.add("A B' C' D'");
						} else {
							maxterm_listesi.add("A'+B+C+D");
							Ftersimintermlistesi.add("A B' C' D'");
						}
						System.out.println("1	0	0	1	" + "	" + takassondurum[1] + " m9");
						if (takassondurum[1].equals("1")) {
							minterm_listesi.add("A B' C' D");
							Ftersimaxtermlistesi.add("A'+B+C+D'");
						} else {
							maxterm_listesi.add("A'+B'C+D'");
							Ftersimintermlistesi.add("A+B'+C'+D");
						}
						System.out.println("1	0	1	0	" + "	" + takassondurum[0] + " m10");
						if (takassondurum[0].equals("1")) {
							minterm_listesi.add("A B' C D'");
							Ftersimaxtermlistesi.add("A'+B+C'+D");

						} else {
							maxterm_listesi.add("A'+B+C'+D");
							Ftersimintermlistesi.add("A B' C D'");
						}

						System.out.println("1	0	1	1	" + "	" + takassondurum[2] + " m11");
						if (takassondurum[2].equals("1")) {
							minterm_listesi.add("A B' C D ");
							Ftersimaxtermlistesi.add("A'+B+C'+D'");
						} else {
							maxterm_listesi.add("A'+B+C'+D'");

							Ftersimintermlistesi.add("A+B'+C+D'");
						}
						System.out.println("fonksiyon ifadeleri :");
						System.out.print("F= " + "∑");
						for (int j = 0; j < minterm_listesi.size(); j++) {
							System.out.print("(" + minterm_listesi.get(j) + ")" + "+");
						}
						System.out.println(" F fonksiyonunun minterm sayısı :" + minterm_listesi.size());
						System.out.print("F=" + "∏");
						for (int j = 0; j < maxterm_listesi.size(); j++) {
							System.out.print("(" + maxterm_listesi.get(j) + ")" + "*");
						}
						System.out.println(" F fonksiyonunun maxterm sayısı :" + maxterm_listesi.size());
						System.out.print("F' =" + "∑");
						for (int j = 0; j < Ftersimintermlistesi.size(); j++) {
							System.out.print("(" + Ftersimintermlistesi.get(j) + ")" + "+");
						}
						System.out.println(" F' fonksiyonunun minterm sayısı :" + Ftersimintermlistesi.size());
						System.out.print("F'=" + "∏");
						for (int j = 0; j < Ftersimaxtermlistesi.size(); j++) {
							System.out.print("(" + Ftersimaxtermlistesi.get(j) + ")" + "*");
						}
						System.out.println("F'" + "∏" + "fonksiyonunun maxterm sayısı :" + Ftersimaxtermlistesi.size());
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}