class ExercicioDois {
    public static void resolve() {
        int[] numbers = ExercicioDois.getData();
        System.out.println("\tResposta questão a): " + BinarySearch.searchFor(numbers, 824));
        System.out.println("\tResposta questão b): " + BinarySearch.searchFor(numbers, 599));
        System.out.println("\tResposta questão c): " + BinarySearch.searchFor(numbers, 700));
        System.out.println("\tResposta questão d): " + BinarySearch.searchFor(numbers, 858));
        System.out.println("\tResposta questão e): " + BinarySearch.searchFor(numbers, 269));
        System.out.println("\tResposta questão f): " + BinarySearch.searchFor(numbers, 351));
        System.out.println("\tResposta questão g): " + BinarySearch.searchFor(numbers, 42));
        System.out.println("\tResposta questão h): " + BinarySearch.searchFor(numbers, 317));
        System.out.println("\tResposta questão i): " + BinarySearch.searchFor(numbers, 525));
        System.out.println("\tResposta questão j): " + BinarySearch.searchFor(numbers, 550));
        System.out.println("\tResposta questão k): " + BinarySearch.searchFor(numbers, 143));
        System.out.println("\tResposta questão l): " + BinarySearch.searchFor(numbers, 421));
        System.out.println("\tResposta questão m): " + BinarySearch.searchFor(numbers, 422));

    }

    private static int[] getData() {
        int[] response = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
                178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
                243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
                317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
                396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
                443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
                525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
                626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
                723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
                824, 826, 832, 848, 854, 856, 858, 867, 873, 880
        };
        ;
        return response;
    }
}