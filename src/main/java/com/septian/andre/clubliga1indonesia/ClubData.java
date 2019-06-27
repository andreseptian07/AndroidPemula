package com.septian.andre.clubliga1indonesia;

import java.util.ArrayList;

class ClubData {
    private static String[][] dataClub = new String[][]{
            {"Arema FC", "Arema Football Club", "https://upload.wikimedia.org/wikipedia/en/e/ec/Arema_FC_2017_logo.png", "Singo Edan", "11 Agustus 1987", "Kanjuruhan", "Milomir Sesija", "Aremania"},
            {"Bali United FC", "Bali United Football Club", "https://upload.wikimedia.org/wikipedia/en/e/ee/Bali_United_logo.png", "Serdadu Tridatu \nJalak Bali", "15 Februari 2015", "Kapten I Wayan Dipta", "Stefano Cagurra", "Semeton Dewata \nNortside Boy \n Curvasud Dewata"},
            {"Bhayangkara FC", "Bhayangkara Football Club", "https://upload.wikimedia.org/wikipedia/en/7/77/Bhayangkara_FC_new_logo.png", "The Guardian", "8 September 2016", "PTIK", "Angel Alfredo Vera", "Bhara Mania"},
            {"Borneo FC", "Borneo Football Club", "https://upload.wikimedia.org/wikipedia/en/d/d2/Pusamania_Borneo_FC_logo.png", "Pesut Etam", "7 Maret 2014", "Segiri", "Mario Gomez", "Pusmania"},
            {"Kalteng Putra FC", "Kalimantan Tengah Football\nClub", "https://upload.wikimedia.org/wikipedia/en/c/cb/Persepar_palangkaraya.png", "Enggang Borneo \nLaskar Isen Mulang", "1 Januari 1970", "Tuah Pahoe", "Mario Gomez De /n De Olivera", "Kalman (Kalteng Mania) \nPasus 1970"},
            {"Madura United FC", "Madura United Football Club", "https://upload.wikimedia.org/wikipedia/en/9/9d/Madura_United_F.C._logo.png", "Laskar Sapeh Kerrab", "12 April 2015", "Gelora Ratu \nGelora Bangkalan", "Dejan Antonic", "-"},
            {"Persela Lamongan", "Persatuan Sepak Bola Lamongan", "https://upload.wikimedia.org/wikipedia/en/0/0c/Persela_newlogo.png", "Laskar Joko Tingkir \nLele Glagah", "18 April 1967", "Surajaya", "Aji Santoso", "LA MANIA \nCurva Boys 1967"},
            {"Badak Lampung FC", "Perseru Badak Lampung Football\nClub", "https://upload.wikimedia.org/wikipedia/en/1/1b/Badak_Lampung_FC_logo.png", "Laskar Saburai \nBadak Perkasa", "2019", "Sumpah Pemuda", "Jan Saragih", "-"},
            {"Persib Bandung", "Persatuan Sepak Bola Indonesia\nBandung", "https://upload.wikimedia.org/wikipedia/en/3/31/Persib_logo.png", "Maung Bandung \nPangeran Biru \nUsab Perning", "14 Maret 1933", "Gelora Bandung Lautan Api", "Robert Rene Alberts", "Bobotoh \nVPC \nBomber"},
            {"Persibaya Surabaya", "Persatuan Sepak Bola Surabaya", "https://upload.wikimedia.org/wikipedia/en/3/31/Persebaya_logo.png", "Bajul Ijo \nGreen Force", "18 Juni 1927", "Gelora Bung Tomo", "Djajang Nurjaman", "Bonek"},
            {"Persija Jakarta", "Persatuan Sepak Bola Indonesia\nJakarta", "https://upload.wikimedia.org/wikipedia/en/thumb/d/df/Persija_Jakarta.svg/256px-Persija_Jakarta.svg.png", "Macan Kemayoran", "28 November 1928", "Gelora Bung Karno", "Ivan Kolev", "The Jakmania"},
            {"Persipura Jayapura", "Persatuan Sepak Bola Indonesia\nJayapura", "https://upload.wikimedia.org/wikipedia/en/8/8b/Persipura_logo.png", "Mutiara Hitam", "1963", "Mandala", "Luciano Landero", "-"},
            {"PS Barito Putera", "Persatuan Sepak Bola Barito\nPutera", "https://upload.wikimedia.org/wikipedia/en/b/b8/Barito_Putera_logo.png", "Bakantan Hamuk \nLaskar Antasari", "21 Apil 1988", "17 Mei", "Jacksen Tiago", "Barito Mania"},
            {"PSIS Semarang", "Persatuan Sepak Bola Indonesia\nSemarang", "https://upload.wikimedia.org/wikipedia/en/3/35/PSIS_logo.png", "Laskar Mahesa Jenar \nLaskar Bumi Atlas", "18 Mei 1932", "Jatidiri", "Jafi Sastra", "Panser Biru \nSnex Mania"},
            {"PSM Makasar", "Persatuan Sepak Bola Makasar", "https://upload.wikimedia.org/wikipedia/en/2/26/PSM_Makassar_logo.png", "Juku Eja \nPasukan Ramang \nAyam Jantan dari Timur", "2 November 1915", "Andi Mattalatta", "Milomir Sesija", "-"},
            {"PSS Seleman", "Persatuan Sepak Bola Seleman", "https://upload.wikimedia.org/wikipedia/en/2/2e/Logo_PSS_Ring_Merah.png", "Super Elang Jawa \nLaskar Sembada", "20 Mei 1967", "Maguwoharjo", "Seto Nurdiyanto", "Slemania \nBigata Curva Sud"},
            {"Tira-Persikabo", "Tentara Indonesia dan Rakyat\nPersatuan Sepak Bola Kabupaten\nBogor", "https://upload.wikimedia.org/wikipedia/en/a/a3/TIRA-Persikabo_official_logo.png", "Laskar Padjajaran", "2019", "Pakansari", "Rahmat Darmawan", "Kebomania"},
            {"Semen Padang FC", "Semen Padang Football Club", "https://upload.wikimedia.org/wikipedia/en/1/1e/Semen_Padang_FC.png", "Kabau Sirah", "30 November 1980", "Gor Haji Agus Salim", "Syafianto Rusli", "Spartacks \nThe Kemers \nUltras West Sumatera"}
    };


    static ArrayList<Club> getListData() {
        Club club = null;
        ArrayList<Club> list = new ArrayList<>();
        for (String[] aData : dataClub) {
            club = new Club();
            club.setClubName(aData[0]);
            club.setClubNameDetail(aData[1]);
            club.setLogo(aData[2]);
            club.setNickname(aData[3]);
            club.setBorn(aData[4]);
            club.setStadium(aData[5]);
            club.setCoach(aData[6]);
            club.setSupporters(aData[7]);

            list.add(club);

        }
        return list;
    }

}
