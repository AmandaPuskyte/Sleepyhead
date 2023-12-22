package com.example.homemed;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.CheckBox;

import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class LigosHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="LIGOS";
    private static final String TABLE_CONTACTS="SIMPTOMAI";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="LIGA";
    private static final Boolean KEY_AKIU_BURNOS_SAUSUMAS=true;
    private static final Boolean KEY_KOSULYS=true;
    private static final Boolean KEY_SKREPLIAVIMAS=true;
    private static final Boolean KEY_SLOGA=true;
    private static final Boolean KEY_VEMIMAS=true;
    private static final Boolean KEY_VIDURIU_UZKIETEJIMAS=true;
    private static final Boolean KEY_PILVO_PUTIMAS=true;
    private static final Boolean KEY_PADIDEJUSI_TEMPERATURA=true;
    private static final Boolean KEY_VIDURIAVIMAS=true;
    private static final Boolean KEY_NIEZULYS=true;
    private static final Boolean KEY_KUNO_BERIMAS=true;
    private static final Boolean KEY_AKIU_PARAUDIMAS=true;
    private static final Boolean KEY_MIEGUISTUMAS=true;
    /*private static final Boolean KEY_PYKINIMAS=true;
    private static final Boolean KEY_KRAUJAVIMAS=true;
    private static final Boolean KEY_DUSULYS=true;
    private static final Boolean KEY_BENDRAS_SILPNUMAS=true;
    private static final Boolean KEY_BURNOS_SKAUSMAS=true;
    private static final Boolean KEY_KRUTINES_SKAUSMAS=true;
    private static final Boolean KEY_DESINES_PASONES_SKAUSMAS=true;
    private static final Boolean KEY_GALVOS_SKAUSMAS=true;
    private static final Boolean KEY_JUOSMENS_SKAUSMAS=true;
    private static final Boolean KEY_PILVO_SKAUSMAS=true;
    private static final Boolean KEY_SKRANDZIO_ZARNYNO_SKAUSMAS=true;
    private static final Boolean KEY_KAULU_SKAUSMAS=true;
    private static final Boolean KEY_SANARIU_SKAUSMAS=true;
    private static final Boolean KEY_RAUMENU_SKAUSMAS=true;
    private static final Boolean KEY_SANARIU_RIBOTUMAS=true;
    private static final Boolean KEY_REMUO=true;
    private static final Boolean KEY_RIJIMO_SUTRIKIMAS=true;
    private static final Boolean KEY_SLAPINIMOSI_SUTRIKIMAS=true;
    private static final Boolean KEY_REGOS_SUTRIKIMAS=true;
    private static final Boolean KEY_MIRGEJIMAS_AKYSE=true;
    private static final Boolean KEY_SKONIO_POKYČIAI=true;
    private static final Boolean KEY_EMOCIJU_MASTYMO_SUTRIKIMAI=true;
    private static final Boolean KEY_UZIMAS_AUSYSE=true;
    private static final Boolean KEY_DREBULYS=true;
    private static final Boolean KEY_APETITO_PABLOGEJIMAS=true;
    private static final Boolean KEY_SVOKSTIMAS_KRUTININĖJE=true;
    private static final Boolean KEY_KUNO_MASES_PADIDEJIMAS=true;
    private static final Boolean KEY_UGIO_KUNO_PROPORCIJU_POKYCIAI=true;
    private static final Boolean KEY_ODOS_GLEIVINIU_PAGELTIMAI=true;
    private static final Boolean KEY_ODOS_GLEIVINIU_PABRINKIMAI=true;*/
    private static final Boolean KEY_SULIESEJIMAS=true;


    public LigosHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_LIGOS_TABLE = "SUKURTI LENTELĘ"+TABLE_CONTACTS+"("+" LIGOS RAKTAS " +KEY_ID +" LIGOS PAVADINIMAS, "+ KEY_NAME +" AKIŲ IR BURNOS SKAUSMAS "
                + KEY_AKIU_BURNOS_SAUSUMAS + " KOSULYS "+ KEY_KOSULYS+ " SKREPLIAVIMAS "+ KEY_SKREPLIAVIMAS+" SLOGA " + KEY_SLOGA +" VĖMIMIMAS "
                + KEY_VEMIMAS+" VIDURIAVIMAS "+KEY_VIDURIAVIMAS+" VIDURIU UŽKIETĖJIMAS "+KEY_VIDURIU_UZKIETEJIMAS +" PILVO PŪTIMAS "+KEY_PILVO_PUTIMAS;
               /* +" PADIDĖJUSI TEMPERATŪRA "+KEY_PADIDEJUSI_TEMPERATURA+" NIEŽULYS  "+KEY_NIEZULYS+" KŪNO BĖRIMAS "+KEY_KUNO_BERIMAS+
                " AKIŲ PARAUDIMAS "+KEY_AKIU_PARAUDIMAS+ "MIEGUISTUMAS "+KEY_MIEGUISTUMAS+" PYKINIMAS "+KEY_PYKINIMAS+" KRAUJAVIMAS IŠ VIDAUS ORGANŲ "
                +KEY_KRAUJAVIMAS+" DUSULYS "+KEY_DUSULYS +" BENDRAS KŪNO SILPNUMAS"+KEY_BENDRAS_SILPNUMAS+" BURNOS SKAUSMAS "+KEY_BURNOS_SKAUSMAS
                +" KRŪTINĖS SKAUSMAS " +KEY_KRUTINES_SKAUSMAS+" SKAUSMAS DEŠINĖJE PAŠONĖJE "
                +" GALVOS SKAUSMAS "+KEY_GALVOS_SKAUSMAS+ " SKAUSMAS JUOSMENS SRITYJE "+KEY_JUOSMENS_SKAUSMAS+ "PILVO SKAUSMAS"
                +KEY_PILVO_SKAUSMAS+ "SKRANDŽIO IR ŽARNYNO SKAUSMAS "+KEY_SKRANDZIO_ZARNYNO_SKAUSMAS+" KAULŲ SKAUSMAS "+KEY_KAULU_SKAUSMAS+
                " SĄNARIŲ SKAUSMAS" +KEY_SANARIU_SKAUSMAS + " RAUMENŲ SKAUMAS "+KEY_RAUMENU_SKAUSMAS+" SĄNARIŲ JUDESIŲ RIBOTUMAS"+KEY_SANARIU_RIBOTUMAS
                + " RĖMUO "+KEY_REMUO+ " RIJIMO SUTRIKIMAS " +KEY_RIJIMO_SUTRIKIMAS+" ŠLAPINIMOSI SUTRIKIMAS "+KEY_SLAPINIMOSI_SUTRIKIMAS+ " REGOS SUTRIKIMAS "
                + KEY_REGOS_SUTRIKIMAS+" MIRGĖJIMAS AKYSE "+KEY_MIRGEJIMAS_AKYSE+ " SKONIO POKYČIAI " + KEY_SKONIO_POKYČIAI+ " EMOCIJŲ IR MĄSTYMO SUTRIKIMAS "
                + KEY_EMOCIJU_MASTYMO_SUTRIKIMAI + " ŪŽIMAS AUSYSE "+ KEY_UZIMAS_AUSYSE+ " DREBULYS " +KEY_DREBULYS+ " APETITO PABLOGĖJIMAS "
                + KEY_APETITO_PABLOGEJIMAS+ " ŠVOKŠTIMAS KRŪTINĖJE " + KEY_SVOKSTIMAS_KRUTININĖJE + " KŪNO MASĖS PADIDĖJIMAS " + KEY_KUNO_MASES_PADIDEJIMAS*/
               /* + " ŪGIO IR KŪNO PROPORCIJŲ POKYČIAI "+ KEY_UGIO_KUNO_PROPORCIJU_POKYCIAI + " ODOS IR GLEIVINIŲ PAGELTIMAI " + KEY_ODOS_GLEIVINIU_PAGELTIMAI
                + " ODOS IR GLEIVINIŲ PABRINKIMAI "+ KEY_ODOS_GLEIVINIU_PABRINKIMAI + " SULIESĖJIMAS " +KEY_SULIESEJIMAS;*/
        //db.execSQL(CREATE_LIGOS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("IŠMESTI LENTELĘ, JEI JI EGZISTUOJA "+TABLE_CONTACTS);
        onCreate(db);

    }
    void addContact(Ligos simptomai){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());
        values.put(KEY_NAME, simptomai.getLiga());

    }
}
