package com.example.homemed;

import android.widget.CheckBox;

import java.util.concurrent.ScheduledExecutorService;

public class Ligos {
    int id;
    String liga;
    CheckBox chec_akiu_burnos_sausumas, check_kosulys, check_skrepliavimas, check_sloga, check_vemimas, check_viduriavimas, check_viduriu_uzkietejimas, check_pilvo_putimas, check_padid_temp;
    CheckBox check_niezulys, check_kuno_berimas, check_akiu_paraudimas, check_mieguistumas, check_pykinimas, check_kraujavimas, check_dusulys, check_bendras_silpnumas;
    CheckBox check_burnos_sk, check_krutines_sk, check_des_pas_sk, check_galvos_sk, check_juosmens_sk, check_pilvo_sk, check_skrandzio_zarnyno_sk, check_kaulu_sk, check_sanariu_sk, check_raumenu_sk,  check_sanariu_ribotumas;
    CheckBox check_remuo, check_rijimo_sutr, check_slapimo_sutr, check_regos_sutrikimas, check_mirgejimas_akyse, check_skonio_pokyciai, check_emociju_mastymo_sutrikimai, check_uzimas_ausyse, check_drebulys, check_apetito_pablogejimas, check_svokstimas_krutineje, check_kuno_mases_padidejimas, check_ugio_kuno_proporcciju_pokyciai, check_odos_gleiviniu_pageltimai, check_odos_gleiviniu_pabrinkimai, check_suliesejimas;



    public Ligos( String liga,CheckBox chec_akiu_burnos_sausumas, CheckBox check_akiu_paraudimas,CheckBox check_bendras_silpnumas, CheckBox check_apetito_pablogejimas, CheckBox check_dusulys, CheckBox check_kosulys, CheckBox check_kraujavimas, CheckBox check_kuno_berimas, CheckBox check_mieguistumas, CheckBox check_niezulys, CheckBox check_padid_temp, CheckBox check_pilvo_putimas, CheckBox check_pykinimas, CheckBox check_skrepliavimas, CheckBox check_sloga, CheckBox check_vemimas, CheckBox check_viduriavimas, CheckBox check_viduriu_uzkietejimas, CheckBox check_burnos_sk, CheckBox check_des_pas_sk, CheckBox check_drebulys, CheckBox check_emociju_mastymo_sutrikimai, CheckBox check_galvos_sk, CheckBox check_juosmens_sk, CheckBox check_kaulu_sk, CheckBox check_krutines_sk, CheckBox check_kuno_mases_padidejimas, CheckBox check_mirgejimas_akyse, CheckBox check_odos_gleiviniu_pabrinkimai, CheckBox check_odos_gleiviniu_pageltimai, CheckBox check_pilvo_sk, CheckBox check_raumenu_sk, CheckBox check_regos_sutrikimas, CheckBox check_remuo, CheckBox check_rijimo_sutr, CheckBox check_sanariu_ribotumas, CheckBox check_sanariu_sk, CheckBox check_skonio_pokyciai, CheckBox check_skrandzio_zarnyno_sk, CheckBox check_slapimo_sutr, CheckBox check_suliesejimas, CheckBox check_svokstimas_krutineje, CheckBox check_ugio_kuno_proporcciju_pokyciai, CheckBox check_uzimas_ausyse){
        this.liga = liga;
        this.chec_akiu_burnos_sausumas =chec_akiu_burnos_sausumas;
        this.check_akiu_paraudimas = check_akiu_paraudimas;
        this.check_bendras_silpnumas= check_bendras_silpnumas;
        this.check_apetito_pablogejimas = check_apetito_pablogejimas;
        this.check_dusulys = check_dusulys;
        this.check_kosulys = check_kosulys;
        this.check_kraujavimas = check_kraujavimas;
        this.check_kuno_berimas = check_kuno_berimas;
        this.check_mieguistumas = check_mieguistumas;
        this.check_niezulys = check_niezulys;
        this.check_padid_temp = check_padid_temp;
        this.check_pilvo_putimas = check_pilvo_putimas;
        this.check_pykinimas = check_pykinimas;
        this.check_skrepliavimas = check_skrepliavimas;
        this.check_sloga = check_sloga;
        this.check_vemimas = check_vemimas;
        this.check_viduriavimas = check_viduriavimas;
        this.check_viduriu_uzkietejimas = check_viduriu_uzkietejimas;
        this.check_burnos_sk = check_burnos_sk;
        this.check_des_pas_sk = check_des_pas_sk;
        this.check_drebulys=check_drebulys;
        this.check_emociju_mastymo_sutrikimai=check_emociju_mastymo_sutrikimai;
        this.check_galvos_sk = check_galvos_sk;
        this.check_juosmens_sk =check_juosmens_sk;
        this.check_kaulu_sk=check_kaulu_sk;
        this.check_krutines_sk=check_krutines_sk;
        this.check_kuno_mases_padidejimas=check_kuno_mases_padidejimas;
        this.check_mirgejimas_akyse=check_mirgejimas_akyse;
        this.check_odos_gleiviniu_pabrinkimai=check_odos_gleiviniu_pabrinkimai;
        this.check_odos_gleiviniu_pageltimai=check_odos_gleiviniu_pageltimai;
        this.check_pilvo_sk=check_pilvo_sk;
        this.check_raumenu_sk=check_raumenu_sk;
        this.check_regos_sutrikimas=check_regos_sutrikimas;
        this.check_remuo=check_remuo;
        this.check_rijimo_sutr=check_rijimo_sutr;
        this.check_sanariu_ribotumas=check_sanariu_ribotumas;
        this.check_sanariu_sk=check_sanariu_sk;
        this.check_skonio_pokyciai=check_skonio_pokyciai;
        this.check_skrandzio_zarnyno_sk=check_skrandzio_zarnyno_sk;
        this.check_slapimo_sutr=check_slapimo_sutr;
        this.check_suliesejimas=check_suliesejimas;
        this.check_svokstimas_krutineje=check_svokstimas_krutineje;
        this.check_ugio_kuno_proporcciju_pokyciai=check_ugio_kuno_proporcciju_pokyciai;
        this.check_uzimas_ausyse=check_uzimas_ausyse;
    }
    public Ligos(int id, String liga, CheckBox chec_akiu_burnos_sausumas, CheckBox check_akiu_paraudimas,CheckBox check_bendras_silpnumas, CheckBox check_apetito_pablogejimas, CheckBox check_dusulys, CheckBox check_kosulys, CheckBox check_kraujavimas, CheckBox check_kuno_berimas, CheckBox check_mieguistumas, CheckBox check_niezulys, CheckBox check_padid_temp, CheckBox check_pilvo_putimas, CheckBox check_pykinimas, CheckBox check_skrepliavimas, CheckBox check_sloga, CheckBox check_vemimas, CheckBox check_viduriavimas, CheckBox check_viduriu_uzkietejimas, CheckBox check_burnos_sk, CheckBox check_des_pas_sk, CheckBox check_drebulys, CheckBox check_emociju_mastymo_sutrikimai, CheckBox check_galvos_sk, CheckBox check_juosmens_sk, CheckBox check_kaulu_sk, CheckBox check_krutines_sk, CheckBox check_kuno_mases_padidejimas, CheckBox check_mirgejimas_akyse, CheckBox check_odos_gleiviniu_pabrinkimai, CheckBox check_odos_gleiviniu_pageltimai, CheckBox check_pilvo_sk, CheckBox check_raumenu_sk, CheckBox check_regos_sutrikimas, CheckBox check_remuo, CheckBox check_rijimo_sutr, CheckBox check_sanariu_ribotumas, CheckBox check_sanariu_sk, CheckBox check_skonio_pokyciai, CheckBox check_skrandzio_zarnyno_sk, CheckBox check_slapimo_sutr, CheckBox check_suliesejimas, CheckBox check_svokstimas_krutineje, CheckBox check_ugio_kuno_proporcciju_pokyciai, CheckBox check_uzimas_ausyse){
        this.id = id;
        this.liga = liga;
        this.chec_akiu_burnos_sausumas =chec_akiu_burnos_sausumas;
        this.check_akiu_paraudimas = check_akiu_paraudimas;
        this.check_bendras_silpnumas=check_bendras_silpnumas;
        this.check_apetito_pablogejimas = check_apetito_pablogejimas;
        this.check_dusulys = check_dusulys;
        this.check_kosulys = check_kosulys;
        this.check_kraujavimas = check_kraujavimas;
        this.check_kuno_berimas = check_kuno_berimas;
        this.check_mieguistumas = check_mieguistumas;
        this.check_niezulys = check_niezulys;
        this.check_padid_temp = check_padid_temp;
        this.check_pilvo_putimas = check_pilvo_putimas;
        this.check_pykinimas = check_pykinimas;
        this.check_skrepliavimas = check_skrepliavimas;
        this.check_sloga = check_sloga;
        this.check_vemimas = check_vemimas;
        this.check_viduriavimas = check_viduriavimas;
        this.check_viduriu_uzkietejimas = check_viduriu_uzkietejimas;
        this.check_burnos_sk = check_burnos_sk;
        this.check_des_pas_sk = check_des_pas_sk;
        this.check_drebulys=check_drebulys;
        this.check_emociju_mastymo_sutrikimai=check_emociju_mastymo_sutrikimai;
        this.check_galvos_sk = check_galvos_sk;
        this.check_juosmens_sk =check_juosmens_sk;
        this.check_kaulu_sk=check_kaulu_sk;
        this.check_krutines_sk=check_krutines_sk;
        this.check_kuno_mases_padidejimas=check_kuno_mases_padidejimas;
        this.check_mirgejimas_akyse=check_mirgejimas_akyse;
        this.check_odos_gleiviniu_pabrinkimai=check_odos_gleiviniu_pabrinkimai;
        this.check_odos_gleiviniu_pageltimai=check_odos_gleiviniu_pageltimai;
        this.check_pilvo_sk=check_pilvo_sk;
        this.check_raumenu_sk=check_raumenu_sk;
        this.check_regos_sutrikimas=check_regos_sutrikimas;
        this.check_remuo=check_remuo;
        this.check_rijimo_sutr=check_rijimo_sutr;
        this.check_sanariu_ribotumas=check_sanariu_ribotumas;
        this.check_sanariu_sk=check_sanariu_sk;
        this.check_skonio_pokyciai=check_skonio_pokyciai;
        this.check_skrandzio_zarnyno_sk=check_skrandzio_zarnyno_sk;
        this.check_slapimo_sutr=check_slapimo_sutr;
        this.check_suliesejimas=check_suliesejimas;
        this.check_svokstimas_krutineje=check_svokstimas_krutineje;
        this.check_ugio_kuno_proporcciju_pokyciai=check_ugio_kuno_proporcciju_pokyciai;
        this.check_uzimas_ausyse=check_uzimas_ausyse;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public CheckBox getChec_akiu_burnos_sausumas() {
        return chec_akiu_burnos_sausumas;
    }

    public void setChec_akiu_burnos_sausumas(CheckBox chec_akiu_burnos_sausumas) {
        this.chec_akiu_burnos_sausumas = chec_akiu_burnos_sausumas;
    }

    public CheckBox getCheck_kosulys() {
        return check_kosulys;
    }

    public void setCheck_kosulys(CheckBox check_kosulys) {
        this.check_kosulys = check_kosulys;
    }

    public CheckBox getCheck_skrepliavimas() {
        return check_skrepliavimas;
    }

    public void setCheck_skrepliavimas(CheckBox check_skrepliavimas) {
        this.check_skrepliavimas = check_skrepliavimas;
    }

    public CheckBox getCheck_sloga() {
        return check_sloga;
    }

    public void setCheck_sloga(CheckBox check_sloga) {
        this.check_sloga = check_sloga;
    }

    public CheckBox getCheck_vemimas() {
        return check_vemimas;
    }

    public void setCheck_vemimas(CheckBox check_vemimas) {
        this.check_vemimas = check_vemimas;
    }

    public CheckBox getCheck_viduriavimas() {
        return check_viduriavimas;
    }

    public void setCheck_viduriavimas(CheckBox check_viduriavimas) {
        this.check_viduriavimas = check_viduriavimas;
    }

    public CheckBox getCheck_viduriu_uzkietejimas() {
        return check_viduriu_uzkietejimas;
    }

    public void setCheck_viduriu_uzkietejimas(CheckBox check_viduriu_uzkietejimas) {
        this.check_viduriu_uzkietejimas = check_viduriu_uzkietejimas;
    }

    public CheckBox getCheck_pilvo_putimas() {
        return check_pilvo_putimas;
    }

    public void setCheck_pilvo_putimas(CheckBox check_pilvo_putimas) {
        this.check_pilvo_putimas = check_pilvo_putimas;
    }

    public CheckBox getCheck_padid_temp() {
        return check_padid_temp;
    }

    public void setCheck_padid_temp(CheckBox check_padid_temp) {
        this.check_padid_temp = check_padid_temp;
    }

    public CheckBox getCheck_niezulys() {
        return check_niezulys;
    }

    public void setCheck_niezulys(CheckBox check_niezulys) {
        this.check_niezulys = check_niezulys;
    }

    public CheckBox getCheck_kuno_berimas() {
        return check_kuno_berimas;
    }

    public void setCheck_kuno_berimas(CheckBox check_kuno_berimas) {
        this.check_kuno_berimas = check_kuno_berimas;
    }

    public CheckBox getCheck_akiu_paraudimas() {
        return check_akiu_paraudimas;
    }

    public void setCheck_akiu_paraudimas(CheckBox check_akiu_paraudimas) {
        this.check_akiu_paraudimas = check_akiu_paraudimas;
    }

    public CheckBox getCheck_mieguistumas() {
        return check_mieguistumas;
    }

    public void setCheck_mieguistumas(CheckBox check_mieguistumas) {
        this.check_mieguistumas = check_mieguistumas;
    }

    public CheckBox getCheck_pykinimas() {
        return check_pykinimas;
    }

    public void setCheck_pykinimas(CheckBox check_pykinimas) {
        this.check_pykinimas = check_pykinimas;
    }

    public CheckBox getCheck_kraujavimas() {
        return check_kraujavimas;
    }

    public void setCheck_kraujavimas(CheckBox check_kraujavimas) {
        this.check_kraujavimas = check_kraujavimas;
    }

    public CheckBox getCheck_dusulys() {
        return check_dusulys;
    }

    public void setCheck_dusulys(CheckBox check_dusulys) {
        this.check_dusulys = check_dusulys;
    }

    public CheckBox getCheck_bendras_silpnumas() {
        return check_bendras_silpnumas;
    }

    public void setCheck_bendras_silpnumas(CheckBox check_bendras_silpnumas) {
        this.check_bendras_silpnumas = check_bendras_silpnumas;
    }

    public CheckBox getCheck_burnos_sk() {
        return check_burnos_sk;
    }

    public void setCheck_burnos_sk(CheckBox check_burnos_sk) {
        this.check_burnos_sk = check_burnos_sk;
    }


    public CheckBox getCheck_krutines_sk() {
        return check_krutines_sk;
    }

    public void setCheck_krutines_sk(CheckBox check_krutines_sk) {
        this.check_krutines_sk = check_krutines_sk;
    }

    public CheckBox getCheck_des_pas_sk() {
        return check_des_pas_sk;
    }

    public void setCheck_des_pas_sk(CheckBox check_des_pas_sk) {
        this.check_des_pas_sk = check_des_pas_sk;
    }

    public CheckBox getCheck_galvos_sk() {
        return check_galvos_sk;
    }

    public void setCheck_galvos_sk(CheckBox check_galvos_sk) {
        this.check_galvos_sk = check_galvos_sk;
    }

    public CheckBox getCheck_juosmens_sk() {
        return check_juosmens_sk;
    }

    public void setCheck_juosmens_sk(CheckBox check_juosmens_sk) {
        this.check_juosmens_sk = check_juosmens_sk;
    }

    public CheckBox getCheck_pilvo_sk() {
        return check_pilvo_sk;
    }

    public void setCheck_pilvo_sk(CheckBox check_pilvo_sk) {
        this.check_pilvo_sk = check_pilvo_sk;
    }

    public CheckBox getCheck_skrandzio_zarnyno_sk() {
        return check_skrandzio_zarnyno_sk;
    }

    public void setCheck_skrandzio_zarnyno_sk(CheckBox check_skrandzio_zarnyno_sk) {
        this.check_skrandzio_zarnyno_sk = check_skrandzio_zarnyno_sk;
    }

    public CheckBox getCheck_kaulu_sk() {
        return check_kaulu_sk;
    }

    public void setCheck_kaulu_sk(CheckBox check_kaulu_sk) {
        this.check_kaulu_sk = check_kaulu_sk;
    }

    public CheckBox getCheck_sanariu_sk() {
        return check_sanariu_sk;
    }

    public void setCheck_sanariu_sk(CheckBox check_sanariu_sk) {
        this.check_sanariu_sk = check_sanariu_sk;
    }

    public CheckBox getCheck_raumenu_sk() {
        return check_raumenu_sk;
    }

    public void setCheck_raumenu_sk(CheckBox check_raumenu_sk) {
        this.check_raumenu_sk = check_raumenu_sk;
    }



    public CheckBox getCheck_sanariu_ribotumas() {
        return check_sanariu_ribotumas;
    }

    public void setCheck_sanariu_ribotumas(CheckBox check_sanariu_ribotumas) {
        this.check_sanariu_ribotumas = check_sanariu_ribotumas;
    }

    public CheckBox getCheck_remuo() {
        return check_remuo;
    }

    public void setCheck_remuo(CheckBox check_remuo) {
        this.check_remuo = check_remuo;
    }

    public CheckBox getCheck_rijimo_sutr() {
        return check_rijimo_sutr;
    }

    public void setCheck_rijimo_sutr(CheckBox check_rijimo_sutr) {
        this.check_rijimo_sutr = check_rijimo_sutr;
    }

    public CheckBox getCheck_slapimo_sutr() {
        return check_slapimo_sutr;
    }

    public void setCheck_slapimo_sutr(CheckBox check_slapimo_sutr) {
        this.check_slapimo_sutr = check_slapimo_sutr;
    }

    public CheckBox getCheck_regos_sutrikimas() {
        return check_regos_sutrikimas;
    }

    public void setCheck_regos_sutrikimas(CheckBox check_regos_sutrikimas) {
        this.check_regos_sutrikimas = check_regos_sutrikimas;
    }

    public CheckBox getCheck_mirgejimas_akyse() {
        return check_mirgejimas_akyse;
    }

    public void setCheck_mirgejimas_akyse(CheckBox check_mirgejimas_akyse) {
        this.check_mirgejimas_akyse = check_mirgejimas_akyse;
    }

    public CheckBox getCheck_skonio_pokyciai() {
        return check_skonio_pokyciai;
    }

    public void setCheck_skonio_pokyciai(CheckBox check_skonio_pokyciai) {
        this.check_skonio_pokyciai = check_skonio_pokyciai;
    }

    public CheckBox getCheck_emociju_mastymo_sutrikimai() {
        return check_emociju_mastymo_sutrikimai;
    }

    public void setCheck_emociju_mastymo_sutrikimai(CheckBox check_emociju_mastymo_sutrikimai) {
        this.check_emociju_mastymo_sutrikimai = check_emociju_mastymo_sutrikimai;
    }

    public CheckBox getCheck_uzimas_ausyse() {
        return check_uzimas_ausyse;
    }

    public void setCheck_uzimas_ausyse(CheckBox check_uzimas_ausyse) {
        this.check_uzimas_ausyse = check_uzimas_ausyse;
    }

    public CheckBox getCheck_drebulys() {
        return check_drebulys;
    }

    public void setCheck_drebulys(CheckBox check_drebulys) {
        this.check_drebulys = check_drebulys;
    }

    public CheckBox getCheck_apetito_pablogejimas() {
        return check_apetito_pablogejimas;
    }

    public void setCheck_apetito_pablogejimas(CheckBox check_apetito_pablogejimas) {
        this.check_apetito_pablogejimas = check_apetito_pablogejimas;
    }

    public CheckBox getCheck_svokstimas_krutineje() {
        return check_svokstimas_krutineje;
    }

    public void setCheck_svokstimas_krutineje(CheckBox check_svokstimas_krutineje) {
        this.check_svokstimas_krutineje = check_svokstimas_krutineje;
    }

    public CheckBox getCheck_kuno_mases_padidejimas() {
        return check_kuno_mases_padidejimas;
    }

    public void setCheck_kuno_mases_padidejimas(CheckBox check_kuno_mases_padidejimas) {
        this.check_kuno_mases_padidejimas = check_kuno_mases_padidejimas;
    }

    public CheckBox getCheck_ugio_kuno_proporcciju_pokyciai() {
        return check_ugio_kuno_proporcciju_pokyciai;
    }

    public void setCheck_ugio_kuno_proporcciju_pokyciai(CheckBox check_ugio_kuno_proporcciju_pokyciai) {
        this.check_ugio_kuno_proporcciju_pokyciai = check_ugio_kuno_proporcciju_pokyciai;
    }

    public CheckBox getCheck_odos_gleiviniu_pageltimai() {
        return check_odos_gleiviniu_pageltimai;
    }

    public void setCheck_odos_gleiviniu_pageltimai(CheckBox check_odos_gleiviniu_pageltimai) {
        this.check_odos_gleiviniu_pageltimai = check_odos_gleiviniu_pageltimai;
    }

    public CheckBox getCheck_odos_gleiviniu_pabrinkimai() {
        return check_odos_gleiviniu_pabrinkimai;
    }

    public void setCheck_odos_gleiviniu_pabrinkimai(CheckBox check_odos_gleiviniu_pabrinkimai) {
        this.check_odos_gleiviniu_pabrinkimai = check_odos_gleiviniu_pabrinkimai;
    }

    public CheckBox getCheck_suliesejimas() {
        return check_suliesejimas;
    }

    public void setCheck_suliesejimas(CheckBox check_suliesejimas) {
        this.check_suliesejimas = check_suliesejimas;
    }
}
