package com.msa4java.edu.enumeration;

public enum Week { // ordinality 사용 지양
//    private Week MONDAY = new Week("월요일");
//    private Week TUESDAY = new Week("화요일");
//    private Week WEDNESDAY = new Week("수요일");
//    private Week THURSDAY = new Week("목요일");
//    private Week FRIDAY = new Week("금요일");
//    private Week SATURDAY = new Week("토요일");
//    private Week SUNDAY = new Week("일요일");
    MONDAY("월요일")
    , TUESDAY("화요일")
    , WEDNESDAY("수요일")
    , THURSDAY("목요일")
    , FRIDAY("금요일")
    , SATURDAY("토요일")
    , SUNDAY("일요일");

    private final String krDay;

    private Week(String day) {
        this.krDay = day;
    }

    public String getKrDay() {
        return this.krDay;
    } // getter
}

