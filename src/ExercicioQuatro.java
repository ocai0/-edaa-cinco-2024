class ExercicioQuatro {
    public static void resolve() {
        int[] numbers = ExercicioQuatro.getData();
        int andromedaStoreValue = 285964;
        System.out.println(
                "\tAndrômeda está localizada no guarda volume identificado por: "
                        + andromedaStoreValue + " "
                        + ", que está na posição: "
                        + BinarySearch.searchFor(numbers, andromedaStoreValue));
        int blackEyeGalaxyStoreValue = 199976;
        System.out.println(
                "\tGaláxia do Olho Negro está localizada no guarda volume identificado por: "
                        + blackEyeGalaxyStoreValue + " "
                        + ", que está na posição: "
                        + BinarySearch.searchFor(numbers, blackEyeGalaxyStoreValue));
        int haagObjectStoreValue = 323739;
        System.out.println(
                "\tObjeto de Haag está localizada no guarda volume identificado por: "
                        + haagObjectStoreValue + " "
                        + ", que está na posição: "
                        + BinarySearch.searchFor(numbers, haagObjectStoreValue));
    }

    private static int[] getData() {
        int[] response = {
                151776, 152300, 155442, 157142, 163507, 163640, 164704, 167856, 171261, 172759,
                172819, 176611, 176841, 181220, 182010, 182263, 182640, 183485, 183709, 183729,
                187385, 189081, 189987, 190516, 191425, 192104, 193248, 194061, 194885, 199351,
                199680, 199976, 203580, 204433, 207468, 208595, 209786, 210287, 212107, 212910,
                213527, 214902, 216434, 216795, 217235, 217732, 218264, 220040, 221466, 222316,
                222475, 222972, 223177, 223712, 224424, 225034, 225790, 225843, 225909, 229364,
                229952, 230341, 233353, 235556, 236432, 236680, 237040, 238624, 240216, 241670,
                241704, 242082, 243342, 246346, 246932, 249479, 249721, 249763, 250839, 251309,
                252089, 252896, 256853, 257858, 260728, 261132, 261381, 262088, 263112, 263250,
                264749, 265108, 266046, 268925, 269199, 269363, 270337, 272252, 272987, 278058,
                278081, 280420, 280611, 280849, 281551, 281634, 283741, 285964, 286510, 288440,
                291552, 292361, 292362, 294414, 295067, 298421, 299193, 299940, 300316, 303564,
                304565, 305355, 307158, 309834, 310921, 314242, 315346, 318755, 318860, 319134,
                321458, 323739, 323943, 323962, 326931, 327686, 327811, 333172, 334102, 335144,
                335463, 336382, 337430, 338039, 338675, 344144, 344372, 346603, 347953, 347999,

        };
        return response;
    }
}