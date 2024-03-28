class ExercicioUm {
    public static void resolve() {
        int[] numbers = ExercicioUm.getData();
        System.out.println("\tResposta questão a): " + BinarySearch.searchFor(numbers, 415));
        System.out.println("\tResposta questão b): " + BinarySearch.searchFor(numbers, 545));
        System.out.println("\tResposta questão c): " + BinarySearch.searchFor(numbers, 390));
        System.out.println("\tResposta questão d): " + BinarySearch.searchFor(numbers, 609));
        System.out.println("\tResposta questão e): " + BinarySearch.searchFor(numbers, 296));
    }

    private static int[] getData() {
        int[] result = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
                306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
                355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
                391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
                429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
                483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
                511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
                554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
                613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
                652, 654, 655, 662, 667, 671, 673, 674, 695, 696
        };

        return result;
    }
}