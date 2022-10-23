impor  jawa . sql _ waktu ;

public  class  Jadwal {

    public  static  void  main ( String [] args ) {
        //Utama

        Mahasiswa  mhs = Mahasiswa baru  ( "Abi Fajarp" );
        mhs . info ();

        mhs = new  Dosen ( "Alun Sujjada M.Kom" );
        mhs . info ();

        mhs = new  Matkul ( "Pemrograman berorientasi Objek" );
        mhs . info ();

        waktu ( 100 );
        waktu ( "16 Desember 2022" );
        waktu ( "Rabu" , 7 , "Pagi" );
    }

    //kelebihan beban
    static  void  waktu ( int  Wkt ){
        Sistem . keluar . println ( "Waktu Kuliah/M \t : " + Wkt );
    }

    static  void  waktu ( String  Wkt ){
        Sistem . keluar . println ( "Pada Tanggal \t : " + Wkt );
    }

    static  void  waktu ( String  hari , int  Wkt , String  waktu ){
        Sistem . keluar . println ( "Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu );
    }


}
