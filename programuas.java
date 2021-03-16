import java.util.*;
public class programuas{
	public static void main (String[]args){
	String data[]={"MULYA","202013038"}; 
	String nama,sandi;
	System.out.println("=====================================================");
	System.out.println("======= PROGRAM PERHITUNGAN LUAS BANGUN DATAR =======");
	System.out.println("=====================================================");
	Scanner apa=new Scanner(System.in);
	/*
	untuk login
	*/
	System.out.print("Nama Pengguna : ");
	nama=apa.nextLine();
	System.out.print("Sandi Pengguna : ");
	sandi=apa.nextLine();
	/*
	percabangan untuk login
	*/
	if(nama.equals(data[0])&&sandi.equals(data[1])){
	System.out.println("\t\t\t\t\t||======================================||");
	System.out.println("\t\t\t\t\t||  SELAMAT ANDA TELAH MASUK KE SISTEM  ||");
	System.out.println("\t\t\t\t\t||    PERHITUNGAN LUAS BANGUN DATAR     ||");
	System.out.println("\t\t\t\t\t||======================================||");
	menu1();//jika variabel nama samadengan variabel data indek 0(MULYA) dan variabel sandi samadengan variabel data indek ke 1 (202013038)maka pergi ke menu
	}else{
	System.out.println("\t\t\t\t\t||===============================================||");
	System.out.println("\t\t\t\t\t|| MAAF NAMA PENGGUNA ATAU SANDI TIDAK TERDAFTAR ||");
	System.out.println("\t\t\t\t\t||===============================================||");
	}
	} 
static void menu1(){
		System.out.println();
		String menu1[]={"Program","Keluar"};
		System.out.println("=================================");
		System.out.println("||  BERIKUT PILIHAN MENU UTAMA ||");
		System.out.println("=================================");
		System.out.println("\t1. "+menu1[0]);
		System.out.println("\t2. "+menu1[1]);
		Scanner pilihan1=new Scanner(System.in);
		int kamu;
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		kamu=pilihan1.nextInt();
		if(kamu==1){
			menu();}
		else{
			System.exit(0);
	}
}
static void menu(){ //funsi untuk menu
	System.out.println();
	System.out.println("\t\t\t\t\t\t==================================");
	System.out.println("\t\t\t\t\t\t|| Berikut Pilihan Bangun Datar ||");
	System.out.println("\t\t\t\t\t\t==================================");
	System.out.println("\t\t\t\t\t\t|| 1 . luas PERSEGI             ||"); // menu 1 merupakan pilihan mminuman
	System.out.println("\t\t\t\t\t\t|| 2 . luas PERSEGI PANJANG     ||"); //menu 2 merupakan pilihan makanan
	System.out.println("\t\t\t\t\t\t|| 3 . luas JAJARGENJANG        ||");
	System.out.println("\t\t\t\t\t\t|| 4 . luas SEGITIGA            ||");
	System.out.println("\t\t\t\t\t\t|| 5 . luas BELAH KETUPAT       ||");
	System.out.println("\t\t\t\t\t\t|| 6 . luas LAYANG-LAYANG       ||");
	System.out.println("\t\t\t\t\t\t|| 7 . luas TRAPESIUM           ||");
	System.out.println("\t\t\t\t\t\t|| 8 . luas LINGKARAN           ||");
	System.out.println("\t\t\t\t\t\t|| 9 . luas semua bangun datar  ||");
	System.out.println("\t\t\t\t\t\t|| 10. keluar dari program      ||");
	System.out.println("\t\t\t\t\t\t==================================");
	System.out.println();
	Scanner list=new Scanner(System.in); //buat variabel apa untuk fungsi Scannernya
	int menuutama;//variabel menu dengan tipe integer
	System.out.print("|| Silahkan pilih menu nomor berapa yang ingin di jalankan : "); //kita tampilkan kata"Silahkan Masukkan Menu: "
	System.out.print("||");
	menuutama=list.nextInt();

	/*
	fungsi if
	*/
	if(menuutama==1){
	persegi();}
	else if(menuutama==2){
	persegipanjang();}
	else if(menuutama==3){
	jajargenjang();}
	else if(menuutama==4){
	segitiga();}
	else if (menuutama==5){
	belahketupat();}
	else if (menuutama==6){
	layanglayang();}
	else if (menuutama==7){
	trapesium();}
	else if (menuutama==8){
	lingkaran();}
	else if (menuutama==9){
	semuabangundatar();}
	else {
	System.exit(0);}
}

static void persegi(){
		System.out.println("=========================================");
		System.out.println("||                                     ||");
		System.out.println("||       PERHITUNGAN LUAS PERSEGI      ||");
		System.out.println("||                                     ||");
		System.out.println("=========================================");
		System.out.println();
		Scanner persegi=new Scanner(System.in);
		Scanner plhn=new Scanner(System.in);
		float sisi,luasp;
		String pilihan;
		System.out.print("\tMasukkan Sisi = ");
		sisi=persegi.nextFloat();
		luasp=sisi*sisi;
		System.out.println("\tLuas Persegi = "+luasp);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=plhn.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
			menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}
}

static void persegipanjang(){
		System.out.println("=================================================");
		System.out.println("||                                             ||");
		System.out.println("||       PERHITUNGAN LUAS PERSEGI PANJANG      ||");
		System.out.println("||                                             ||");
		System.out.println("=================================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner plhn=new Scanner(System.in);
		float panjang,lebar,luaspp;
		String pilihan;
		System.out.print("\tMasukkan Nilai Panjang = ");
		panjang=pp.nextFloat();
		System.out.print("\tMasukkan nilai lebar = ");
		lebar=pp.nextFloat();
		luaspp=panjang*lebar;
		System.out.println("\tLuas Persegi Panjang = "+luaspp);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=plhn.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}
}

static void jajargenjang(){
		System.out.println("==============================================");
		System.out.println("||                                          ||");
		System.out.println("||       PERHITUNGAN LUAS JAJARGENJANG      ||");
		System.out.println("||                                          ||");
		System.out.println("==============================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner jjg=new Scanner(System.in);
		float luasjjg,a,t;
		String pilihan;
		System.out.print("\tMasukkan nilai alas Jajargenjang = ");
		a=pp.nextFloat();
		System.out.print("\tMasukkan nilai tinggi Jajargenjang = ");
		t=pp.nextFloat();
		luasjjg=a*t;
		System.out.println("\tLuas Jajargenjang = "+luasjjg);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=jjg.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}

}
static void segitiga(){
		System.out.println("==========================================");
		System.out.println("||                                      ||");
		System.out.println("||       PERHITUNGAN LUAS SEGITIGA      ||");
		System.out.println("||                                      ||");
		System.out.println("==========================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		float a,t;
		Double luass;
		String pilihan;
		System.out.print("\tMasukkan nilai alas Segitiga = ");
		a=pp.nextFloat();
		System.out.print("\tMasukkan nilai tinggi Segitiga= ");
		t=pp.nextFloat();
		luass=0.5*a*t;
		System.out.println("\tLuas Segitiga = "+luass);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=s.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}

}
static void belahketupat(){
		System.out.println("===============================================");
		System.out.println("||                                           ||");
		System.out.println("||       PERHITUNGAN LUAS BELAH KETUPAT      ||");
		System.out.println("||                                           ||");
		System.out.println("===============================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner bk=new Scanner(System.in);
		float d1,d2;
		Double luasbk;
		String pilihan;
		System.out.print("\tMasukkan nilai diagonal 1 belahketupat = ");
		d1=pp.nextFloat();
		System.out.print("\tMasukkan nilai diagonal 2 belahketupat = ");
		d2=pp.nextFloat();
		luasbk=0.5*d1*d2;
		System.out.println("\tLuas Belah Ketupat = "+luasbk);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=bk.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}

}
static void layanglayang(){
		System.out.println("===============================================");
		System.out.println("||                                           ||");
		System.out.println("||       PERHITUNGAN LUAS LAYANG-LAYANG      ||");
		System.out.println("||                                           ||");
		System.out.println("===============================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner ll=new Scanner(System.in);
		float d1,d2;
		Double luasll;
		String pilihan;
		System.out.print("\tMasukkan nilai diagonal 1 Layang-Layang = ");
		d1=pp.nextFloat();
		System.out.print("\tMasukkan nilai diagonal 2 Layang-Layang = ");
		d2=pp.nextFloat();
		luasll=0.5*d1*d2;
		System.out.println("\tLuas Layang-Layang = "+luasll);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=ll.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}

}
static void trapesium(){
		System.out.println("===========================================");
		System.out.println("||                                       ||");
		System.out.println("||       PERHITUNGAN LUAS TRAPESIUM      ||");
		System.out.println("||                                       ||");
		System.out.println("===========================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner tr=new Scanner(System.in);
		float luast,a,b,t;
		String pilihan;
		System.out.print("\tMasukkan nilai Sisi sejajar atas (a) trapesium = ");
		a=pp.nextFloat();
		System.out.print("\tMasukkan nilai Sisi sejajar bawah (b) trapesium  = ");
		b=pp.nextFloat();
		System.out.print("\tMasukkan nilai Tinggi trapesium  = ");
		t=pp.nextFloat();
		luast=(a+b/2)*t;
		System.out.println("\tLuas Belah Ketupat = "+luast);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=tr.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}

}
static void lingkaran(){
		System.out.println("===========================================");
		System.out.println("||                                       ||");
		System.out.println("||       PERHITUNGAN LUAS LINGKARAN      ||");
		System.out.println("||                                       ||");
		System.out.println("===========================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		Scanner li=new Scanner(System.in);
		Double luasl,r;
		String pilihan;
		System.out.print("\tMasukkan nilai Jari-jari Lingkaran = ");
		r=pp.nextDouble();
		luasl=3.14*r*r;
		System.out.println("\tLuas Lingkaran = "+luasl);
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=li.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
	}
}
static void semuabangundatar() {
		System.out.println("====================================================");
		System.out.println("||                                                ||");
		System.out.println("||       PERHITUNGAN LUAS SEMUA BANGUN DATAR      ||");
		System.out.println("||                                                ||");
		System.out.println("====================================================");
		System.out.println();

		//persegi
		System.out.println("=========================================");
		System.out.println("||                                     ||");
		System.out.println("||       PERHITUNGAN LUAS PERSEGI      ||");
		System.out.println("||                                     ||");
		System.out.println("=========================================");
		System.out.println();
		Scanner persegi=new Scanner(System.in);
		float sisi,luasp;
		System.out.print("\tMasukkan Sisi = ");
		sisi=persegi.nextFloat();
		luasp=sisi*sisi;
		System.out.print("\tLuas Persegi = "+luasp);
		System.out.println();
		System.out.println();


		//persegi panjang
		System.out.println("=================================================");
		System.out.println("||                                             ||");
		System.out.println("||       PERHITUNGAN LUAS PERSEGI PANJANG      ||");
		System.out.println("||                                             ||");
		System.out.println("=================================================");
		System.out.println();
		Scanner pp=new Scanner(System.in);
		float panjang,lebar,luaspp;
		System.out.print("\tMasukkan Nilai Panjang = ");
		panjang=pp.nextFloat();
		System.out.print("\tMasukkan nilai lebar = ");
		lebar=pp.nextFloat();
		luaspp=panjang*lebar;
		System.out.print("\tLuas Persegi Panjang = "+luaspp);
		System.out.println();
		System.out.println();


		//jajargenjang
		System.out.println("==============================================");
		System.out.println("||                                          ||");
		System.out.println("||       PERHITUNGAN LUAS JAJARGENJANG      ||");
		System.out.println("||                                          ||");
		System.out.println("==============================================");
		System.out.println();
		Scanner jjg=new Scanner(System.in);
		float luasjjg,aj,tj;
		System.out.print("\tMasukkan nilai alas Jajargenjang = ");
		aj=jjg.nextFloat();
		System.out.print("\tMasukkan nilai tinggi Jajargenjang = ");
		tj=jjg.nextFloat();
		luasjjg=aj*tj;
		System.out.print("\tLuas Jajargenjang = "+luasjjg);
		System.out.println();
		System.out.println();

		//segitiga
		System.out.println("==========================================");
		System.out.println("||                                      ||");
		System.out.println("||       PERHITUNGAN LUAS SEGITIGA      ||");
		System.out.println("||                                      ||");
		System.out.println("==========================================");
		System.out.println();
		Scanner s=new Scanner(System.in);
		float at,tt;
		Double luass;
		System.out.print("\tMasukkan nilai alas Segitiga = ");
		at=s.nextFloat();
		System.out.print("\tMasukkan nilai tinggi Segitiga= ");
		tt=s.nextFloat();
		luass=0.5*at*tt;
		System.out.print("\tLuas Segitiga = "+luass);
		System.out.println();
		System.out.println();

		//belah ketupat
		System.out.println("===============================================");
		System.out.println("||                                           ||");
		System.out.println("||       PERHITUNGAN LUAS BELAH KETUPAT      ||");
		System.out.println("||                                           ||");
		System.out.println("===============================================");
		System.out.println();
		Scanner bh=new Scanner(System.in);
		float d1b,d2b;
		Double luasbk;
		System.out.print("\tMasukkan nilai diagonal 1 belahketupat = ");
		d1b=bh.nextFloat();
		System.out.print("\tMasukkan nilai diagonal 2 belahketupat = ");
		d2b=bh.nextFloat();
		luasbk=0.5*d1b*d2b;
		System.out.print("\tLuas Belah Ketupat = "+luasbk);
		System.out.println();
		System.out.println();

		//layang-layang
		System.out.println("===============================================");
		System.out.println("||                                           ||");
		System.out.println("||       PERHITUNGAN LUAS LAYANG-LAYANG      ||");
		System.out.println("||                                           ||");
		System.out.println("===============================================");
		System.out.println();
		Scanner ll=new Scanner(System.in);
		float d1l,d2l;
		Double luasll;
		System.out.print("\tMasukkan nilai diagonal 1 Layang-Layang = ");
		d1l=ll.nextFloat();
		System.out.print("\tMasukkan nilai diagonal 2 Layang-Layang = ");
		d2l=ll.nextFloat();
		luasll=0.5*d1l*d2l;
		System.out.print("\tLuas Layang-Layang = "+luasll);
		System.out.println();
		System.out.println();

		//trapesium
		System.out.println("===========================================");
		System.out.println("||                                       ||");
		System.out.println("||       PERHITUNGAN LUAS TRAPESIUM      ||");
		System.out.println("||                                       ||");
		System.out.println("===========================================");
		System.out.println();
		Scanner tr=new Scanner(System.in);
		float b,atr,ttr,luast;
		System.out.print("\tMasukkan nilai Sisi sejajar atas (a) trapesium = ");
		atr=tr.nextFloat();
		System.out.print("\tMasukkan nilai Sisi sejajar bawah (b) trapesium  = ");
		b=tr.nextFloat();
		System.out.print("\tMasukkan nilai Tinggi trapesium  = ");
		ttr=tr.nextFloat();
		luast=(atr+b/2)*ttr;
		System.out.print("\tLuas Belah Ketupat = "+luast);
		System.out.println();
		System.out.println();

		//lingkaran
		System.out.println("===========================================");
		System.out.println("||                                       ||");
		System.out.println("||       PERHITUNGAN LUAS LINGKARAN      ||");
		System.out.println("||                                       ||");
		System.out.println("===========================================");
		System.out.println();
		Scanner l=new Scanner(System.in);
		Double luasl,r;
		System.out.print("\tMasukkan nilai Jari-jari Lingkaran = ");
		r=l.nextDouble();
		luasl=3.14*r*r;
		System.out.print("\tLuas Lingkaran = "+luasl);
		System.out.println();
		System.out.println();
		double luas[]={luasp,luaspp,luasjjg,luass,luasbk,luasll,luast,luasl};//array
		double tpenampungan=0;

	
					for(int i=0; i<(luas.length); i++){
						for(int j=0; j<(luas.length-1); j++){
						if(luas[j]>luas[j+1]){
						tpenampungan=luas[j];
						luas[j]=luas[j+1];
						luas[j+1]=tpenampungan;
					}
						System.out.print("Proses pengurutan hasil dari bangun datar yang ");
						System.out.print(j+1+" = ");
						for(int k=0; k<luas.length;k++){
						System.out.print(luas[k]+"  ");
					}
						System.out.println();
				}

					System.out.println();
					System.out.print("Hasil Nilai setelah di urutkan = {");
					for(int j=0; j<luas.length; j++){
					System.out.print(luas[j]+" , ");
					}
					System.out.print("}");
					System.out.println();



		Scanner li = new Scanner(System.in);
		String pilihan;
		System.out.println("Apakah anda ingin mengitung kembali ? (YA/TIDAK) ");
		pilihan=li.nextLine();
			if (pilihan.equals("YA")){
			menu();}
			if(pilihan.equals("Ya")){
			menu();}
			if (pilihan.equals("yA")){
				menu();}
			if (pilihan.equals("ya")){
			menu();}
			else{
			System.out.println();
			System.out.println();
			System.out.println("========================================================================");
			System.out.println("|| TERIMAKASIH SUDAH MENGGUNAKAN PROGRAM MENGHITUNG LUAS BANGUN DATAR ||");
			System.out.println("||                      SEMOGA HARIMU MENYENANGKAN                    ||");
			System.out.println("========================================================================");
			System.exit(0);
	}
}


}}